package com.equipmentrequirements;

import net.runelite.api.Skill;
import net.runelite.api.ItemID;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Arrays;
import com.equipmentrequirements.QuestRequirement;
import com.equipmentrequirements.Requirement;
import com.equipmentrequirements.SkillRequirement;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.io.InputStream;
import java.util.Map.Entry;
import java.util.ArrayList;

public class EquipmentRequirementsData
{
    public static final Map<String, List<Requirement>> ITEM_REQUIREMENTS = new HashMap<>();
    public static final Map<Integer, List<Requirement>> ITEM_REQUIREMENTS_BY_ID = new HashMap<>();

    private static class SkillEntry {
        int id;
        String skill;
        int level;
    }

    static {
        loadFromJson();
    }

    public static void loadFromJson() {
        Gson gson = new Gson();
        // Try loading from classpath root
        InputStream summaryStream = EquipmentRequirementsData.class.getClassLoader().getResourceAsStream("items-summary.json");
        if (summaryStream == null) {
            // Fallback to class resource lookup
            summaryStream = EquipmentRequirementsData.class.getResourceAsStream("/items-summary.json");
        }
        if (summaryStream == null) {
            // Try loading from package-specific path
            summaryStream = EquipmentRequirementsData.class.getClassLoader()
                .getResourceAsStream("com/equipmentrequirements/items-summary.json");
            if (summaryStream == null) {
                summaryStream = EquipmentRequirementsData.class
                    .getResourceAsStream("/com/equipmentrequirements/items-summary.json");
            }
        }
        InputStream skillStream = EquipmentRequirementsData.class.getClassLoader().getResourceAsStream("items-skill-requirements.json");
        if (skillStream == null) {
            skillStream = EquipmentRequirementsData.class.getResourceAsStream("/items-skill-requirements.json");
        }
        if (skillStream == null) {
            // Try loading from package-specific path
            skillStream = EquipmentRequirementsData.class.getClassLoader()
                .getResourceAsStream("com/equipmentrequirements/items-skill-requirements.json");
            if (skillStream == null) {
                skillStream = EquipmentRequirementsData.class
                    .getResourceAsStream("/com/equipmentrequirements/items-skill-requirements.json");
            }
        }

        if (summaryStream == null) {
            throw new RuntimeException("Resource items-summary.json not found in classpath");
        }
        if (skillStream == null) {
            throw new RuntimeException("Resource items-skill-requirements.json not found in classpath");
        }

        try (InputStreamReader summaryReader = new InputStreamReader(summaryStream);
             InputStreamReader skillReader = new InputStreamReader(skillStream)) {

            // Read summary JSON into a generic JsonElement
            JsonElement summaryElement = gson.fromJson(summaryReader, JsonElement.class);
            Map<Integer, String> idToName = new HashMap<>();
            if (summaryElement.isJsonObject()) {
                JsonObject summaryObj = summaryElement.getAsJsonObject();
                if (summaryObj.has("items") && summaryObj.get("items").isJsonArray()) {
                    // Format: { "items": [ { "id":123, "name":"Priest gown" }, ... ] }
                    JsonArray itemsArray = summaryObj.getAsJsonArray("items");
                    for (JsonElement elem : itemsArray) {
                        JsonObject obj = elem.getAsJsonObject();
                        int id = obj.get("id").getAsInt();
                        String name = obj.get("name").getAsString();
                        idToName.put(id, name);
                    }
                } else {
                    // Format: { "123": "Priest gown" } or { "123": { "name":"Priest gown", ... } }
                    for (Map.Entry<String, JsonElement> entry2 : summaryObj.entrySet()) {
                        int id = Integer.parseInt(entry2.getKey());
                        JsonElement val = entry2.getValue();
                        String name;
                        if (val.isJsonPrimitive()) {
                            name = val.getAsString();
                        } else if (val.isJsonObject() && val.getAsJsonObject().has("name")) {
                            name = val.getAsJsonObject().get("name").getAsString();
                        } else {
                            // Unknown format for this entry; skip it
                            continue;
                        }
                        idToName.put(id, name);
                    }
                }
            } else {
                throw new RuntimeException("Unexpected summary JSON format, expected object at root");
            }

            // Parse skill requirements JSON: expecting { "id": { "<skill>": <level>, ... }, ... }
            JsonElement skillsElement = gson.fromJson(skillReader, JsonElement.class);
            if (skillsElement.isJsonObject()) {
                JsonObject skillsObj = skillsElement.getAsJsonObject();
                for (Map.Entry<String, JsonElement> skillEntry : skillsObj.entrySet()) {
                    int id = Integer.parseInt(skillEntry.getKey());
                    JsonObject reqObj = skillEntry.getValue().getAsJsonObject();

                    List<Requirement> reqList = new ArrayList<>();
                    for (Map.Entry<String, JsonElement> reqEntry : reqObj.entrySet()) {
                        String skillKey = reqEntry.getKey().toUpperCase();
                        int level = reqEntry.getValue().getAsInt();
                        try {
                            Skill skill = Skill.valueOf(skillKey);
                            reqList.add(new SkillRequirement(skill, level));
                        } catch (IllegalArgumentException e) {
                            // Unknown skill key (e.g., "COMBAT"), skip this entry
                        }
                    }

                    String name = idToName.get(id);
                    if (name != null) {
                        ITEM_REQUIREMENTS.put(name, reqList);
                    }
                    ITEM_REQUIREMENTS_BY_ID.put(id, reqList);
                }
            } else {
                throw new RuntimeException("Unexpected skill JSON format, expected object at root");
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to load equipment requirements from JSON: " + e.getMessage(), e);
        }
    }
}