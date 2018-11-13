package classes;

import java.util.ArrayList;

public class Class_Paladin extends InitClass {

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

    public Class_Paladin() {

        numHitDie = 1;
        hitDice = "d10";
        proficiencyBonus = 2;
        hitpoints = 10;
        savingThrows.add("Wisdom");
        savingThrows.add("Charisma");
        skills.add("Athletics");
        skills.add("Insight");
        skills.add("Intimidation");
        skills.add("Medicine");
        skills.add("Persuasion");
        skills.add("Religion");
        features.add("Divine Sense");
        proficiencies.add("Lay on Hands");
        firstEquipmentChoice.add("Martial Weapon and a Shield");
        firstEquipmentChoice.add("Two Martial Weapons");
        secondEquipmentChoice.add("5 Javelins");
        secondEquipmentChoice.add("Any Simple Melee Weapon");
        thirdEquipmentChoice.add("Priest's Pack");
        thirdEquipmentChoice.add("Explorer's Pack");
        guaranteedEquipment.add("Chain Mail");
        guaranteedEquipment.add("Holy Symbol");
    }

    public String getKlasse() {
        return Classes.Paladin.toString();
    }
}
