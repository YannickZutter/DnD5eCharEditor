package classes;

import java.util.ArrayList;

public class Class_Wizard extends InitClass {

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

    public Class_Wizard() {

        numHitDie = 1;
        hitDice = "d6";
        proficiencyBonus = 2;
        hitpoints = 6;
        savingThrows.add("Intelligence");
        savingThrows.add("Wisdom");
        skills.add("Arcana");
        skills.add("History");
        skills.add("Insight");
        skills.add("Investigation");
        skills.add("Medicine");
        skills.add("Religion");
        features.add("Spellcasting");
        features.add("Arcane Recovery");
        proficiencies.add("Daggers");
        proficiencies.add("Darts");
        proficiencies.add("Slings");
        proficiencies.add("Quarterstaffs");
        proficiencies.add("Light Crossbows");
        firstEquipmentChoice.add("Quarterstaff");
        firstEquipmentChoice.add("Dagger");
        secondEquipmentChoice.add("Component Pouch");
        secondEquipmentChoice.add("Arcane Focus");
        thirdEquipmentChoice.add("Scholar's Pack");
        thirdEquipmentChoice.add("Explorer's Pack");
        guaranteedEquipment.add("Spellbook");
    }

    public String getKlasse() {
        return Classes.Wizard.toString();
    }
}
