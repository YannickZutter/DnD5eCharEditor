package classes;

import java.util.ArrayList;

public class Class_Fighter extends InitClass {

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

    public Class_Fighter() {

        numHitDie =1 ;
        hitDice = "d10";
        proficiencyBonus = 2;
        hitpoints = 10;
        savingThrows.add("Strenght");
        savingThrows.add("Constitution");
        skills.add("Acrobatics");
        skills.add("Animal Handling");
        skills.add("Athletics");
        skills.add("History");
        skills.add("Insight");
        skills.add("Intimidation");
        skills.add("Perception");
        skills.add("Survival");
        features.add("Fighting Style");
        features.add("Second Wind");
        proficiencies.add("All Armor");
        proficiencies.add("Shields");
        proficiencies.add("Simple Weapons");
        proficiencies.add("Martial Weapons");
        firstEquipmentChoice.add("Chain Mail");
        firstEquipmentChoice.add("Leather, Longbow and 20 Arrows");
        secondEquipmentChoice.add("Martial Weapon and a Shield");
        secondEquipmentChoice.add("Two Martial Weapons");
        thirdEquipmentChoice.add("Light Crossbow and 20 Bolts");
        thirdEquipmentChoice.add("Light Crossbow and 20 Bolts");
        thirdEquipmentChoice.add("Two Handaxes");
        fourthEquipmentChoice.add("Dungeoneer's Pack");
        fourthEquipmentChoice.add("Explorer's Pack");
    }

    public String getKlasse() {
        return Classes.Fighter.toString();
    }
}
