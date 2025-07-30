package com.equipmentrequirements;

import net.runelite.api.Skill;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Arrays;
import com.equipmentrequirements.QuestRequirement;

public class EquipmentRequirementsData
{
    public static final Map<String, List<Requirement>> ITEM_REQUIREMENTS = new HashMap<>();

    static
    {
        loadRequirements();
    }

    public static void loadRequirements()
    {
        ITEM_REQUIREMENTS.put("Priest gown", Arrays.asList(
                new QuestRequirement("Biohazard")
        ));

        ITEM_REQUIREMENTS.put("Priest gown", Arrays.asList(
                new QuestRequirement("Biohazard")
        ));

        ITEM_REQUIREMENTS.put("Pink boots", Arrays.asList(
                new QuestRequirement("The Grand Tree")
        ));

        ITEM_REQUIREMENTS.put("Green boots", Arrays.asList(
                new QuestRequirement("The Grand Tree")
        ));

        ITEM_REQUIREMENTS.put("Blue boots", Arrays.asList(
                new QuestRequirement("The Grand Tree")
        ));

        ITEM_REQUIREMENTS.put("Cream boots", Arrays.asList(
                new QuestRequirement("The Grand Tree")
        ));

        ITEM_REQUIREMENTS.put("Turquoise boots", Arrays.asList(
                new QuestRequirement("The Grand Tree")
        ));

        ITEM_REQUIREMENTS.put("Pink robe top", Arrays.asList(
                new QuestRequirement("The Grand Tree")
        ));

        ITEM_REQUIREMENTS.put("Green robe top", Arrays.asList(
                new QuestRequirement("The Grand Tree")
        ));

        ITEM_REQUIREMENTS.put("Blue robe top", Arrays.asList(
                new QuestRequirement("The Grand Tree")
        ));

        ITEM_REQUIREMENTS.put("Cream robe top", Arrays.asList(
                new QuestRequirement("The Grand Tree")
        ));

        ITEM_REQUIREMENTS.put("Turquoise robe top", Arrays.asList(
                new QuestRequirement("The Grand Tree")
        ));

        ITEM_REQUIREMENTS.put("Pink robe bottoms", Arrays.asList(
                new QuestRequirement("The Grand Tree")
        ));

        ITEM_REQUIREMENTS.put("Green robe bottoms", Arrays.asList(
                new QuestRequirement("The Grand Tree")
        ));

        ITEM_REQUIREMENTS.put("Blue robe bottoms", Arrays.asList(
                new QuestRequirement("The Grand Tree")
        ));

        ITEM_REQUIREMENTS.put("Cream robe bottoms", Arrays.asList(
                new QuestRequirement("The Grand Tree")
        ));

        ITEM_REQUIREMENTS.put("Turquoise robe bottoms", Arrays.asList(
                new QuestRequirement("The Grand Tree")
        ));

        ITEM_REQUIREMENTS.put("Pink hat", Arrays.asList(
                new QuestRequirement("The Grand Tree")
        ));

        ITEM_REQUIREMENTS.put("Green hat", Arrays.asList(
                new QuestRequirement("The Grand Tree")
        ));

        ITEM_REQUIREMENTS.put("Blue hat", Arrays.asList(
                new QuestRequirement("The Grand Tree")
        ));

        ITEM_REQUIREMENTS.put("Cream hat", Arrays.asList(
                new QuestRequirement("The Grand Tree")
        ));

        ITEM_REQUIREMENTS.put("Turquoise hat", Arrays.asList(
                new QuestRequirement("The Grand Tree")
        ));

        ITEM_REQUIREMENTS.put("Steel thrownaxe", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 5)
        ));

        ITEM_REQUIREMENTS.put("Mithril thrownaxe", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 20)
        ));

        ITEM_REQUIREMENTS.put("Adamant thrownaxe", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune thrownaxe", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 40)
        ));

        ITEM_REQUIREMENTS.put("Steel dart", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 5)
        ));

        ITEM_REQUIREMENTS.put("Mithril dart", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 20)
        ));

        ITEM_REQUIREMENTS.put("Adamant dart", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune dart", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 40)
        ));

        ITEM_REQUIREMENTS.put("Steel dart(p)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 5)
        ));

        ITEM_REQUIREMENTS.put("Mithril dart(p)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 20)
        ));

        ITEM_REQUIREMENTS.put("Adamant dart(p)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune dart(p)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 40)
        ));

        ITEM_REQUIREMENTS.put("Steel javelin", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 5)
        ));

        ITEM_REQUIREMENTS.put("Mithril javelin", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 20)
        ));

        ITEM_REQUIREMENTS.put("Adamant javelin", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune javelin", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 40)
        ));

        ITEM_REQUIREMENTS.put("Steel javelin(p)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 5)
        ));

        ITEM_REQUIREMENTS.put("Mithril javelin(p)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 20)
        ));

        ITEM_REQUIREMENTS.put("Adamant javelin(p)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune javelin(p)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 40)
        ));

        ITEM_REQUIREMENTS.put("Oak shortbow", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 5)
        ));

        ITEM_REQUIREMENTS.put("Oak longbow", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 5)
        ));

        ITEM_REQUIREMENTS.put("Willow longbow", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 20)
        ));

        ITEM_REQUIREMENTS.put("Willow shortbow", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 20)
        ));

        ITEM_REQUIREMENTS.put("Maple longbow", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 30)
        ));

        ITEM_REQUIREMENTS.put("Maple shortbow", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 30)
        ));

        ITEM_REQUIREMENTS.put("Yew longbow", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 40)
        ));

        ITEM_REQUIREMENTS.put("Yew shortbow", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 40)
        ));

        ITEM_REQUIREMENTS.put("Magic longbow", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 50)
        ));

        ITEM_REQUIREMENTS.put("Magic shortbow", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 50)
        ));

        ITEM_REQUIREMENTS.put("Steel knife", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 5)
        ));

        ITEM_REQUIREMENTS.put("Mithril knife", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 20)
        ));

        ITEM_REQUIREMENTS.put("Adamant knife", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune knife", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 40)
        ));

        ITEM_REQUIREMENTS.put("Black knife", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 10)
        ));

        ITEM_REQUIREMENTS.put("Steel knife(p)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 5)
        ));

        ITEM_REQUIREMENTS.put("Mithril knife(p)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 20)
        ));

        ITEM_REQUIREMENTS.put("Black knife(p)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 10)
        ));

        ITEM_REQUIREMENTS.put("Adamant knife(p)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune knife(p)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 40)
        ));

        ITEM_REQUIREMENTS.put("Steel arrow", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 5)
        ));

        ITEM_REQUIREMENTS.put("Steel arrow(p)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 5)
        ));

        ITEM_REQUIREMENTS.put("Mithril arrow", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 20)
        ));

        ITEM_REQUIREMENTS.put("Mithril arrow(p)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 20)
        ));

        ITEM_REQUIREMENTS.put("Adamant arrow", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 30)
        ));

        ITEM_REQUIREMENTS.put("Adamant arrow(p)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune arrow", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 40)
        ));

        ITEM_REQUIREMENTS.put("Rune arrow(p)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 40)
        ));

        ITEM_REQUIREMENTS.put("White apron", Arrays.asList(
                new QuestRequirement("Pirate's Treasure"),
                new QuestRequirement("Mourning's End Part I"),
                new QuestRequirement("Mourning's End Part II")
        ));

        ITEM_REQUIREMENTS.put("Pink skirt", Arrays.asList(
                new QuestRequirement("Prince Ali Rescue")
        ));

        ITEM_REQUIREMENTS.put("Green d'hide vambraces", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 40)
        ));

        ITEM_REQUIREMENTS.put("Steel platelegs", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 5)
        ));

        ITEM_REQUIREMENTS.put("Mithril platelegs", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20)
        ));

        ITEM_REQUIREMENTS.put("Adamant platelegs", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Black platelegs", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10)
        ));

        ITEM_REQUIREMENTS.put("Rune platelegs", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Steel plateskirt", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 5)
        ));

        ITEM_REQUIREMENTS.put("Mithril plateskirt", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20)
        ));

        ITEM_REQUIREMENTS.put("Black plateskirt", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10)
        ));

        ITEM_REQUIREMENTS.put("Adamant plateskirt", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune plateskirt", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Studded chaps", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 20)
        ));

        ITEM_REQUIREMENTS.put("Green d'hide chaps", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 40)
        ));

        ITEM_REQUIREMENTS.put("Steel chainbody", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 5)
        ));

        ITEM_REQUIREMENTS.put("Black chainbody", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10)
        ));

        ITEM_REQUIREMENTS.put("Mithril chainbody", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20)
        ));

        ITEM_REQUIREMENTS.put("Adamant chainbody", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune chainbody", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new QuestRequirement("Dragon Slayer I")
        ));

        ITEM_REQUIREMENTS.put("Steel platebody", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 5)
        ));

        ITEM_REQUIREMENTS.put("Mithril platebody", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20)
        ));

        ITEM_REQUIREMENTS.put("Adamant platebody", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Black platebody", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10)
        ));

        ITEM_REQUIREMENTS.put("Rune platebody", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new QuestRequirement("Dragon Slayer I")
        ));

        ITEM_REQUIREMENTS.put("Hardleather body", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10)
        ));

        ITEM_REQUIREMENTS.put("Studded body", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20),
                new SkillRequirement(Skill.RANGED, 20)
        ));

        ITEM_REQUIREMENTS.put("Green d'hide body", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 40),
                new QuestRequirement("Dragon Slayer I")
        ));

        ITEM_REQUIREMENTS.put("Steel med helm", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 5)
        ));

        ITEM_REQUIREMENTS.put("Mithril med helm", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20)
        ));

        ITEM_REQUIREMENTS.put("Adamant med helm", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune med helm", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Dragon med helm", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 60)
        ));

        ITEM_REQUIREMENTS.put("Black med helm", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10)
        ));

        ITEM_REQUIREMENTS.put("Steel full helm", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 5)
        ));

        ITEM_REQUIREMENTS.put("Mithril full helm", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20)
        ));

        ITEM_REQUIREMENTS.put("Adamant full helm", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune full helm", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Black full helm", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10)
        ));

        ITEM_REQUIREMENTS.put("Coif", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 20)
        ));

        ITEM_REQUIREMENTS.put("Steel sq shield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 5)
        ));

        ITEM_REQUIREMENTS.put("Black sq shield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10)
        ));

        ITEM_REQUIREMENTS.put("Mithril sq shield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20)
        ));

        ITEM_REQUIREMENTS.put("Adamant sq shield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune sq shield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Dragon sq shield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 60),
                new QuestRequirement("Legends' Quest")
        ));

        ITEM_REQUIREMENTS.put("Steel kiteshield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 5)
        ));

        ITEM_REQUIREMENTS.put("Black kiteshield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10)
        ));

        ITEM_REQUIREMENTS.put("Mithril kiteshield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20)
        ));

        ITEM_REQUIREMENTS.put("Adamant kiteshield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune kiteshield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Steel dagger", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 5)
        ));

        ITEM_REQUIREMENTS.put("Mithril dagger", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 20)
        ));

        ITEM_REQUIREMENTS.put("Adamant dagger", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune dagger", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40)
        ));

        ITEM_REQUIREMENTS.put("Dragon dagger", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 60),
                new QuestRequirement("Lost City")
        ));

        ITEM_REQUIREMENTS.put("Black dagger", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 10)
        ));

        ITEM_REQUIREMENTS.put("Steel dagger(p)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 5)
        ));

        ITEM_REQUIREMENTS.put("Mithril dagger(p)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 20)
        ));

        ITEM_REQUIREMENTS.put("Adamant dagger(p)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune dagger(p)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40)
        ));

        ITEM_REQUIREMENTS.put("Dragon dagger(p)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 60),
                new QuestRequirement("Lost City")
        ));

        ITEM_REQUIREMENTS.put("Black dagger(p)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 10)
        ));

        ITEM_REQUIREMENTS.put("Iron spear", Arrays.asList(
                new QuestRequirement("Tai Bwo Wannai Trio")
        ));

        ITEM_REQUIREMENTS.put("Steel spear", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 5),
                new QuestRequirement("Tai Bwo Wannai Trio")
        ));

        ITEM_REQUIREMENTS.put("Mithril spear", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 20)
        ));

        ITEM_REQUIREMENTS.put("Adamant spear", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune spear", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40)
        ));

        ITEM_REQUIREMENTS.put("Dragon spear", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 60)
        ));

        ITEM_REQUIREMENTS.put("Iron spear(p)", Arrays.asList(
                new QuestRequirement("Tai Bwo Wannai Trio")
        ));

        ITEM_REQUIREMENTS.put("Steel spear(p)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 5),
                new QuestRequirement("Tai Bwo Wannai Trio")
        ));

        ITEM_REQUIREMENTS.put("Mithril spear(p)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 20)
        ));

        ITEM_REQUIREMENTS.put("Adamant spear(p)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune spear(p)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40)
        ));

        ITEM_REQUIREMENTS.put("Dragon spear(p)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 60)
        ));

        ITEM_REQUIREMENTS.put("Steel pickaxe", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 5)
        ));

        ITEM_REQUIREMENTS.put("Adamant pickaxe", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 30)
        ));

        ITEM_REQUIREMENTS.put("Mithril pickaxe", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 20)
        ));

        ITEM_REQUIREMENTS.put("Rune pickaxe", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40),
                new QuestRequirement("Between a Rock...")
        ));

        ITEM_REQUIREMENTS.put("Steel sword", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 5)
        ));

        ITEM_REQUIREMENTS.put("Black sword", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 10)
        ));

        ITEM_REQUIREMENTS.put("Mithril sword", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 20)
        ));

        ITEM_REQUIREMENTS.put("Adamant sword", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune sword", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40)
        ));

        ITEM_REQUIREMENTS.put("Steel longsword", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 5)
        ));

        ITEM_REQUIREMENTS.put("Black longsword", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 10)
        ));

        ITEM_REQUIREMENTS.put("Mithril longsword", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 20)
        ));

        ITEM_REQUIREMENTS.put("Adamant longsword", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune longsword", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40)
        ));

        ITEM_REQUIREMENTS.put("Dragon longsword", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 60),
                new QuestRequirement("Lost City")
        ));

        ITEM_REQUIREMENTS.put("Steel 2h sword", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 5)
        ));

        ITEM_REQUIREMENTS.put("Black 2h sword", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 10),
                new QuestRequirement("Observatory Quest"),
                new QuestRequirement("Shades of Mort'ton")
        ));

        ITEM_REQUIREMENTS.put("Mithril 2h sword", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 20)
        ));

        ITEM_REQUIREMENTS.put("Adamant 2h sword", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune 2h sword", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40)
        ));

        ITEM_REQUIREMENTS.put("Steel scimitar", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 5)
        ));

        ITEM_REQUIREMENTS.put("Black scimitar", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 10)
        ));

        ITEM_REQUIREMENTS.put("Mithril scimitar", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 20)
        ));

        ITEM_REQUIREMENTS.put("Adamant scimitar", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune scimitar", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40)
        ));

        ITEM_REQUIREMENTS.put("Steel warhammer", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 5)
        ));

        ITEM_REQUIREMENTS.put("Black warhammer", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 10)
        ));

        ITEM_REQUIREMENTS.put("Mithril warhammer", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 20)
        ));

        ITEM_REQUIREMENTS.put("Adamant warhammer", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune warhammer", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40)
        ));

        ITEM_REQUIREMENTS.put("Steel axe", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 5)
        ));

        ITEM_REQUIREMENTS.put("Mithril axe", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 20)
        ));

        ITEM_REQUIREMENTS.put("Adamant axe", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune axe", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40)
        ));

        ITEM_REQUIREMENTS.put("Black axe", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 10)
        ));

        ITEM_REQUIREMENTS.put("Steel battleaxe", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 5)
        ));

        ITEM_REQUIREMENTS.put("Black battleaxe", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 10)
        ));

        ITEM_REQUIREMENTS.put("Mithril battleaxe", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 20)
        ));

        ITEM_REQUIREMENTS.put("Adamant battleaxe", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune battleaxe", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40)
        ));

        ITEM_REQUIREMENTS.put("Dragon battleaxe", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 60),
                new QuestRequirement("Heroes' Quest")
        ));

        ITEM_REQUIREMENTS.put("Mystic fire staff", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Mystic water staff", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Mystic air staff", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Mystic earth staff", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Steel mace", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 5)
        ));

        ITEM_REQUIREMENTS.put("Black mace", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 10),
                new QuestRequirement("Shades of Mort'ton")
        ));

        ITEM_REQUIREMENTS.put("Mithril mace", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 20)
        ));

        ITEM_REQUIREMENTS.put("Adamant mace", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune mace", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40)
        ));

        ITEM_REQUIREMENTS.put("Dragon mace", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 60),
                new QuestRequirement("Heroes' Quest")
        ));

        ITEM_REQUIREMENTS.put("Amulet of accuracy", Arrays.asList(
                new QuestRequirement("Imp Catcher")
        ));

        ITEM_REQUIREMENTS.put("Anti-dragon shield", Arrays.asList(
                new QuestRequirement("Dragon Slayer I")
        ));

        ITEM_REQUIREMENTS.put("Amulet of glory", Arrays.asList(
                new QuestRequirement("Dragon Slayer I"),
                new QuestRequirement("Heroes' Quest")
        ));

        ITEM_REQUIREMENTS.put("Amulet of glory(4)", Arrays.asList(
                new QuestRequirement("Dragon Slayer I"),
                new QuestRequirement("Heroes' Quest")
        ));

        ITEM_REQUIREMENTS.put("Unpowered symbol", Arrays.asList(
                new QuestRequirement("Observatory Quest")
        ));

        ITEM_REQUIREMENTS.put("Blue d'hide vambraces", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 50)
        ));

        ITEM_REQUIREMENTS.put("Red d'hide vambraces", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 60)
        ));

        ITEM_REQUIREMENTS.put("Black d'hide vambraces", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Blue d'hide chaps", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 50)
        ));

        ITEM_REQUIREMENTS.put("Red d'hide chaps", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 60)
        ));

        ITEM_REQUIREMENTS.put("Black d'hide chaps", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Blue d'hide body", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 50)
        ));

        ITEM_REQUIREMENTS.put("Red d'hide body", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 60)
        ));

        ITEM_REQUIREMENTS.put("Black d'hide body", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Ranger boots", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 40)
        ));

        ITEM_REQUIREMENTS.put("Wizard boots", Arrays.asList(
                new SkillRequirement(Skill.MAGIC, 20)
        ));

        ITEM_REQUIREMENTS.put("Robin hood hat", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 40)
        ));

        ITEM_REQUIREMENTS.put("Black platebody (t)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10)
        ));

        ITEM_REQUIREMENTS.put("Black platelegs (t)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10)
        ));

        ITEM_REQUIREMENTS.put("Black full helm (t)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10)
        ));

        ITEM_REQUIREMENTS.put("Black kiteshield (t)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10)
        ));

        ITEM_REQUIREMENTS.put("Black platebody (g)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10)
        ));

        ITEM_REQUIREMENTS.put("Black platelegs (g)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10)
        ));

        ITEM_REQUIREMENTS.put("Black full helm (g)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10)
        ));

        ITEM_REQUIREMENTS.put("Black kiteshield (g)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10)
        ));

        ITEM_REQUIREMENTS.put("Adamant platebody (t)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Adamant platelegs (t)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Adamant kiteshield (t)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Adamant full helm (t)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Adamant platebody (g)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Adamant platelegs (g)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Adamant kiteshield (g)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Adamant full helm (g)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune platebody (g)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new QuestRequirement("Dragon Slayer I")
        ));

        ITEM_REQUIREMENTS.put("Rune platelegs (g)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Rune full helm (g)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Rune kiteshield (g)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Rune platebody (t)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new QuestRequirement("Dragon Slayer I")
        ));

        ITEM_REQUIREMENTS.put("Rune platelegs (t)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Rune full helm (t)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Rune kiteshield (t)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Pirate's hat", Arrays.asList(
                new QuestRequirement("Cabin Fever")
        ));

        ITEM_REQUIREMENTS.put("Zamorak platebody", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new QuestRequirement("Dragon Slayer I")
        ));

        ITEM_REQUIREMENTS.put("Zamorak platelegs", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Zamorak full helm", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Zamorak kiteshield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Saradomin platebody", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new QuestRequirement("Dragon Slayer I")
        ));

        ITEM_REQUIREMENTS.put("Saradomin platelegs", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Saradomin full helm", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Saradomin kiteshield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Guthix platebody", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new QuestRequirement("Dragon Slayer I")
        ));

        ITEM_REQUIREMENTS.put("Guthix platelegs", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Guthix full helm", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Guthix kiteshield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Ogre arrow", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 30),
                new QuestRequirement("Big Chompy Bird Hunting"),
                new QuestRequirement("Recipe for Disaster")
        ));

        ITEM_REQUIREMENTS.put("Elemental shield", Arrays.asList(
                new QuestRequirement("Elemental Workshop I")
        ));

        ITEM_REQUIREMENTS.put("Silver sickle", Arrays.asList(
                new QuestRequirement("Nature Spirit")
        ));

        ITEM_REQUIREMENTS.put("Lava battlestaff", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 30),
                new SkillRequirement(Skill.MAGIC, 30)
        ));

        ITEM_REQUIREMENTS.put("Mystic lava staff", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Black dart", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 10)
        ));

        ITEM_REQUIREMENTS.put("Black dart(p)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 10)
        ));

        ITEM_REQUIREMENTS.put("Steel claws", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 5),
                new QuestRequirement("Death Plateau")
        ));

        ITEM_REQUIREMENTS.put("Black claws", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 10)
        ));

        ITEM_REQUIREMENTS.put("Mithril claws", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 20)
        ));

        ITEM_REQUIREMENTS.put("Adamant claws", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 30),
                new QuestRequirement("Death Plateau")
        ));

        ITEM_REQUIREMENTS.put("Rune claws", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40)
        ));

        ITEM_REQUIREMENTS.put("Climbing boots", Arrays.asList(
                new QuestRequirement("Death Plateau")
        ));

        ITEM_REQUIREMENTS.put("Spiked boots", Arrays.asList(
                new QuestRequirement("Death Plateau")
        ));

        ITEM_REQUIREMENTS.put("Granite shield", Arrays.asList(
                new SkillRequirement(Skill.STRENGTH, 50),
                new SkillRequirement(Skill.DEFENCE, 50)
        ));

        ITEM_REQUIREMENTS.put("Dragon chainbody", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 60)
        ));

        ITEM_REQUIREMENTS.put("Steel halberd", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 5)
        ));

        ITEM_REQUIREMENTS.put("Black halberd", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 10),
                new SkillRequirement(Skill.STRENGTH, 5)
        ));

        ITEM_REQUIREMENTS.put("Mithril halberd", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 20),
                new SkillRequirement(Skill.STRENGTH, 10)
        ));

        ITEM_REQUIREMENTS.put("Adamant halberd", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 30),
                new SkillRequirement(Skill.STRENGTH, 15)
        ));

        ITEM_REQUIREMENTS.put("Rune halberd", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40),
                new SkillRequirement(Skill.STRENGTH, 20),
                new QuestRequirement("Regicide")
        ));

        ITEM_REQUIREMENTS.put("Dragon halberd", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 60),
                new SkillRequirement(Skill.STRENGTH, 30),
                new QuestRequirement("Regicide")
        ));

        ITEM_REQUIREMENTS.put("Splitbark helm", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Splitbark body", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Splitbark legs", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Splitbark gauntlets", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Splitbark boots", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Black plateskirt (t)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10)
        ));

        ITEM_REQUIREMENTS.put("Black plateskirt (g)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10)
        ));

        ITEM_REQUIREMENTS.put("Adamant plateskirt (t)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Adamant plateskirt (g)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune plateskirt (g)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Rune plateskirt (t)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Zamorak plateskirt", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Saradomin plateskirt", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Guthix plateskirt", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Gilded platebody", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new QuestRequirement("Dragon Slayer I")
        ));

        ITEM_REQUIREMENTS.put("Gilded platelegs", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Gilded plateskirt", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Gilded full helm", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Gilded kiteshield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Archer helm", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 45),
                new QuestRequirement("The Fremennik Trials")
        ));

        ITEM_REQUIREMENTS.put("Berserker helm", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 45),
                new QuestRequirement("The Fremennik Trials")
        ));

        ITEM_REQUIREMENTS.put("Warrior helm", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 45),
                new QuestRequirement("The Fremennik Trials")
        ));

        ITEM_REQUIREMENTS.put("Farseer helm", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 45),
                new QuestRequirement("The Fremennik Trials")
        ));

        ITEM_REQUIREMENTS.put("Fremennik boots", Arrays.asList(
                new QuestRequirement("The Fremennik Trials")
        ));

        ITEM_REQUIREMENTS.put("Fremennik robe", Arrays.asList(
                new QuestRequirement("The Fremennik Trials")
        ));

        ITEM_REQUIREMENTS.put("Fremennik hat", Arrays.asList(
                new QuestRequirement("The Fremennik Trials")
        ));

        ITEM_REQUIREMENTS.put("Fremennik gloves", Arrays.asList(
                new QuestRequirement("The Fremennik Trials")
        ));

        ITEM_REQUIREMENTS.put("Games necklace(8)", Arrays.asList(
                new QuestRequirement("Tears of Guthix")
        ));

        ITEM_REQUIREMENTS.put("Dragon platelegs", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 60)
        ));

        ITEM_REQUIREMENTS.put("Mystic hat", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Mystic robe top", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Mystic robe bottom", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Mystic gloves", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Mystic boots", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Mystic hat (dark)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Mystic robe top (dark)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Mystic robe bottom (dark)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Mystic gloves (dark)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Mystic boots (dark)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Mystic hat (light)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Mystic robe top (light)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Mystic robe bottom (light)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Mystic gloves (light)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Mystic boots (light)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Steel boots", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 5)
        ));

        ITEM_REQUIREMENTS.put("Black boots", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10)
        ));

        ITEM_REQUIREMENTS.put("Mithril boots", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20)
        ));

        ITEM_REQUIREMENTS.put("Adamant boots", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune boots", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Abyssal whip", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 70)
        ));

        ITEM_REQUIREMENTS.put("Granite maul", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 50)
        ));

        ITEM_REQUIREMENTS.put("Mirror shield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20)
        ));

        ITEM_REQUIREMENTS.put("Slayer's staff", Arrays.asList(
                new SkillRequirement(Skill.MAGIC, 50)
        ));

        ITEM_REQUIREMENTS.put("Spiny helmet", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 5)
        ));

        ITEM_REQUIREMENTS.put("Black spear", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 10),
                new QuestRequirement("Shades of Mort'ton")
        ));

        ITEM_REQUIREMENTS.put("Black spear(p)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 10),
                new QuestRequirement("Shades of Mort'ton")
        ));

        ITEM_REQUIREMENTS.put("Dragon plateskirt", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 60)
        ));

        ITEM_REQUIREMENTS.put("Dragon scimitar", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 60),
                new QuestRequirement("Monkey Madness I")
        ));

        ITEM_REQUIREMENTS.put("Willow blackjack", Arrays.asList(
                new QuestRequirement("The Feud")
        ));

        ITEM_REQUIREMENTS.put("Ancient staff", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 50),
                new SkillRequirement(Skill.MAGIC, 50),
                new QuestRequirement("Desert Treasure I")
        ));

        ITEM_REQUIREMENTS.put("Ahrim's hood", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 70),
                new SkillRequirement(Skill.MAGIC, 70)
        ));

        ITEM_REQUIREMENTS.put("Ahrim's staff", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 70),
                new SkillRequirement(Skill.MAGIC, 70)
        ));

        ITEM_REQUIREMENTS.put("Ahrim's robetop", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 70),
                new SkillRequirement(Skill.MAGIC, 70)
        ));

        ITEM_REQUIREMENTS.put("Ahrim's robeskirt", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 70),
                new SkillRequirement(Skill.MAGIC, 70)
        ));

        ITEM_REQUIREMENTS.put("Dharok's helm", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 70)
        ));

        ITEM_REQUIREMENTS.put("Dharok's greataxe", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 70),
                new SkillRequirement(Skill.STRENGTH, 70)
        ));

        ITEM_REQUIREMENTS.put("Dharok's platebody", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 70)
        ));

        ITEM_REQUIREMENTS.put("Dharok's platelegs", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 70)
        ));

        ITEM_REQUIREMENTS.put("Guthan's helm", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 70)
        ));

        ITEM_REQUIREMENTS.put("Guthan's warspear", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 70)
        ));

        ITEM_REQUIREMENTS.put("Guthan's platebody", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 70)
        ));

        ITEM_REQUIREMENTS.put("Guthan's chainskirt", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 70)
        ));

        ITEM_REQUIREMENTS.put("Karil's coif", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 70),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Karil's crossbow", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Karil's leathertop", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 70),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Karil's leatherskirt", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 70),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Torag's helm", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 70)
        ));

        ITEM_REQUIREMENTS.put("Torag's hammers", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 70),
                new SkillRequirement(Skill.STRENGTH, 70)
        ));

        ITEM_REQUIREMENTS.put("Torag's platebody", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 70)
        ));

        ITEM_REQUIREMENTS.put("Torag's platelegs", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 70)
        ));

        ITEM_REQUIREMENTS.put("Verac's helm", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 70)
        ));

        ITEM_REQUIREMENTS.put("Verac's flail", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 70)
        ));

        ITEM_REQUIREMENTS.put("Verac's brassard", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 70)
        ));

        ITEM_REQUIREMENTS.put("Verac's plateskirt", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 70)
        ));

        ITEM_REQUIREMENTS.put("Steel brutal", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 5)
        ));

        ITEM_REQUIREMENTS.put("Black brutal", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 10)
        ));

        ITEM_REQUIREMENTS.put("Mithril brutal", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 20)
        ));

        ITEM_REQUIREMENTS.put("Adamant brutal", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune brutal", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 40)
        ));

        ITEM_REQUIREMENTS.put("Comp ogre bow", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 30),
                new QuestRequirement("Zogre Flesh Eaters")
        ));

        ITEM_REQUIREMENTS.put("Mining helmet", Arrays.asList(
                new QuestRequirement("The Lost Tribe")
        ));

        ITEM_REQUIREMENTS.put("Bone club", Arrays.asList(
                new QuestRequirement("The Lost Tribe")
        ));

        ITEM_REQUIREMENTS.put("Woven top", Arrays.asList(
                new QuestRequirement("Royal Trouble")
        ));

        ITEM_REQUIREMENTS.put("Woven top", Arrays.asList(
                new QuestRequirement("Royal Trouble")
        ));

        ITEM_REQUIREMENTS.put("Woven top", Arrays.asList(
                new QuestRequirement("Royal Trouble")
        ));

        ITEM_REQUIREMENTS.put("Trousers", Arrays.asList(
                new QuestRequirement("Royal Trouble")
        ));

        ITEM_REQUIREMENTS.put("Trousers", Arrays.asList(
                new QuestRequirement("Royal Trouble")
        ));

        ITEM_REQUIREMENTS.put("Trousers", Arrays.asList(
                new QuestRequirement("Royal Trouble")
        ));

        ITEM_REQUIREMENTS.put("Initiate sallet", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20),
                new QuestRequirement("Recruitment Drive")
        ));

        ITEM_REQUIREMENTS.put("Initiate hauberk", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20),
                new QuestRequirement("Recruitment Drive")
        ));

        ITEM_REQUIREMENTS.put("Initiate cuisse", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10),
                new QuestRequirement("Recruitment Drive")
        ));

        ITEM_REQUIREMENTS.put("Steel arrow(p+)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 5)
        ));

        ITEM_REQUIREMENTS.put("Mithril arrow(p+)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 20)
        ));

        ITEM_REQUIREMENTS.put("Adamant arrow(p+)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune arrow(p+)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 40)
        ));

        ITEM_REQUIREMENTS.put("Steel arrow(p++)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 5)
        ));

        ITEM_REQUIREMENTS.put("Mithril arrow(p++)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 30)
        ));

        ITEM_REQUIREMENTS.put("Adamant arrow(p++)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune arrow(p++)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 40)
        ));

        ITEM_REQUIREMENTS.put("Steel dart(p+)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 5)
        ));

        ITEM_REQUIREMENTS.put("Black dart(p+)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 10)
        ));

        ITEM_REQUIREMENTS.put("Mithril dart(p+)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 20)
        ));

        ITEM_REQUIREMENTS.put("Adamant dart(p+)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune dart(p+)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 40)
        ));

        ITEM_REQUIREMENTS.put("Steel dart(p++)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 5)
        ));

        ITEM_REQUIREMENTS.put("Black dart(p++)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 10)
        ));

        ITEM_REQUIREMENTS.put("Mithril dart(p++)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 20)
        ));

        ITEM_REQUIREMENTS.put("Adamant dart(p++)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune dart(p++)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 40)
        ));

        ITEM_REQUIREMENTS.put("Steel javelin(p+)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 5)
        ));

        ITEM_REQUIREMENTS.put("Mithril javelin(p+)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 20)
        ));

        ITEM_REQUIREMENTS.put("Adamant javelin(p+)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune javelin(p+)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 40)
        ));

        ITEM_REQUIREMENTS.put("Steel javelin(p++)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 5)
        ));

        ITEM_REQUIREMENTS.put("Mithril javelin(p++)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 20)
        ));

        ITEM_REQUIREMENTS.put("Adamant javelin(p++)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune javelin(p++)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 40)
        ));

        ITEM_REQUIREMENTS.put("Steel knife(p+)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 5)
        ));

        ITEM_REQUIREMENTS.put("Mithril knife(p+)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 20)
        ));

        ITEM_REQUIREMENTS.put("Black knife(p+)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 10)
        ));

        ITEM_REQUIREMENTS.put("Adamant knife(p+)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune knife(p+)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 40)
        ));

        ITEM_REQUIREMENTS.put("Steel knife(p++)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 5)
        ));

        ITEM_REQUIREMENTS.put("Mithril knife(p++)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 20)
        ));

        ITEM_REQUIREMENTS.put("Black knife(p++)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 10)
        ));

        ITEM_REQUIREMENTS.put("Adamant knife(p++)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune knife(p++)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 40)
        ));

        ITEM_REQUIREMENTS.put("Steel dagger(p+)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 5)
        ));

        ITEM_REQUIREMENTS.put("Mithril dagger(p+)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 20)
        ));

        ITEM_REQUIREMENTS.put("Adamant dagger(p+)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune dagger(p+)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40)
        ));

        ITEM_REQUIREMENTS.put("Dragon dagger(p+)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 60),
                new QuestRequirement("Lost City")
        ));

        ITEM_REQUIREMENTS.put("Black dagger(p+)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 10)
        ));

        ITEM_REQUIREMENTS.put("Steel dagger(p++)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 5)
        ));

        ITEM_REQUIREMENTS.put("Mithril dagger(p++)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 20)
        ));

        ITEM_REQUIREMENTS.put("Adamant dagger(p++)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune dagger(p++)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40)
        ));

        ITEM_REQUIREMENTS.put("Dragon dagger(p++)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 60),
                new QuestRequirement("Lost City")
        ));

        ITEM_REQUIREMENTS.put("Black dagger(p++)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 10)
        ));

        ITEM_REQUIREMENTS.put("Iron spear(p+)", Arrays.asList(
                new QuestRequirement("Tai Bwo Wannai Trio")
        ));

        ITEM_REQUIREMENTS.put("Steel spear(p+)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 5),
                new QuestRequirement("Tai Bwo Wannai Trio")
        ));

        ITEM_REQUIREMENTS.put("Mithril spear(p+)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 20)
        ));

        ITEM_REQUIREMENTS.put("Adamant spear(p+)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune spear(p+)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40)
        ));

        ITEM_REQUIREMENTS.put("Dragon spear(p+)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 60)
        ));

        ITEM_REQUIREMENTS.put("Iron spear(p++)", Arrays.asList(
                new QuestRequirement("Tai Bwo Wannai Trio")
        ));

        ITEM_REQUIREMENTS.put("Steel spear(p++)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 5),
                new QuestRequirement("Tai Bwo Wannai Trio")
        ));

        ITEM_REQUIREMENTS.put("Mithril spear(p++)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 20)
        ));

        ITEM_REQUIREMENTS.put("Adamant spear(p++)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune spear(p++)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40)
        ));

        ITEM_REQUIREMENTS.put("Dragon spear(p++)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 60)
        ));

        ITEM_REQUIREMENTS.put("Black spear(p+)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 10),
                new QuestRequirement("Shades of Mort'ton")
        ));

        ITEM_REQUIREMENTS.put("Black spear(p++)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 10),
                new QuestRequirement("Shades of Mort'ton")
        ));

        ITEM_REQUIREMENTS.put("Rock-shell helm", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new QuestRequirement("The Fremennik Trials")
        ));

        ITEM_REQUIREMENTS.put("Rock-shell plate", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new QuestRequirement("Dragon Slayer I"),
                new QuestRequirement("The Fremennik Trials")
        ));

        ITEM_REQUIREMENTS.put("Rock-shell legs", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new QuestRequirement("The Fremennik Trials")
        ));

        ITEM_REQUIREMENTS.put("Spined helm", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 40),
                new QuestRequirement("The Fremennik Trials")
        ));

        ITEM_REQUIREMENTS.put("Spined body", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 40),
                new QuestRequirement("The Fremennik Trials")
        ));

        ITEM_REQUIREMENTS.put("Spined chaps", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 40),
                new QuestRequirement("The Fremennik Trials")
        ));

        ITEM_REQUIREMENTS.put("Skeletal helm", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.MAGIC, 40),
                new QuestRequirement("The Fremennik Trials")
        ));

        ITEM_REQUIREMENTS.put("Skeletal top", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.MAGIC, 40),
                new QuestRequirement("The Fremennik Trials")
        ));

        ITEM_REQUIREMENTS.put("Skeletal bottoms", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.MAGIC, 40),
                new QuestRequirement("The Fremennik Trials")
        ));

        ITEM_REQUIREMENTS.put("Spined boots", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Broodoo shield (10)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 25)
        ));

        ITEM_REQUIREMENTS.put("Broodoo shield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 25)
        ));

        ITEM_REQUIREMENTS.put("Broodoo shield (10)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 25)
        ));

        ITEM_REQUIREMENTS.put("Broodoo shield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 25)
        ));

        ITEM_REQUIREMENTS.put("Broodoo shield (10)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 25)
        ));

        ITEM_REQUIREMENTS.put("Broodoo shield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 25)
        ));

        ITEM_REQUIREMENTS.put("Snakeskin body", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30),
                new SkillRequirement(Skill.RANGED, 30)
        ));

        ITEM_REQUIREMENTS.put("Snakeskin chaps", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30),
                new SkillRequirement(Skill.RANGED, 30)
        ));

        ITEM_REQUIREMENTS.put("Snakeskin bandana", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30),
                new SkillRequirement(Skill.RANGED, 30)
        ));

        ITEM_REQUIREMENTS.put("Snakeskin boots", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30),
                new SkillRequirement(Skill.RANGED, 30)
        ));

        ITEM_REQUIREMENTS.put("Snakeskin vambraces", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30),
                new SkillRequirement(Skill.RANGED, 30)
        ));

        ITEM_REQUIREMENTS.put("Maple blackjack", Arrays.asList(
                new QuestRequirement("The Feud")
        ));

        ITEM_REQUIREMENTS.put("Toktz-xil-ul", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 60)
        ));

        ITEM_REQUIREMENTS.put("Toktz-xil-ak", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 60)
        ));

        ITEM_REQUIREMENTS.put("Toktz-ket-xil", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 60)
        ));

        ITEM_REQUIREMENTS.put("Toktz-xil-ek", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 60)
        ));

        ITEM_REQUIREMENTS.put("Toktz-mej-tal", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 60),
                new SkillRequirement(Skill.MAGIC, 60)
        ));

        ITEM_REQUIREMENTS.put("Tzhaar-ket-em", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 60)
        ));

        ITEM_REQUIREMENTS.put("Tzhaar-ket-om", Arrays.asList(
                new SkillRequirement(Skill.STRENGTH, 60)
        ));

        ITEM_REQUIREMENTS.put("Mud battlestaff", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 30),
                new SkillRequirement(Skill.MAGIC, 30)
        ));

        ITEM_REQUIREMENTS.put("Mystic mud staff", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("White claws", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 10),
                new QuestRequirement("Wanted!")
        ));

        ITEM_REQUIREMENTS.put("White battleaxe", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 10),
                new QuestRequirement("Wanted!")
        ));

        ITEM_REQUIREMENTS.put("White dagger", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 10),
                new QuestRequirement("Wanted!")
        ));

        ITEM_REQUIREMENTS.put("White dagger(p)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 10),
                new QuestRequirement("Wanted!")
        ));

        ITEM_REQUIREMENTS.put("White dagger(p+)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 10),
                new QuestRequirement("Wanted!")
        ));

        ITEM_REQUIREMENTS.put("White dagger(p++)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 10),
                new QuestRequirement("Wanted!")
        ));

        ITEM_REQUIREMENTS.put("White halberd", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 10),
                new SkillRequirement(Skill.STRENGTH, 5),
                new QuestRequirement("Wanted!")
        ));

        ITEM_REQUIREMENTS.put("White mace", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 10),
                new QuestRequirement("Wanted!")
        ));

        ITEM_REQUIREMENTS.put("White magic staff", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 10),
                new QuestRequirement("Wanted!")
        ));

        ITEM_REQUIREMENTS.put("White sword", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 10),
                new QuestRequirement("Wanted!")
        ));

        ITEM_REQUIREMENTS.put("White longsword", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 10),
                new QuestRequirement("Wanted!")
        ));

        ITEM_REQUIREMENTS.put("White 2h sword", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 10),
                new QuestRequirement("Wanted!")
        ));

        ITEM_REQUIREMENTS.put("White scimitar", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 10),
                new QuestRequirement("Wanted!")
        ));

        ITEM_REQUIREMENTS.put("White warhammer", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 10),
                new QuestRequirement("Wanted!")
        ));

        ITEM_REQUIREMENTS.put("White chainbody", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10),
                new QuestRequirement("Wanted!")
        ));

        ITEM_REQUIREMENTS.put("White platebody", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10),
                new QuestRequirement("Wanted!")
        ));

        ITEM_REQUIREMENTS.put("White boots", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10),
                new QuestRequirement("Wanted!")
        ));

        ITEM_REQUIREMENTS.put("White med helm", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10),
                new QuestRequirement("Wanted!")
        ));

        ITEM_REQUIREMENTS.put("White full helm", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10),
                new QuestRequirement("Wanted!")
        ));

        ITEM_REQUIREMENTS.put("White platelegs", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10),
                new QuestRequirement("Wanted!")
        ));

        ITEM_REQUIREMENTS.put("White plateskirt", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10),
                new QuestRequirement("Wanted!")
        ));

        ITEM_REQUIREMENTS.put("White gloves", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10),
                new QuestRequirement("Wanted!")
        ));

        ITEM_REQUIREMENTS.put("White sq shield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10),
                new QuestRequirement("Wanted!")
        ));

        ITEM_REQUIREMENTS.put("White kiteshield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10),
                new QuestRequirement("Wanted!")
        ));

        ITEM_REQUIREMENTS.put("Seercull", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 50)
        ));

        ITEM_REQUIREMENTS.put("Dragon axe", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 61)
        ));

        ITEM_REQUIREMENTS.put("Black desert shirt", Arrays.asList(
                new QuestRequirement("Shadow of the Storm")
        ));

        ITEM_REQUIREMENTS.put("Black desert robe", Arrays.asList(
                new QuestRequirement("Shadow of the Storm")
        ));

        ITEM_REQUIREMENTS.put("Granite legs", Arrays.asList(
                new SkillRequirement(Skill.STRENGTH, 50),
                new SkillRequirement(Skill.DEFENCE, 50)
        ));

        ITEM_REQUIREMENTS.put("Mage's book", Arrays.asList(
                new SkillRequirement(Skill.MAGIC, 60)
        ));

        ITEM_REQUIREMENTS.put("Beginner wand", Arrays.asList(
                new SkillRequirement(Skill.MAGIC, 45)
        ));

        ITEM_REQUIREMENTS.put("Apprentice wand", Arrays.asList(
                new SkillRequirement(Skill.MAGIC, 50)
        ));

        ITEM_REQUIREMENTS.put("Teacher wand", Arrays.asList(
                new SkillRequirement(Skill.MAGIC, 50)
        ));

        ITEM_REQUIREMENTS.put("Master wand", Arrays.asList(
                new SkillRequirement(Skill.MAGIC, 60)
        ));

        ITEM_REQUIREMENTS.put("Infinity top", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 25),
                new SkillRequirement(Skill.MAGIC, 50)
        ));

        ITEM_REQUIREMENTS.put("Infinity hat", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 25),
                new SkillRequirement(Skill.MAGIC, 50)
        ));

        ITEM_REQUIREMENTS.put("Infinity boots", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 25),
                new SkillRequirement(Skill.MAGIC, 50)
        ));

        ITEM_REQUIREMENTS.put("Infinity gloves", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 25),
                new SkillRequirement(Skill.MAGIC, 50)
        ));

        ITEM_REQUIREMENTS.put("Infinity bottoms", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 25),
                new SkillRequirement(Skill.MAGIC, 50)
        ));

        ITEM_REQUIREMENTS.put("Dragon 2h sword", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 60)
        ));

        ITEM_REQUIREMENTS.put("Black shield (h1)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10)
        ));

        ITEM_REQUIREMENTS.put("Adamant shield (h1)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune shield (h1)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Black shield (h2)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10)
        ));

        ITEM_REQUIREMENTS.put("Adamant shield (h2)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune shield (h2)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Black shield (h3)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10)
        ));

        ITEM_REQUIREMENTS.put("Adamant shield (h3)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune shield (h3)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Black shield (h4)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10)
        ));

        ITEM_REQUIREMENTS.put("Adamant shield (h4)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune shield (h4)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Black shield (h5)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10)
        ));

        ITEM_REQUIREMENTS.put("Adamant shield (h5)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune shield (h5)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Studded body (g)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20),
                new SkillRequirement(Skill.RANGED, 20)
        ));

        ITEM_REQUIREMENTS.put("Studded body (t)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20),
                new SkillRequirement(Skill.RANGED, 20)
        ));

        ITEM_REQUIREMENTS.put("Studded chaps (g)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 20)
        ));

        ITEM_REQUIREMENTS.put("Studded chaps (t)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 20)
        ));

        ITEM_REQUIREMENTS.put("Green d'hide body (g)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 40),
                new QuestRequirement("Dragon Slayer I")
        ));

        ITEM_REQUIREMENTS.put("Green d'hide body (t)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 40),
                new QuestRequirement("Dragon Slayer I")
        ));

        ITEM_REQUIREMENTS.put("Blue d'hide body (g)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 50)
        ));

        ITEM_REQUIREMENTS.put("Blue d'hide body (t)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 50)
        ));

        ITEM_REQUIREMENTS.put("Green d'hide chaps (g)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 40)
        ));

        ITEM_REQUIREMENTS.put("Green d'hide chaps (t)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 40)
        ));

        ITEM_REQUIREMENTS.put("Blue d'hide chaps (g)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 50)
        ));

        ITEM_REQUIREMENTS.put("Blue d'hide chaps (t)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 50)
        ));

        ITEM_REQUIREMENTS.put("Enchanted robe", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Enchanted top", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Enchanted hat", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Wooden spoon", Arrays.asList(
                new QuestRequirement("Recipe for Disaster")
        ));

        ITEM_REQUIREMENTS.put("Egg whisk", Arrays.asList(
                new QuestRequirement("Recipe for Disaster")
        ));

        ITEM_REQUIREMENTS.put("Spork", Arrays.asList(
                new QuestRequirement("Recipe for Disaster")
        ));

        ITEM_REQUIREMENTS.put("Spatula", Arrays.asList(
                new QuestRequirement("Recipe for Disaster")
        ));

        ITEM_REQUIREMENTS.put("Frying pan", Arrays.asList(
                new QuestRequirement("Recipe for Disaster")
        ));

        ITEM_REQUIREMENTS.put("Skewer", Arrays.asList(
                new QuestRequirement("Recipe for Disaster")
        ));

        ITEM_REQUIREMENTS.put("Rolling pin", Arrays.asList(
                new QuestRequirement("Recipe for Disaster")
        ));

        ITEM_REQUIREMENTS.put("Kitchen knife", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40),
                new QuestRequirement("Recipe for Disaster")
        ));

        ITEM_REQUIREMENTS.put("Meat tenderiser", Arrays.asList(
                new QuestRequirement("Recipe for Disaster")
        ));

        ITEM_REQUIREMENTS.put("Cleaver", Arrays.asList(
                new QuestRequirement("Recipe for Disaster")
        ));

        ITEM_REQUIREMENTS.put("Gadderhammer", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 30),
                new QuestRequirement("In Aid of the Myreque")
        ));

        ITEM_REQUIREMENTS.put("Dorgeshuun crossbow", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 28)
        ));

        ITEM_REQUIREMENTS.put("Bone bolts", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 28),
                new QuestRequirement("The Lost Tribe")
        ));

        ITEM_REQUIREMENTS.put("Black mask (10)", Arrays.asList(
                new SkillRequirement(Skill.STRENGTH, 20),
                new SkillRequirement(Skill.DEFENCE, 10)
        ));

        ITEM_REQUIREMENTS.put("Black mask", Arrays.asList(
                new SkillRequirement(Skill.STRENGTH, 20),
                new SkillRequirement(Skill.DEFENCE, 10)
        ));

        ITEM_REQUIREMENTS.put("Pharaoh's sceptre (3)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 30),
                new SkillRequirement(Skill.MAGIC, 30)
        ));

        ITEM_REQUIREMENTS.put("Pharaoh's sceptre", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 30),
                new SkillRequirement(Skill.MAGIC, 30)
        ));

        ITEM_REQUIREMENTS.put("Iron bolts", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 26)
        ));

        ITEM_REQUIREMENTS.put("Steel bolts", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 31)
        ));

        ITEM_REQUIREMENTS.put("Mithril bolts", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 36)
        ));

        ITEM_REQUIREMENTS.put("Adamant bolts", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 46)
        ));

        ITEM_REQUIREMENTS.put("Runite bolts", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 61)
        ));

        ITEM_REQUIREMENTS.put("Silver bolts", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 26)
        ));

        ITEM_REQUIREMENTS.put("Iron crossbow", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 26)
        ));

        ITEM_REQUIREMENTS.put("Steel crossbow", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 31)
        ));

        ITEM_REQUIREMENTS.put("Mithril crossbow", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 36)
        ));

        ITEM_REQUIREMENTS.put("Adamant crossbow", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 46)
        ));

        ITEM_REQUIREMENTS.put("Rune crossbow", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 61)
        ));

        ITEM_REQUIREMENTS.put("Topaz bolts (e)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 31)
        ));

        ITEM_REQUIREMENTS.put("Sapphire bolts (e)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 36)
        ));

        ITEM_REQUIREMENTS.put("Emerald bolts (e)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 36)
        ));

        ITEM_REQUIREMENTS.put("Ruby bolts (e)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 46)
        ));

        ITEM_REQUIREMENTS.put("Diamond bolts (e)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 61)
        ));

        ITEM_REQUIREMENTS.put("Dragonstone bolts (e)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 61)
        ));

        ITEM_REQUIREMENTS.put("Onyx bolts (e)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 61)
        ));

        ITEM_REQUIREMENTS.put("Iron bolts (p)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 26)
        ));

        ITEM_REQUIREMENTS.put("Steel bolts (p)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 31)
        ));

        ITEM_REQUIREMENTS.put("Mithril bolts (p)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 36)
        ));

        ITEM_REQUIREMENTS.put("Adamant bolts (p)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 46)
        ));

        ITEM_REQUIREMENTS.put("Runite bolts (p)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 61)
        ));

        ITEM_REQUIREMENTS.put("Silver bolts (p)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 26)
        ));

        ITEM_REQUIREMENTS.put("Iron bolts (p+)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 26)
        ));

        ITEM_REQUIREMENTS.put("Steel bolts (p+)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 31)
        ));

        ITEM_REQUIREMENTS.put("Mithril bolts (p+)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 36)
        ));

        ITEM_REQUIREMENTS.put("Adamant bolts (p+)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 46)
        ));

        ITEM_REQUIREMENTS.put("Runite bolts (p+)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 61)
        ));

        ITEM_REQUIREMENTS.put("Silver bolts (p+)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 26)
        ));

        ITEM_REQUIREMENTS.put("Iron bolts (p++)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 26)
        ));

        ITEM_REQUIREMENTS.put("Steel bolts (p++)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 31)
        ));

        ITEM_REQUIREMENTS.put("Mithril bolts (p++)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 36)
        ));

        ITEM_REQUIREMENTS.put("Adamant bolts (p++)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 46)
        ));

        ITEM_REQUIREMENTS.put("Runite bolts (p++)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 61)
        ));

        ITEM_REQUIREMENTS.put("Silver bolts (p++)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 26)
        ));

        ITEM_REQUIREMENTS.put("Topaz bolts", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 31)
        ));

        ITEM_REQUIREMENTS.put("Sapphire bolts", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 36)
        ));

        ITEM_REQUIREMENTS.put("Emerald bolts", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 46)
        ));

        ITEM_REQUIREMENTS.put("Ruby bolts", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 46)
        ));

        ITEM_REQUIREMENTS.put("Diamond bolts", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 61)
        ));

        ITEM_REQUIREMENTS.put("Dragonstone bolts", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 61)
        ));

        ITEM_REQUIREMENTS.put("Onyx bolts", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 61)
        ));

        ITEM_REQUIREMENTS.put("Tyras helm", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 5)
        ));

        ITEM_REQUIREMENTS.put("Proselyte sallet", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Proselyte hauberk", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Proselyte cuisse", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Proselyte tasset", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Elemental helmet", Arrays.asList(
                new QuestRequirement("Elemental Workshop I"),
                new QuestRequirement("Elemental Workshop II")
        ));

        ITEM_REQUIREMENTS.put("Mind shield", Arrays.asList(
                new QuestRequirement("Elemental Workshop I"),
                new QuestRequirement("Elemental Workshop II")
        ));

        ITEM_REQUIREMENTS.put("Mind helmet", Arrays.asList(
                new QuestRequirement("Elemental Workshop I"),
                new QuestRequirement("Elemental Workshop II")
        ));

        ITEM_REQUIREMENTS.put("Chinchompa", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 45),
                new QuestRequirement("Eagles' Peak")
        ));

        ITEM_REQUIREMENTS.put("Red chinchompa", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 55),
                new QuestRequirement("Eagles' Peak")
        ));

        ITEM_REQUIREMENTS.put("Green spiky vambraces", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 40)
        ));

        ITEM_REQUIREMENTS.put("Blue spiky vambraces", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 50)
        ));

        ITEM_REQUIREMENTS.put("Red spiky vambraces", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 60)
        ));

        ITEM_REQUIREMENTS.put("Black spiky vambraces", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Strung rabbit foot", Arrays.asList(
                new QuestRequirement("Eagles' Peak")
        ));

        ITEM_REQUIREMENTS.put("Orange salamander", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 50),
                new SkillRequirement(Skill.RANGED, 50),
                new SkillRequirement(Skill.MAGIC, 50)
        ));

        ITEM_REQUIREMENTS.put("Red salamander", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 60),
                new SkillRequirement(Skill.RANGED, 60),
                new SkillRequirement(Skill.MAGIC, 60)
        ));

        ITEM_REQUIREMENTS.put("Black salamander", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 70),
                new SkillRequirement(Skill.RANGED, 70),
                new SkillRequirement(Skill.MAGIC, 70)
        ));

        ITEM_REQUIREMENTS.put("Swamp lizard", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 30),
                new SkillRequirement(Skill.RANGED, 30),
                new SkillRequirement(Skill.MAGIC, 30)
        ));

        ITEM_REQUIREMENTS.put("Hunters' crossbow", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 50)
        ));

        ITEM_REQUIREMENTS.put("Kebbit bolts", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 50)
        ));

        ITEM_REQUIREMENTS.put("Long kebbit bolts", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 50)
        ));

        ITEM_REQUIREMENTS.put("Willow comp bow", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 20)
        ));

        ITEM_REQUIREMENTS.put("Yew comp bow", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 40)
        ));

        ITEM_REQUIREMENTS.put("Magic comp bow", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 50)
        ));

        ITEM_REQUIREMENTS.put("Rune helm (h1)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Rune helm (h2)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Rune helm (h3)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Rune helm (h4)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Rune helm (h5)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Adamant helm (h1)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Adamant helm (h2)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Adamant helm (h3)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Adamant helm (h4)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Adamant helm (h5)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Black helm (h1)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10)
        ));

        ITEM_REQUIREMENTS.put("Black helm (h2)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10)
        ));

        ITEM_REQUIREMENTS.put("Black helm (h3)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10)
        ));

        ITEM_REQUIREMENTS.put("Black helm (h4)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10)
        ));

        ITEM_REQUIREMENTS.put("Black helm (h5)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10)
        ));

        ITEM_REQUIREMENTS.put("3rd age range top", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 45),
                new SkillRequirement(Skill.RANGED, 65)
        ));

        ITEM_REQUIREMENTS.put("3rd age range legs", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 45),
                new SkillRequirement(Skill.RANGED, 65)
        ));

        ITEM_REQUIREMENTS.put("3rd age range coif", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 45),
                new SkillRequirement(Skill.RANGED, 65)
        ));

        ITEM_REQUIREMENTS.put("3rd age vambraces", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 45),
                new SkillRequirement(Skill.RANGED, 65)
        ));

        ITEM_REQUIREMENTS.put("3rd age robe top", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30),
                new SkillRequirement(Skill.MAGIC, 65)
        ));

        ITEM_REQUIREMENTS.put("3rd age robe", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30),
                new SkillRequirement(Skill.MAGIC, 65)
        ));

        ITEM_REQUIREMENTS.put("3rd age mage hat", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30),
                new SkillRequirement(Skill.MAGIC, 65)
        ));

        ITEM_REQUIREMENTS.put("3rd age amulet", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30),
                new SkillRequirement(Skill.MAGIC, 65)
        ));

        ITEM_REQUIREMENTS.put("3rd age platelegs", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 65)
        ));

        ITEM_REQUIREMENTS.put("3rd age platebody", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 65)
        ));

        ITEM_REQUIREMENTS.put("3rd age full helmet", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 65)
        ));

        ITEM_REQUIREMENTS.put("3rd age kiteshield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 65)
        ));

        ITEM_REQUIREMENTS.put("Zamorak bracers", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Zamorak d'hide body", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Zamorak chaps", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Zamorak coif", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Guthix bracers", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Guthix d'hide body", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Guthix chaps", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Guthix coif", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Saradomin bracers", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Saradomin d'hide body", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Saradomin chaps", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Saradomin coif", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Saradomin mitre", Arrays.asList(
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Guthix mitre", Arrays.asList(
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Zamorak mitre", Arrays.asList(
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Granite body", Arrays.asList(
                new SkillRequirement(Skill.STRENGTH, 50),
                new SkillRequirement(Skill.DEFENCE, 50)
        ));

        ITEM_REQUIREMENTS.put("Granite helm", Arrays.asList(
                new SkillRequirement(Skill.STRENGTH, 50),
                new SkillRequirement(Skill.DEFENCE, 50)
        ));

        ITEM_REQUIREMENTS.put("Yak-hide armour", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20)
        ));

        ITEM_REQUIREMENTS.put("Yak-hide armour", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20)
        ));

        ITEM_REQUIREMENTS.put("Neitiznot shield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30),
                new QuestRequirement("The Fremennik Isles")
        ));

        ITEM_REQUIREMENTS.put("Helm of neitiznot", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 55),
                new QuestRequirement("The Fremennik Isles")
        ));

        ITEM_REQUIREMENTS.put("Frog-leather body", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 25),
                new SkillRequirement(Skill.RANGED, 25)
        ));

        ITEM_REQUIREMENTS.put("Frog-leather chaps", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 25),
                new SkillRequirement(Skill.RANGED, 25)
        ));

        ITEM_REQUIREMENTS.put("Frog-leather boots", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 25),
                new SkillRequirement(Skill.RANGED, 25)
        ));

        ITEM_REQUIREMENTS.put("Brine sabre", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40),
                new QuestRequirement("Olaf's Quest")
        ));

        ITEM_REQUIREMENTS.put("Ancient mace", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 15),
                new QuestRequirement("Another Slice of H.A.M.")
        ));

        ITEM_REQUIREMENTS.put("Inoculation bracelet", Arrays.asList(
                new QuestRequirement("Zogre Flesh Eaters")
        ));

        ITEM_REQUIREMENTS.put("Dwarven helmet", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 50),
                new QuestRequirement("Grim Tales")
        ));

        ITEM_REQUIREMENTS.put("Dragon arrow", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 60)
        ));

        ITEM_REQUIREMENTS.put("Dragon arrow(p)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 60)
        ));

        ITEM_REQUIREMENTS.put("Dragon arrow(p+)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 60)
        ));

        ITEM_REQUIREMENTS.put("Dragon arrow(p++)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 60)
        ));

        ITEM_REQUIREMENTS.put("Dragon dart", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 60)
        ));

        ITEM_REQUIREMENTS.put("Dragon dart(p)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 60)
        ));

        ITEM_REQUIREMENTS.put("Dragon dart(p+)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 60)
        ));

        ITEM_REQUIREMENTS.put("Dragon dart(p++)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 60)
        ));

        ITEM_REQUIREMENTS.put("Dark bow", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 60)
        ));

        ITEM_REQUIREMENTS.put("Dragonfire shield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 75),
                new QuestRequirement("Dragon Slayer I")
        ));

        ITEM_REQUIREMENTS.put("Dragon full helm", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 60)
        ));

        ITEM_REQUIREMENTS.put("Steel hasta", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 5)
        ));

        ITEM_REQUIREMENTS.put("Mithril hasta", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 20)
        ));

        ITEM_REQUIREMENTS.put("Adamant hasta", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune hasta", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40)
        ));

        ITEM_REQUIREMENTS.put("Steel hasta(p)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 5)
        ));

        ITEM_REQUIREMENTS.put("Steel hasta(p+)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 5)
        ));

        ITEM_REQUIREMENTS.put("Steel hasta(p++)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 5)
        ));

        ITEM_REQUIREMENTS.put("Mithril hasta(p)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 20)
        ));

        ITEM_REQUIREMENTS.put("Mithril hasta(p+)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 20)
        ));

        ITEM_REQUIREMENTS.put("Mithril hasta(p++)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 20)
        ));

        ITEM_REQUIREMENTS.put("Adamant hasta(p)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 30)
        ));

        ITEM_REQUIREMENTS.put("Adamant hasta(p+)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 30)
        ));

        ITEM_REQUIREMENTS.put("Adamant hasta(p++)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune hasta(p)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40)
        ));

        ITEM_REQUIREMENTS.put("Rune hasta(p+)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40)
        ));

        ITEM_REQUIREMENTS.put("Rune hasta(p++)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40)
        ));

        ITEM_REQUIREMENTS.put("Armadyl crossbow", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Steam battlestaff", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 30),
                new SkillRequirement(Skill.MAGIC, 30)
        ));

        ITEM_REQUIREMENTS.put("Mystic steam staff", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Staff of the dead", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 75),
                new SkillRequirement(Skill.MAGIC, 75)
        ));

        ITEM_REQUIREMENTS.put("Armadyl godsword", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 75)
        ));

        ITEM_REQUIREMENTS.put("Bandos godsword", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 75)
        ));

        ITEM_REQUIREMENTS.put("Saradomin godsword", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 75)
        ));

        ITEM_REQUIREMENTS.put("Zamorak godsword", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 75)
        ));

        ITEM_REQUIREMENTS.put("Zamorakian spear", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 70)
        ));

        ITEM_REQUIREMENTS.put("Armadyl helmet", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 70),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Armadyl chestplate", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 70),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Armadyl chainskirt", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 70),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Bandos chestplate", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 65)
        ));

        ITEM_REQUIREMENTS.put("Bandos tassets", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 65)
        ));

        ITEM_REQUIREMENTS.put("Bandos boots", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 65)
        ));

        ITEM_REQUIREMENTS.put("Saradomin sword", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 70)
        ));

        ITEM_REQUIREMENTS.put("Dragon boots", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 60)
        ));

        ITEM_REQUIREMENTS.put("Broad bolts", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 61)
        ));

        ITEM_REQUIREMENTS.put("Zamorakian hasta", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 70)
        ));

        ITEM_REQUIREMENTS.put("Leaf-bladed sword", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 50)
        ));

        ITEM_REQUIREMENTS.put("Trident of the seas (full)", Arrays.asList(
                new SkillRequirement(Skill.MAGIC, 75)
        ));

        ITEM_REQUIREMENTS.put("Uncharged trident", Arrays.asList(
                new SkillRequirement(Skill.MAGIC, 75)
        ));

        ITEM_REQUIREMENTS.put("Dragon pickaxe", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 60)
        ));

        ITEM_REQUIREMENTS.put("Malediction ward", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 60)
        ));

        ITEM_REQUIREMENTS.put("Odium ward", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 60)
        ));

        ITEM_REQUIREMENTS.put("Black chinchompa", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 65)
        ));

        ITEM_REQUIREMENTS.put("Amulet of glory(6)", Arrays.asList(
                new QuestRequirement("Dragon Slayer I"),
                new QuestRequirement("Heroes' Quest")
        ));

        ITEM_REQUIREMENTS.put("Smoke battlestaff", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 30),
                new SkillRequirement(Skill.MAGIC, 30)
        ));

        ITEM_REQUIREMENTS.put("Mystic smoke staff", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Occult necklace", Arrays.asList(
                new SkillRequirement(Skill.MAGIC, 70)
        ));

        ITEM_REQUIREMENTS.put("Ancient mitre", Arrays.asList(
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Armadyl mitre", Arrays.asList(
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Bandos mitre", Arrays.asList(
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Mithril platebody (g)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20)
        ));

        ITEM_REQUIREMENTS.put("Mithril platelegs (g)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20)
        ));

        ITEM_REQUIREMENTS.put("Mithril kiteshield (g)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20)
        ));

        ITEM_REQUIREMENTS.put("Mithril full helm (g)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20)
        ));

        ITEM_REQUIREMENTS.put("Mithril plateskirt (g)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20)
        ));

        ITEM_REQUIREMENTS.put("Mithril platebody (t)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20)
        ));

        ITEM_REQUIREMENTS.put("Mithril platelegs (t)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20)
        ));

        ITEM_REQUIREMENTS.put("Mithril kiteshield (t)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20)
        ));

        ITEM_REQUIREMENTS.put("Mithril full helm (t)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20)
        ));

        ITEM_REQUIREMENTS.put("Mithril plateskirt (t)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20)
        ));

        ITEM_REQUIREMENTS.put("Black pickaxe", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 10)
        ));

        ITEM_REQUIREMENTS.put("Red d'hide body (g)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 60)
        ));

        ITEM_REQUIREMENTS.put("Red d'hide chaps (g)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 60)
        ));

        ITEM_REQUIREMENTS.put("Red d'hide body (t)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 60)
        ));

        ITEM_REQUIREMENTS.put("Red d'hide chaps (t)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 60)
        ));

        ITEM_REQUIREMENTS.put("Dragon cane", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 60),
                new QuestRequirement("Heroes' Quest")
        ));

        ITEM_REQUIREMENTS.put("Black cane", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 10)
        ));

        ITEM_REQUIREMENTS.put("Adamant cane", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 30)
        ));

        ITEM_REQUIREMENTS.put("Rune cane", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40)
        ));

        ITEM_REQUIREMENTS.put("Black d'hide body (g)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Black d'hide chaps (g)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Black d'hide body (t)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Black d'hide chaps (t)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Gilded scimitar", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40)
        ));

        ITEM_REQUIREMENTS.put("Gilded boots", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Partyhat & specs", Arrays.asList(
                new QuestRequirement("Cabin Fever")
        ));

        ITEM_REQUIREMENTS.put("Pirate hat & patch", Arrays.asList(
                new QuestRequirement("Cabin Fever")
        ));

        ITEM_REQUIREMENTS.put("3rd age wand", Arrays.asList(
                new SkillRequirement(Skill.MAGIC, 65)
        ));

        ITEM_REQUIREMENTS.put("3rd age bow", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 65)
        ));

        ITEM_REQUIREMENTS.put("3rd age longsword", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 65)
        ));

        ITEM_REQUIREMENTS.put("Top hat & monocle", Arrays.asList(
                new QuestRequirement("Cabin Fever")
        ));

        ITEM_REQUIREMENTS.put("Ancient platebody", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new QuestRequirement("Dragon Slayer I")
        ));

        ITEM_REQUIREMENTS.put("Ancient platelegs", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Ancient plateskirt", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Ancient full helm", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Ancient kiteshield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Armadyl platebody", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new QuestRequirement("Dragon Slayer I")
        ));

        ITEM_REQUIREMENTS.put("Armadyl platelegs", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Armadyl plateskirt", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Armadyl full helm", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Armadyl kiteshield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Bandos platebody", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new QuestRequirement("Dragon Slayer I")
        ));

        ITEM_REQUIREMENTS.put("Bandos platelegs", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Bandos plateskirt", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Bandos full helm", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Bandos kiteshield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Ancient bracers", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Ancient d'hide body", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Ancient chaps", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Ancient coif", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Bandos bracers", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Bandos d'hide body", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Bandos chaps", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Bandos coif", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Armadyl bracers", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Armadyl d'hide body", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Armadyl chaps", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Armadyl coif", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Rangers' tunic", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 40)
        ));

        ITEM_REQUIREMENTS.put("Elysian spirit shield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 75)
        ));

        ITEM_REQUIREMENTS.put("Spectral spirit shield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 75),
                new SkillRequirement(Skill.MAGIC, 65)
        ));

        ITEM_REQUIREMENTS.put("Arcane spirit shield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 75),
                new SkillRequirement(Skill.MAGIC, 65)
        ));

        ITEM_REQUIREMENTS.put("Spirit shield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 45)
        ));

        ITEM_REQUIREMENTS.put("Blessed spirit shield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 70)
        ));

        ITEM_REQUIREMENTS.put("Uncharged toxic trident", Arrays.asList(
                new SkillRequirement(Skill.MAGIC, 75)
        ));

        ITEM_REQUIREMENTS.put("Toxic staff (uncharged)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 75),
                new SkillRequirement(Skill.MAGIC, 75)
        ));

        ITEM_REQUIREMENTS.put("Eternal boots", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 75),
                new SkillRequirement(Skill.MAGIC, 75)
        ));

        ITEM_REQUIREMENTS.put("Pegasian boots", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 75),
                new SkillRequirement(Skill.RANGED, 75)
        ));

        ITEM_REQUIREMENTS.put("Primordial boots", Arrays.asList(
                new SkillRequirement(Skill.STRENGTH, 75),
                new SkillRequirement(Skill.DEFENCE, 75)
        ));

        ITEM_REQUIREMENTS.put("Abyssal bludgeon", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 70),
                new SkillRequirement(Skill.STRENGTH, 70)
        ));

        ITEM_REQUIREMENTS.put("Abyssal dagger", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 70)
        ));

        ITEM_REQUIREMENTS.put("Abyssal dagger (p)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 70)
        ));

        ITEM_REQUIREMENTS.put("Abyssal dagger (p+)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 70)
        ));

        ITEM_REQUIREMENTS.put("Abyssal dagger (p++)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 70)
        ));

        ITEM_REQUIREMENTS.put("Xerician hat", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10),
                new SkillRequirement(Skill.MAGIC, 20)
        ));

        ITEM_REQUIREMENTS.put("Xerician top", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10),
                new SkillRequirement(Skill.MAGIC, 20)
        ));

        ITEM_REQUIREMENTS.put("Xerician robe", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10),
                new SkillRequirement(Skill.MAGIC, 20)
        ));

        ITEM_REQUIREMENTS.put("Dragon warhammer", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 60)
        ));

        ITEM_REQUIREMENTS.put("Dragon claws", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 60)
        ));

        ITEM_REQUIREMENTS.put("Light ballista", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 65)
        ));

        ITEM_REQUIREMENTS.put("Heavy ballista", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 75),
                new QuestRequirement("Monkey Madness I"),
                new QuestRequirement("Monkey Madness II")
        ));

        ITEM_REQUIREMENTS.put("Dragon javelin", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 65)
        ));

        ITEM_REQUIREMENTS.put("Dragon javelin(p)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 65)
        ));

        ITEM_REQUIREMENTS.put("Dragon javelin(p+)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 65)
        ));

        ITEM_REQUIREMENTS.put("Dragon javelin(p++)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 65)
        ));

        ITEM_REQUIREMENTS.put("Double eye patch", Arrays.asList(
                new QuestRequirement("Cabin Fever")
        ));

        ITEM_REQUIREMENTS.put("Ancient d'hide boots", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Bandos d'hide boots", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Guthix d'hide boots", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Armadyl d'hide boots", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Saradomin d'hide boots", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Zamorak d'hide boots", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Ranger gloves", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 40)
        ));

        ITEM_REQUIREMENTS.put("3rd age axe", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 65)
        ));

        ITEM_REQUIREMENTS.put("3rd age pickaxe", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 65)
        ));

        ITEM_REQUIREMENTS.put("Samurai kasa", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 35)
        ));

        ITEM_REQUIREMENTS.put("Samurai shirt", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 35)
        ));

        ITEM_REQUIREMENTS.put("Samurai gloves", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 35)
        ));

        ITEM_REQUIREMENTS.put("Samurai greaves", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 35)
        ));

        ITEM_REQUIREMENTS.put("Samurai boots", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 35)
        ));

        ITEM_REQUIREMENTS.put("Hood of darkness", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Robe top of darkness", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Gloves of darkness", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Robe bottom of darkness", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Boots of darkness", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Gilded med helm", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Gilded chainbody", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Gilded sq shield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Gilded 2h sword", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40)
        ));

        ITEM_REQUIREMENTS.put("Gilded spear", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40)
        ));

        ITEM_REQUIREMENTS.put("Gilded hasta", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40)
        ));

        ITEM_REQUIREMENTS.put("Steel platebody (g)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 5)
        ));

        ITEM_REQUIREMENTS.put("Steel platelegs (g)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 5)
        ));

        ITEM_REQUIREMENTS.put("Steel plateskirt (g)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 5)
        ));

        ITEM_REQUIREMENTS.put("Steel full helm (g)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 5)
        ));

        ITEM_REQUIREMENTS.put("Steel kiteshield (g)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 5)
        ));

        ITEM_REQUIREMENTS.put("Steel platebody (t)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 5)
        ));

        ITEM_REQUIREMENTS.put("Steel platelegs (t)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 5)
        ));

        ITEM_REQUIREMENTS.put("Steel plateskirt (t)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 5)
        ));

        ITEM_REQUIREMENTS.put("Steel full helm (t)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 5)
        ));

        ITEM_REQUIREMENTS.put("Steel kiteshield (t)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 5)
        ));

        ITEM_REQUIREMENTS.put("Cabbage round shield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Elder chaos top", Arrays.asList(
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Elder chaos robe", Arrays.asList(
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Elder chaos hood", Arrays.asList(
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Tome of fire (empty)", Arrays.asList(
                new SkillRequirement(Skill.MAGIC, 50)
        ));

        ITEM_REQUIREMENTS.put("Leaf-bladed battleaxe", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 65)
        ));

        ITEM_REQUIREMENTS.put("Mist battlestaff", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 30),
                new SkillRequirement(Skill.MAGIC, 30)
        ));

        ITEM_REQUIREMENTS.put("Mystic mist staff", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Dust battlestaff", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 30),
                new SkillRequirement(Skill.MAGIC, 30)
        ));

        ITEM_REQUIREMENTS.put("Mystic dust staff", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Hill giant club", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40)
        ));

        ITEM_REQUIREMENTS.put("Dragon thrownaxe", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 61)
        ));

        ITEM_REQUIREMENTS.put("Twisted bow", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 75)
        ));

        ITEM_REQUIREMENTS.put("Twisted buckler", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 75),
                new SkillRequirement(Skill.RANGED, 75)
        ));

        ITEM_REQUIREMENTS.put("Elder maul", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 75),
                new SkillRequirement(Skill.STRENGTH, 75)
        ));

        ITEM_REQUIREMENTS.put("Kodai wand", Arrays.asList(
                new SkillRequirement(Skill.MAGIC, 75)
        ));

        ITEM_REQUIREMENTS.put("Dragon sword", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 60)
        ));

        ITEM_REQUIREMENTS.put("Dragon hunter crossbow", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 65)
        ));

        ITEM_REQUIREMENTS.put("Dinh's bulwark", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 75),
                new SkillRequirement(Skill.DEFENCE, 75)
        ));

        ITEM_REQUIREMENTS.put("Ancestral hat", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 65),
                new SkillRequirement(Skill.MAGIC, 75)
        ));

        ITEM_REQUIREMENTS.put("Ancestral robe top", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 65),
                new SkillRequirement(Skill.MAGIC, 75)
        ));

        ITEM_REQUIREMENTS.put("Ancestral robe bottom", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 65),
                new SkillRequirement(Skill.MAGIC, 75)
        ));

        ITEM_REQUIREMENTS.put("Dragon harpoon", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 60)
        ));

        ITEM_REQUIREMENTS.put("Obsidian helmet", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 60)
        ));

        ITEM_REQUIREMENTS.put("Obsidian platebody", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 60)
        ));

        ITEM_REQUIREMENTS.put("Obsidian platelegs", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 60)
        ));

        ITEM_REQUIREMENTS.put("Amethyst broad bolts", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 61)
        ));

        ITEM_REQUIREMENTS.put("Amethyst javelin", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 65)
        ));

        ITEM_REQUIREMENTS.put("Amethyst javelin(p)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 65)
        ));

        ITEM_REQUIREMENTS.put("Amethyst javelin(p+)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 65)
        ));

        ITEM_REQUIREMENTS.put("Amethyst javelin(p++)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 65)
        ));

        ITEM_REQUIREMENTS.put("Amethyst arrow", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 50)
        ));

        ITEM_REQUIREMENTS.put("Amethyst arrow(p)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 50)
        ));

        ITEM_REQUIREMENTS.put("Amethyst arrow(p+)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 50)
        ));

        ITEM_REQUIREMENTS.put("Amethyst arrow(p++)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 50)
        ));

        ITEM_REQUIREMENTS.put("Ancient wyvern shield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 75),
                new SkillRequirement(Skill.MAGIC, 70),
                new QuestRequirement("Dragon Slayer I")
        ));

        ITEM_REQUIREMENTS.put("Granite boots", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 50)
        ));

        ITEM_REQUIREMENTS.put("Granite longsword", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 50),
                new SkillRequirement(Skill.STRENGTH, 50)
        ));

        ITEM_REQUIREMENTS.put("Guardian boots", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 75)
        ));

        ITEM_REQUIREMENTS.put("Granite gloves", Arrays.asList(
                new SkillRequirement(Skill.STRENGTH, 50),
                new SkillRequirement(Skill.DEFENCE, 50)
        ));

        ITEM_REQUIREMENTS.put("Granite ring", Arrays.asList(
                new SkillRequirement(Skill.STRENGTH, 50),
                new SkillRequirement(Skill.DEFENCE, 50)
        ));

        ITEM_REQUIREMENTS.put("Granite hammer", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 50),
                new SkillRequirement(Skill.STRENGTH, 50)
        ));

        ITEM_REQUIREMENTS.put("Dragon platebody", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 60),
                new QuestRequirement("Dragon Slayer I")
        ));

        ITEM_REQUIREMENTS.put("Dragon kiteshield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 60),
                new QuestRequirement("Dragon Slayer I"),
                new QuestRequirement("Legends' Quest")
        ));

        ITEM_REQUIREMENTS.put("Dragon crossbow", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 64)
        ));

        ITEM_REQUIREMENTS.put("Dragon bolts", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 64)
        ));

        ITEM_REQUIREMENTS.put("Dragon bolts (p)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 64)
        ));

        ITEM_REQUIREMENTS.put("Dragon bolts (p+)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 64)
        ));

        ITEM_REQUIREMENTS.put("Dragon bolts (p++)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 64)
        ));

        ITEM_REQUIREMENTS.put("Opal dragon bolts (e)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 64)
        ));

        ITEM_REQUIREMENTS.put("Jade dragon bolts (e)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 64)
        ));

        ITEM_REQUIREMENTS.put("Pearl dragon bolts (e)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 64)
        ));

        ITEM_REQUIREMENTS.put("Topaz dragon bolts (e)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 64)
        ));

        ITEM_REQUIREMENTS.put("Sapphire dragon bolts (e)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 64)
        ));

        ITEM_REQUIREMENTS.put("Emerald dragon bolts (e)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 64)
        ));

        ITEM_REQUIREMENTS.put("Ruby dragon bolts (e)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 64)
        ));

        ITEM_REQUIREMENTS.put("Diamond dragon bolts (e)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 64)
        ));

        ITEM_REQUIREMENTS.put("Dragonstone dragon bolts (e)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 64)
        ));

        ITEM_REQUIREMENTS.put("Onyx dragon bolts (e)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 64)
        ));

        ITEM_REQUIREMENTS.put("Opal dragon bolts", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 64)
        ));

        ITEM_REQUIREMENTS.put("Jade dragon bolts", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 64)
        ));

        ITEM_REQUIREMENTS.put("Pearl dragon bolts", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 64)
        ));

        ITEM_REQUIREMENTS.put("Topaz dragon bolts", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 64)
        ));

        ITEM_REQUIREMENTS.put("Sapphire dragon bolts", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 64)
        ));

        ITEM_REQUIREMENTS.put("Emerald dragon bolts", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 64)
        ));

        ITEM_REQUIREMENTS.put("Ruby dragon bolts", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 64)
        ));

        ITEM_REQUIREMENTS.put("Diamond dragon bolts", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 64)
        ));

        ITEM_REQUIREMENTS.put("Dragonstone dragon bolts", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 64)
        ));

        ITEM_REQUIREMENTS.put("Onyx dragon bolts", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 64)
        ));

        ITEM_REQUIREMENTS.put("Dragonfire ward", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 75),
                new SkillRequirement(Skill.RANGED, 70),
                new QuestRequirement("Dragon Slayer I")
        ));

        ITEM_REQUIREMENTS.put("Oak shield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10)
        ));

        ITEM_REQUIREMENTS.put("Willow shield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Maple shield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Yew shield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Magic shield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Redwood shield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Hard leather shield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10),
                new SkillRequirement(Skill.RANGED, 20)
        ));

        ITEM_REQUIREMENTS.put("Snakeskin shield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30),
                new SkillRequirement(Skill.RANGED, 30)
        ));

        ITEM_REQUIREMENTS.put("Green d'hide shield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 40)
        ));

        ITEM_REQUIREMENTS.put("Blue d'hide shield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 50)
        ));

        ITEM_REQUIREMENTS.put("Red d'hide shield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 60)
        ));

        ITEM_REQUIREMENTS.put("Black d'hide shield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Uncharged trident (e)", Arrays.asList(
                new SkillRequirement(Skill.MAGIC, 75)
        ));

        ITEM_REQUIREMENTS.put("Uncharged toxic trident (e)", Arrays.asList(
                new SkillRequirement(Skill.MAGIC, 75)
        ));

        ITEM_REQUIREMENTS.put("Staff of light", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 75),
                new SkillRequirement(Skill.MAGIC, 75)
        ));

        ITEM_REQUIREMENTS.put("Ghrazi rapier", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 75)
        ));

        ITEM_REQUIREMENTS.put("Justiciar faceguard", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 75)
        ));

        ITEM_REQUIREMENTS.put("Justiciar chestguard", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 75)
        ));

        ITEM_REQUIREMENTS.put("Justiciar legguards", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 75)
        ));

        ITEM_REQUIREMENTS.put("Bryophyta's staff (uncharged)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 30),
                new SkillRequirement(Skill.MAGIC, 30)
        ));

        ITEM_REQUIREMENTS.put("Sanguinesti staff (uncharged)", Arrays.asList(
                new SkillRequirement(Skill.MAGIC, 75)
        ));

        ITEM_REQUIREMENTS.put("Scythe of vitur (uncharged)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 75),
                new SkillRequirement(Skill.STRENGTH, 75)
        ));

        ITEM_REQUIREMENTS.put("Viggora's chainmace (u)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 60)
        ));

        ITEM_REQUIREMENTS.put("Craw's bow (u)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 60)
        ));

        ITEM_REQUIREMENTS.put("Thammaron's sceptre (u)", Arrays.asList(
                new SkillRequirement(Skill.MAGIC, 60)
        ));

        ITEM_REQUIREMENTS.put("Vesta's spear", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 78)
        ));

        ITEM_REQUIREMENTS.put("Vesta's longsword", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 78)
        ));

        ITEM_REQUIREMENTS.put("Statius's warhammer", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 78)
        ));

        ITEM_REQUIREMENTS.put("Morrigan's throwing axe", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 78)
        ));

        ITEM_REQUIREMENTS.put("Morrigan's javelin", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 78)
        ));

        ITEM_REQUIREMENTS.put("Zuriel's staff", Arrays.asList(
                new SkillRequirement(Skill.MAGIC, 78)
        ));

        ITEM_REQUIREMENTS.put("Dragon hasta", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 60)
        ));

        ITEM_REQUIREMENTS.put("Dragon hasta(p)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 60)
        ));

        ITEM_REQUIREMENTS.put("Dragon hasta(p+)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 60)
        ));

        ITEM_REQUIREMENTS.put("Dragon hasta(p++)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 60)
        ));

        ITEM_REQUIREMENTS.put("Dragon knife", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 60)
        ));

        ITEM_REQUIREMENTS.put("Dragon knife(p)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 60)
        ));

        ITEM_REQUIREMENTS.put("Dragon knife(p+)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 60)
        ));

        ITEM_REQUIREMENTS.put("Dragon knife(p++)", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 60)
        ));

        ITEM_REQUIREMENTS.put("Boots of brimstone", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 70),
                new SkillRequirement(Skill.RANGED, 70),
                new SkillRequirement(Skill.MAGIC, 70)
        ));

        ITEM_REQUIREMENTS.put("Dragon hunter lance", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 70),
                new QuestRequirement("Tai Bwo Wannai Trio")
        ));

        ITEM_REQUIREMENTS.put("Mystic hat (dusk)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Mystic robe top (dusk)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Mystic robe bottom (dusk)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Mystic gloves (dusk)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Mystic boots (dusk)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 20),
                new SkillRequirement(Skill.MAGIC, 40)
        ));

        ITEM_REQUIREMENTS.put("Guthix d'hide shield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Saradomin d'hide shield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Zamorak d'hide shield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Ancient d'hide shield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Armadyl d'hide shield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Bandos d'hide shield", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 70)
        ));

        ITEM_REQUIREMENTS.put("Rune platebody (h1)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new QuestRequirement("Dragon Slayer I")
        ));

        ITEM_REQUIREMENTS.put("Rune platebody (h2)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new QuestRequirement("Dragon Slayer I")
        ));

        ITEM_REQUIREMENTS.put("Rune platebody (h3)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new QuestRequirement("Dragon Slayer I")
        ));

        ITEM_REQUIREMENTS.put("Rune platebody (h4)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new QuestRequirement("Dragon Slayer I")
        ));

        ITEM_REQUIREMENTS.put("Rune platebody (h5)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new QuestRequirement("Dragon Slayer I")
        ));

        ITEM_REQUIREMENTS.put("3rd age plateskirt", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 65)
        ));

        ITEM_REQUIREMENTS.put("Rangers' tights", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 40)
        ));

        ITEM_REQUIREMENTS.put("Gilded d'hide vambraces", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 40)
        ));

        ITEM_REQUIREMENTS.put("Gilded d'hide body", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.RANGED, 40),
                new QuestRequirement("Dragon Slayer I")
        ));

        ITEM_REQUIREMENTS.put("Gilded d'hide chaps", Arrays.asList(
                new SkillRequirement(Skill.RANGED, 40)
        ));

        ITEM_REQUIREMENTS.put("Gilded pickaxe", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40)
        ));

        ITEM_REQUIREMENTS.put("Gilded axe", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 40)
        ));

        ITEM_REQUIREMENTS.put("3rd age druidic robe top", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 65)
        ));

        ITEM_REQUIREMENTS.put("3rd age druidic robe bottoms", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 65)
        ));

        ITEM_REQUIREMENTS.put("3rd age druidic staff", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 65)
        ));

        ITEM_REQUIREMENTS.put("3rd age druidic cloak", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 65)
        ));

        ITEM_REQUIREMENTS.put("Black platebody (h1)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10)
        ));

        ITEM_REQUIREMENTS.put("Black platebody (h2)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10)
        ));

        ITEM_REQUIREMENTS.put("Black platebody (h3)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10)
        ));

        ITEM_REQUIREMENTS.put("Black platebody (h4)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10)
        ));

        ITEM_REQUIREMENTS.put("Black platebody (h5)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 10)
        ));

        ITEM_REQUIREMENTS.put("Adamant platebody (h1)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Adamant platebody (h2)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Adamant platebody (h3)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Adamant platebody (h4)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Adamant platebody (h5)", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Climbing boots (g)", Arrays.asList(
                new QuestRequirement("Death Plateau")
        ));

        ITEM_REQUIREMENTS.put("Sarachnis cudgel", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 65)
        ));

        ITEM_REQUIREMENTS.put("Blade of saeldor (inactive)", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 75)
        ));

        ITEM_REQUIREMENTS.put("Dragonstone full helm", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Dragonstone platebody", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new QuestRequirement("Dragon Slayer I")
        ));

        ITEM_REQUIREMENTS.put("Dragonstone platelegs", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Dragonstone boots", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Dragonstone gauntlets", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40)
        ));

        ITEM_REQUIREMENTS.put("Staff of balance", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 75),
                new SkillRequirement(Skill.MAGIC, 75)
        ));

        ITEM_REQUIREMENTS.put("Dagon'hai hat", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.MAGIC, 70)
        ));

        ITEM_REQUIREMENTS.put("Dagon'hai robe top", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.MAGIC, 70)
        ));

        ITEM_REQUIREMENTS.put("Dagon'hai robe bottom", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 40),
                new SkillRequirement(Skill.MAGIC, 70)
        ));

        ITEM_REQUIREMENTS.put("Inquisitor's mace", Arrays.asList(
                new SkillRequirement(Skill.ATTACK, 75)
        ));

        ITEM_REQUIREMENTS.put("Inquisitor's great helm", Arrays.asList(
                new SkillRequirement(Skill.STRENGTH, 70),
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Inquisitor's hauberk", Arrays.asList(
                new SkillRequirement(Skill.STRENGTH, 70),
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Inquisitor's plateskirt", Arrays.asList(
                new SkillRequirement(Skill.STRENGTH, 70),
                new SkillRequirement(Skill.DEFENCE, 30)
        ));

        ITEM_REQUIREMENTS.put("Nightmare staff", Arrays.asList(
                new SkillRequirement(Skill.MAGIC, 65)
        ));

        ITEM_REQUIREMENTS.put("Swampbark body", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 50),
                new SkillRequirement(Skill.MAGIC, 50)
        ));

        ITEM_REQUIREMENTS.put("Swampbark gauntlets", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 50),
                new SkillRequirement(Skill.MAGIC, 50)
        ));

        ITEM_REQUIREMENTS.put("Swampbark boots", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 50),
                new SkillRequirement(Skill.MAGIC, 50)
        ));

        ITEM_REQUIREMENTS.put("Swampbark helm", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 50),
                new SkillRequirement(Skill.MAGIC, 50)
        ));

        ITEM_REQUIREMENTS.put("Swampbark legs", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 50),
                new SkillRequirement(Skill.MAGIC, 50)
        ));

        ITEM_REQUIREMENTS.put("Bloodbark body", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 60),
                new SkillRequirement(Skill.MAGIC, 60)
        ));

        ITEM_REQUIREMENTS.put("Bloodbark gauntlets", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 60),
                new SkillRequirement(Skill.MAGIC, 60)
        ));

        ITEM_REQUIREMENTS.put("Bloodbark boots", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 60),
                new SkillRequirement(Skill.MAGIC, 60)
        ));

        ITEM_REQUIREMENTS.put("Bloodbark helm", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 60),
                new SkillRequirement(Skill.MAGIC, 60)
        ));

        ITEM_REQUIREMENTS.put("Bloodbark legs", Arrays.asList(
                new SkillRequirement(Skill.DEFENCE, 60),
                new SkillRequirement(Skill.MAGIC, 60)
        ));
    }
}
