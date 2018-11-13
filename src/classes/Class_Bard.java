package classes;

import java.util.ArrayList;

public class Class_Bard extends InitClass{

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

    public Class_Bard(){

        numHitDie = 1;
        hitDice = "d8";
        proficiencyBonus = 2;
        hitpoints = 8;
        savingThrows.add("Dexterity");
        savingThrows.add("Charisma");
        skills.add("Acrobatics");
        skills.add("Animal Handling");
        skills.add("Arcana");
        skills.add("Athletics");
        skills.add("Deception");
        skills.add("History");
        skills.add("Insight");
        skills.add("Intimidation");
        skills.add("Investigation");
        skills.add("Medicine");
        skills.add("Nature");
        skills.add("Perception");
        skills.add("Performance");
        skills.add("Persuasion");
        skills.add("Religion");
        skills.add("Sleight of Hand");
        skills.add("Stealth");
        skills.add("Survival");
        features.add("Spellcasting");
        features.add("Bardic Inspiration");
        proficiencies.add("Light Armor");
        firstEquipmentChoice.add("Greataxe");
        firstEquipmentChoice.add("Martial Meelee Weapon");
        secondEquipmentChoice.add("Two Handaxes");
        secondEquipmentChoice.add("Any Simple Weapon");
        guaranteedEquipment.add("Explorer's Pack");
        guaranteedEquipment.add("Four Javelins");
    }

    public String getKlasse(){
        return Classes.Bard.toString();
    }
}
