package classes;

import java.util.ArrayList;

public class Class_Monk extends InitClass {

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

    public Class_Monk() {

        numHitDie = 1;
        hitDice = "d8";
        proficiencyBonus = 2;
        hitpoints = 8;
        savingThrows.add("Strength");
        savingThrows.add("Dexterity");
        skills.add("Acrobatics");
        skills.add("Athletics");
        skills.add("History");
        skills.add("Insight");
        skills.add("Religion");
        skills.add("Stealth");
        features.add("Unarmored Defense");
        features.add("Martial Arts");
        proficiencies.add("Simple Weapons");
        proficiencies.add("Shortswords");
        proficiencies.add("One Type of Artisan's Tool Musical Instrument");
        firstEquipmentChoice.add("Shortsword");
        firstEquipmentChoice.add("Any Simple Weapon");
        secondEquipmentChoice.add("Dungeoneer's Pack");
        secondEquipmentChoice.add("Explorer's Pack");
        guaranteedEquipment.add("10 Darts");
    }

    public String getKlasse() {
        return Classes.Monk.toString();
    }
}
