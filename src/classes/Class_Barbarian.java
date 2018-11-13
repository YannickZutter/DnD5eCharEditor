package classes;

import java.util.ArrayList;

public class Class_Barbarian extends InitClass{

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

    public Class_Barbarian(){

        numHitDie = 1;
        hitDice = "d12";
        proficiencyBonus = 2;
        hitpoints = 12;
        savingThrows.add("Strength");
        savingThrows.add("Constitution");
        skills.add("Animal Handling");
        skills.add("Athletics");
        skills.add("Intimidation");
        skills.add("Nature");
        skills.add("Perception");
        skills.add("Survival");
        features.add("Rage");
        features.add("Unarmored Defense");
        proficiencies.add("Light Armor");
        proficiencies.add("Medium Armor");
        proficiencies.add("Shields");
        proficiencies.add("Simple Weapons");
        proficiencies.add("Martial Weapons");
        firstEquipmentChoice.add("Greataxe");
        firstEquipmentChoice.add("Martial Meelee Weapon");
        secondEquipmentChoice.add("Two Handaxes");
        secondEquipmentChoice.add("Any Simple Weapon");
        guaranteedEquipment.add("Explorer's Pack");
        guaranteedEquipment.add("Four Javelins");
    }

    public String getKlasse(){
        return Classes.Barbarian.toString();
    }
}
