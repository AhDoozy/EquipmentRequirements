package com.equipmentrequirements;

import com.equipmentrequirements.QuestRequirement;

import net.runelite.api.Skill;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Arrays;

public class EquipmentRequirementsData
{
    public static final Map<String, List<Requirement>> ITEM_REQUIREMENTS = new HashMap<>();

    static
    {
        loadRequirements();
    }

    public static void loadRequirements()
    {
        // Quest reward tradeable equipment
        ITEM_REQUIREMENTS.put("Ancient mace", Arrays.asList(
            new QuestRequirement("Another Slice of Ham")));
        ITEM_REQUIREMENTS.put("Superior ancient mace", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 60),
            new SkillRequirement(Skill.PRAYER, 60),
            new QuestRequirement("Another Slice of H.A.M.")));
        ITEM_REQUIREMENTS.clear();

        // God Wars gear
        ITEM_REQUIREMENTS.put("Bandos chestplate", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 65)));
        ITEM_REQUIREMENTS.put("Bandos tassets", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 65)));
        ITEM_REQUIREMENTS.put("Bandos boots", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 65)));

        ITEM_REQUIREMENTS.put("Armadyl helmet", Arrays.asList(
            new SkillRequirement(Skill.RANGED, 70)));
        ITEM_REQUIREMENTS.put("Armadyl chestplate", Arrays.asList(
            new SkillRequirement(Skill.RANGED, 70)));
        ITEM_REQUIREMENTS.put("Armadyl chainskirt", Arrays.asList(
            new SkillRequirement(Skill.RANGED, 70)));

        ITEM_REQUIREMENTS.put("Zamorakian spear", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 70)));
        ITEM_REQUIREMENTS.put("Zamorak godsword", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 75)));
        ITEM_REQUIREMENTS.put("Staff of the dead", Arrays.asList(
            new SkillRequirement(Skill.MAGIC, 75)));

        ITEM_REQUIREMENTS.put("Saradomin godsword", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 75)));
        ITEM_REQUIREMENTS.put("Saradomin sword", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 70)));

        // Unique weapons
        ITEM_REQUIREMENTS.put("Abyssal whip", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 70)));

        ITEM_REQUIREMENTS.put("Rune defender", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 40)));

        // Spirit shields
        ITEM_REQUIREMENTS.put("Spirit shield", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 75)));
        ITEM_REQUIREMENTS.put("Spectral spirit shield", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 75)));
        ITEM_REQUIREMENTS.put("Arcane spirit shield", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 75)));
        ITEM_REQUIREMENTS.put("Elysian spirit shield", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 75)));
        ITEM_REQUIREMENTS.put("Blessed spirit shield", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 75)));

        // Dragon shields
        ITEM_REQUIREMENTS.put("Dragonfire shield", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 75)));
        ITEM_REQUIREMENTS.put("Dragon sq shield", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 60),
            new QuestRequirement("Legends' Quest")));
        ITEM_REQUIREMENTS.put("Dragon kiteshield", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 60)));

        // Godswords
        ITEM_REQUIREMENTS.put("Armadyl godsword", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 75),
            new QuestRequirement("Troll Stronghold")));
        ITEM_REQUIREMENTS.put("Bandos godsword", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 75),
            new QuestRequirement("Troll Stronghold")));
        ITEM_REQUIREMENTS.put("Saradomin godsword", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 75),
            new QuestRequirement("Troll Stronghold")));
        ITEM_REQUIREMENTS.put("Zamorak godsword", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 75),
            new QuestRequirement("Troll Stronghold")));

        // Dragon equipment
        ITEM_REQUIREMENTS.put("Dragon scimitar", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 70),
            new SkillRequirement(Skill.STRENGTH, 80),
            new SkillRequirement(Skill.DEFENCE, 99),
            new SkillRequirement(Skill.RUNECRAFT, 44),
            new QuestRequirement("Monkey Madness I")));
        ITEM_REQUIREMENTS.put("Dragon dagger", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 99),
            new SkillRequirement(Skill.STRENGTH, 99),
            new SkillRequirement(Skill.DEFENCE, 99),
            new SkillRequirement(Skill.RANGED, 99),
            new SkillRequirement(Skill.MAGIC, 99),
            new SkillRequirement(Skill.CONSTRUCTION, 99),
            new QuestRequirement("Monkey Madness I"),
            new QuestRequirement("Monkey Madness II"),
            new QuestRequirement("Legends Quest")));
        ITEM_REQUIREMENTS.put("Dragon longsword", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 60),
            new QuestRequirement("Dragon Slayer")));
        ITEM_REQUIREMENTS.put("Dragon mace", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 60)));
        ITEM_REQUIREMENTS.put("Dragon halberd", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 60)));
        ITEM_REQUIREMENTS.put("Dragon spear", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 60)));
        ITEM_REQUIREMENTS.put("Dragon 2h sword", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 60)));
        ITEM_REQUIREMENTS.put("Dragon defender", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 60),
            new QuestRequirement("Dragon Slayer")));
        ITEM_REQUIREMENTS.put("Dragon full helm", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 60),
            new QuestRequirement("Dragon Slayer")));
        ITEM_REQUIREMENTS.put("Dragon platebody", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 60),
            new QuestRequirement("Dragon Slayer")));
        ITEM_REQUIREMENTS.put("Dragon platelegs", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 60),
            new QuestRequirement("Dragon Slayer")));
        ITEM_REQUIREMENTS.put("Dragon boots", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 60)));

        // Third Age armor
        ITEM_REQUIREMENTS.put("Third age range coif", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 70)));
        ITEM_REQUIREMENTS.put("Third age range top", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 70)));
        ITEM_REQUIREMENTS.put("Third age range legs", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 70)));
        ITEM_REQUIREMENTS.put("Third age robe top", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 70)));
        ITEM_REQUIREMENTS.put("Third age robe", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 70)));
        ITEM_REQUIREMENTS.put("Third age mage hat", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 70)));
        ITEM_REQUIREMENTS.put("Third age amulet", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 70)));
        ITEM_REQUIREMENTS.put("Third age platelegs", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 70)));
        ITEM_REQUIREMENTS.put("Third age platebody", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 70)));
        ITEM_REQUIREMENTS.put("Third age full helmet", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 70)));

        // Bronze tier
        ITEM_REQUIREMENTS.put("Bronze sword", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 1)));
        ITEM_REQUIREMENTS.put("Bronze scimitar", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 10)));
        ITEM_REQUIREMENTS.put("Bronze dagger", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 1)));
        ITEM_REQUIREMENTS.put("Bronze longsword", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 10)));
        ITEM_REQUIREMENTS.put("Bronze mace", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 1)));
        ITEM_REQUIREMENTS.put("Bronze warhammer", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 1)));
        ITEM_REQUIREMENTS.put("Bronze halberd", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 20)));
        ITEM_REQUIREMENTS.put("Bronze spear", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 1)));

        ITEM_REQUIREMENTS.put("Bronze full helm", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 1)));
        ITEM_REQUIREMENTS.put("Bronze platebody", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 1)));
        ITEM_REQUIREMENTS.put("Bronze platelegs", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 1)));
        ITEM_REQUIREMENTS.put("Bronze kiteshield", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 1)));
        ITEM_REQUIREMENTS.put("Bronze boots", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 1)));

        // Iron tier
        ITEM_REQUIREMENTS.put("Iron sword", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 1)));
        ITEM_REQUIREMENTS.put("Iron scimitar", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 10)));
        ITEM_REQUIREMENTS.put("Iron dagger", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 1)));
        ITEM_REQUIREMENTS.put("Iron longsword", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 10)));
        ITEM_REQUIREMENTS.put("Iron mace", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 1)));
        ITEM_REQUIREMENTS.put("Iron warhammer", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 1)));
        ITEM_REQUIREMENTS.put("Iron halberd", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 20)));
        ITEM_REQUIREMENTS.put("Iron spear", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 1)));

        ITEM_REQUIREMENTS.put("Iron full helm", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 1)));
        ITEM_REQUIREMENTS.put("Iron platebody", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 1)));
        ITEM_REQUIREMENTS.put("Iron platelegs", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 1)));
        ITEM_REQUIREMENTS.put("Iron kiteshield", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 1)));
        ITEM_REQUIREMENTS.put("Iron boots", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 1)));

        // Steel tier
        ITEM_REQUIREMENTS.put("Steel sword", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 5)));
        ITEM_REQUIREMENTS.put("Steel scimitar", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 20)));
        ITEM_REQUIREMENTS.put("Steel dagger", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 5)));
        ITEM_REQUIREMENTS.put("Steel longsword", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 20)));
        ITEM_REQUIREMENTS.put("Steel mace", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 5)));
        ITEM_REQUIREMENTS.put("Steel warhammer", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 5)));
        ITEM_REQUIREMENTS.put("Steel halberd", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 30)));
        ITEM_REQUIREMENTS.put("Steel spear", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 5)));

        ITEM_REQUIREMENTS.put("Steel full helm", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 5)));
        ITEM_REQUIREMENTS.put("Steel platebody", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 5)));
        ITEM_REQUIREMENTS.put("Steel platelegs", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 5)));
        ITEM_REQUIREMENTS.put("Steel kiteshield", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 5)));
        ITEM_REQUIREMENTS.put("Steel boots", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 5)));

        // Black tier
        ITEM_REQUIREMENTS.put("Black sword", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 10)));
        ITEM_REQUIREMENTS.put("Black scimitar", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 30)));
        ITEM_REQUIREMENTS.put("Black dagger", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 10)));
        ITEM_REQUIREMENTS.put("Black longsword", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 30)));
        ITEM_REQUIREMENTS.put("Black mace", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 10)));
        ITEM_REQUIREMENTS.put("Black warhammer", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 10)));
        ITEM_REQUIREMENTS.put("Black halberd", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 40)));
        ITEM_REQUIREMENTS.put("Black spear", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 10)));

        ITEM_REQUIREMENTS.put("Black full helm", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 10)));
        ITEM_REQUIREMENTS.put("Black platebody", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 10)));
        ITEM_REQUIREMENTS.put("Black platelegs", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 10)));
        ITEM_REQUIREMENTS.put("Black kiteshield", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 10)));
        ITEM_REQUIREMENTS.put("Black boots", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 10)));

        // Mithril tier
        ITEM_REQUIREMENTS.put("Mithril sword", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 20)));
        ITEM_REQUIREMENTS.put("Mithril scimitar", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 30)));
        ITEM_REQUIREMENTS.put("Mithril dagger", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 20)));
        ITEM_REQUIREMENTS.put("Mithril longsword", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 30)));
        ITEM_REQUIREMENTS.put("Mithril mace", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 20)));
        ITEM_REQUIREMENTS.put("Mithril warhammer", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 20)));
        ITEM_REQUIREMENTS.put("Mithril halberd", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 40)));
        ITEM_REQUIREMENTS.put("Mithril spear", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 20)));

        ITEM_REQUIREMENTS.put("Mithril full helm", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 20)));
        ITEM_REQUIREMENTS.put("Mithril platebody", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 20)));
        ITEM_REQUIREMENTS.put("Mithril platelegs", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 20)));
        ITEM_REQUIREMENTS.put("Mithril kiteshield", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 20)));
        ITEM_REQUIREMENTS.put("Mithril boots", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 20)));

        // Adamant tier
        ITEM_REQUIREMENTS.put("Adamant sword", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 30)));
        ITEM_REQUIREMENTS.put("Adamant scimitar", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 40)));
        ITEM_REQUIREMENTS.put("Adamant dagger", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 30)));
        ITEM_REQUIREMENTS.put("Adamant longsword", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 40)));
        ITEM_REQUIREMENTS.put("Adamant mace", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 30)));
        ITEM_REQUIREMENTS.put("Adamant warhammer", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 30)));
        ITEM_REQUIREMENTS.put("Adamant halberd", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 50)));
        ITEM_REQUIREMENTS.put("Adamant spear", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 30)));

        ITEM_REQUIREMENTS.put("Adamant full helm", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 30)));
        ITEM_REQUIREMENTS.put("Adamant platebody", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 30)));
        ITEM_REQUIREMENTS.put("Adamant platelegs", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 30)));
        ITEM_REQUIREMENTS.put("Adamant kiteshield", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 30)));
        ITEM_REQUIREMENTS.put("Adamant boots", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 30)));

        // Rune tier
        ITEM_REQUIREMENTS.put("Rune sword", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 40)));
        ITEM_REQUIREMENTS.put("Rune scimitar", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 40)));
        ITEM_REQUIREMENTS.put("Rune dagger", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 40)));
        ITEM_REQUIREMENTS.put("Rune longsword", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 40)));
        ITEM_REQUIREMENTS.put("Rune mace", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 40)));
        ITEM_REQUIREMENTS.put("Rune warhammer", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 40)));
        ITEM_REQUIREMENTS.put("Rune halberd", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 60)));
        ITEM_REQUIREMENTS.put("Rune spear", Arrays.asList(
            new SkillRequirement(Skill.ATTACK, 40)));

        ITEM_REQUIREMENTS.put("Rune full helm", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 40)));
        ITEM_REQUIREMENTS.put("Rune platebody", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 40)));
        ITEM_REQUIREMENTS.put("Rune platelegs", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 40)));
        ITEM_REQUIREMENTS.put("Rune kiteshield", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 40)));
        ITEM_REQUIREMENTS.put("Rune boots", Arrays.asList(
            new SkillRequirement(Skill.DEFENCE, 40)));
    }
}
