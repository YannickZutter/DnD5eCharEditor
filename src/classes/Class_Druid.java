package classes;

import java.util.ArrayList;

public class Class_Druid extends InitClass {

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

    public Class_Druid() {

        numHitDie = 1;
        hitDice = "d8";
        proficiencyBonus = 2;
        hitpoints = 8;
        savingThrows.add("Intelligence");
        savingThrows.add("Wisdom");
        skills.add("Arcana");
        skills.add("Animal Handling");
        skills.add("Insight");
        skills.add("Medicine");
        skills.add("Nature");
        skills.add("Perception");
        skills.add("Religion");
        skills.add("Survival");
        features.add("Druidic");
        features.add("Spellcasting");
        proficiencies.add("Light Armor");
        proficiencies.add("Medium Armor");
        proficiencies.add("Shields");
        proficiencies.add("Clubs");
        proficiencies.add("Daggers");
        proficiencies.add("Darts");
        proficiencies.add("Javelins");
        proficiencies.add("Maces");
        proficiencies.add("Quarterstaffs");
        proficiencies.add("Scimitars");
        proficiencies.add("Sickles");
        proficiencies.add("Slings");
        proficiencies.add("Spears");
        proficiencies.add("Herbalism Kit");
        firstEquipmentChoice.add("Wooden Shield");
        firstEquipmentChoice.add("Any Simple Weapon");
        secondEquipmentChoice.add("Scimitar");
        secondEquipmentChoice.add("Any Simple Weapon");
        guaranteedEquipment.add("Leather Armor");
        guaranteedEquipment.add("Explorer's Pack");
        guaranteedEquipment.add("Druidic Focus");
    }

    public String getKlasse() {
        return Classes.Druid.toString();
    }
}
