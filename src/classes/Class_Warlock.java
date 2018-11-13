package classes;

import java.util.ArrayList;

public class Class_Warlock extends InitClass {

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

    public Class_Warlock() {

        numHitDie = 1;
        hitDice = "d8";
        proficiencyBonus = 2;
        hitpoints = 8;
        savingThrows.add("Wisdom");
        savingThrows.add("Charisma");
        skills.add("Arcana");
        skills.add("Deception");
        skills.add("History");
        skills.add("Intimidation");
        skills.add("Investigation");
        skills.add("Nature");
        skills.add("Religion");
        features.add("Otherworldly Patron");
        features.add("Pact Magic");
        proficiencies.add("Light Armor");
        proficiencies.add("Simple Weapons");
        firstEquipmentChoice.add("Light Crossbow and 20 Bolts");
        firstEquipmentChoice.add("Any Simple Weapon");
        secondEquipmentChoice.add("Component Pouch");
        secondEquipmentChoice.add("Arcane Focus");
        thirdEquipmentChoice.add("Scholar's Pack");
        thirdEquipmentChoice.add("Dungeoneer's Pack");
        guaranteedEquipment.add("Leather Armor");
        guaranteedEquipment.add("Any Simple Weapon");
        guaranteedEquipment.add("Two Daggers");
    }

    public String getKlasse() {
        return Classes.Warlock.toString();
    }
}
