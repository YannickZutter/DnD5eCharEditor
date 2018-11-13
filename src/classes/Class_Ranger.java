package classes;

import java.util.ArrayList;

public class Class_Ranger extends InitClass {

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

    public Class_Ranger() {

        numHitDie = 1;
        hitDice = "d10";
        proficiencyBonus = 2;
        hitpoints = 10;
        savingThrows.add("Strength");
        savingThrows.add("Dexterity");
        skills.add("Animal Handling");
        skills.add("Athletics");
        skills.add("Insight");
        skills.add("Investigation");
        skills.add("Nature");
        skills.add("Perception");
        skills.add("Stealth");
        skills.add("Survival");
        features.add("Favored Enemy");
        features.add("Natural Explorer");
        proficiencies.add("Light Armor");
        proficiencies.add("Medium Armor");
        proficiencies.add("Shields");
        proficiencies.add("Simple Weapons");
        proficiencies.add("Martial Weapons");
        firstEquipmentChoice.add("Scale Mail");
        firstEquipmentChoice.add("Leather Armor");
        secondEquipmentChoice.add("Two Shortswords");
        secondEquipmentChoice.add("Two Simple Melee Weapons");
        thirdEquipmentChoice.add("Dungeoneer's Pack");
        thirdEquipmentChoice.add("Explorer's Pack");
        guaranteedEquipment.add("Longbow");
        guaranteedEquipment.add("Quiver of 20 Arrows");
    }

    public String getKlasse() {
        return Classes.Ranger.toString();
    }
}
