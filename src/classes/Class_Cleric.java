package classes;

import java.util.ArrayList;

public class Class_Cleric extends InitClass {

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

    public Class_Cleric() {

        numHitDie = 1;
        hitDice = "d8";
        proficiencyBonus = 2;
        hitpoints = 8;
        savingThrows.add("Wisdom");
        savingThrows.add("Charisma");
        skills.add("History");
        skills.add("Insight");
        skills.add("Medicine");
        skills.add("Persuasion");
        skills.add("Religion");
        features.add("Spellcasting");
        features.add("Divine Domain");
        proficiencies.add("Light Armor");
        proficiencies.add("Medium Armor");
        proficiencies.add("Shields");
        proficiencies.add("All Simple Weapons");
        firstEquipmentChoice.add("Mace");
        firstEquipmentChoice.add("Warhammer");
        secondEquipmentChoice.add("Scale Mail");
        secondEquipmentChoice.add("Leather Armor");
        secondEquipmentChoice.add("Chain Mail");
        thirdEquipmentChoice.add("Light Crossbow and 20 Bolts");
        thirdEquipmentChoice.add("Any Simple Weapon");
        fourthEquipmentChoice.add("Priest's Pack");
        fourthEquipmentChoice.add("Explorer's Pack");
        guaranteedEquipment.add("Shield");
        guaranteedEquipment.add("Holy Symbol");
    }

    public String getKlasse() {
        return Classes.Cleric.toString();
    }
}
