package classes;

import java.util.ArrayList;

public class Class_Rogue extends InitClass {

    private int numHitDie;
    private String hitDice;
    private int proficiencyBonus;
    private int hitpoints;
    private ArrayList<String> savingThrows = new ArrayList<>();
    private ArrayList<String> skills = new ArrayList<>();
    private ArrayList<String> features = new ArrayList<>();
    private ArrayList<String> proficiencies = new ArrayList<>();
    private ArrayList<String> firstEquipmentChoice = new ArrayList<>();
    private ArrayList<String> secondEquipmentChoice = new ArrayList<>();
    private ArrayList<String> thirdEquipmentChoice = new ArrayList<>();
    private ArrayList<String> fourthEquipmentChoice = new ArrayList<>();
    private ArrayList<String> guaranteedEquipment = new ArrayList<>();

    public Class_Rogue() {

        numHitDie = 1;
        hitDice = "d8";
        proficiencyBonus = 2;
        hitpoints = 8;
        savingThrows.add("Dexterity");
        savingThrows.add("Intelligence");
        skills.add("Acrobatics");
        skills.add("Athletics");
        skills.add("Deception");
        skills.add("Insight");
        skills.add("Intimidation");
        skills.add("Investigation");
        skills.add("Perception");
        skills.add("Performance");
        skills.add("Persuasion");
        skills.add("Sleight of Hand");
        skills.add("Stealth");
        features.add("Expertise");
        features.add("Sneak Attack");
        features.add("Thieves' Cant");
        proficiencies.add("Light Armor");
        proficiencies.add("Simple Weapons");
        proficiencies.add("Hand Crossbows");
        proficiencies.add("Longswords");
        proficiencies.add("Rapiers");
        proficiencies.add("Shortswords");
        proficiencies.add("Thieves' Tools");
        firstEquipmentChoice.add("Rapier");
        firstEquipmentChoice.add("Shortsword");
        secondEquipmentChoice.add("Shortbow and Quiver fo 20 Arrows");
        secondEquipmentChoice.add("Shortsword");
        thirdEquipmentChoice.add("Burglar's Pack");
        thirdEquipmentChoice.add("Dungeoneer's Pack");
        thirdEquipmentChoice.add("Explorer's Pack");
        guaranteedEquipment.add("Leather Armor");
        guaranteedEquipment.add("Two Daggers");
        guaranteedEquipment.add("Thieves' Tools");
    }

    public String getKlasse() {
        return Classes.Rogue.toString();
    }
}
