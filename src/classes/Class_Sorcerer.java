package classes;

import java.util.ArrayList;

public class Class_Sorcerer extends InitClass {

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

    public Class_Sorcerer() {

        numHitDie = 1;
        hitDice = "d6";
        proficiencyBonus = 2;
        hitpoints = 6;
        savingThrows.add("Constitution");
        savingThrows.add("Charisma");
        skills.add("Arcana");
        skills.add("Deception");
        skills.add("Insight");
        skills.add("Intimidation");
        skills.add("Persuasion");
        skills.add("Religion");
        features.add("Spellcasting");
        features.add("Sorcerous Origin");
        proficiencies.add("Daggers");
        proficiencies.add("Darts");
        proficiencies.add("Slings");
        proficiencies.add("Quarterstaffs");
        proficiencies.add("Light Crossbows");
        firstEquipmentChoice.add("Light Crossbow and 20 Bolts");
        firstEquipmentChoice.add("Any Simple Weapon");
        secondEquipmentChoice.add("Component Pouch");
        secondEquipmentChoice.add("Arcane Focus");
        thirdEquipmentChoice.add("Dungeoneer's Pack");
        thirdEquipmentChoice.add("Explorer's Pack");
        guaranteedEquipment.add("Two Daggers");
    }

    public String getKlasse() {
        return Classes.Sorcerer.toString();
    }
}
