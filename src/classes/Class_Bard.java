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
        proficiencies.add("Simple Weapons");
        proficiencies.add("Hand Crossbows");
        proficiencies.add("Longswords");
        proficiencies.add("Rapiers");
        proficiencies.add("Shortswords");
        proficiencies.add("Three Musical Instruments of Your Choice");
        firstEquipmentChoice.add("Rapier");
        firstEquipmentChoice.add("Longsword");
        firstEquipmentChoice.add("Any Simple Weapon");
        secondEquipmentChoice.add("Diplomat's Pack");
        secondEquipmentChoice.add("Entertainer's Pack");
        thirdEquipmentChoice.add("Lute");
        thirdEquipmentChoice.add("Any Other Musical Instrument");
        guaranteedEquipment.add("Leather Armor");
        guaranteedEquipment.add("Dagger");
    }

    public String getKlasse(){
        return Classes.Bard.toString();
    }
}
