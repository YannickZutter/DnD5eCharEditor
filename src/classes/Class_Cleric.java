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
        savingThrows.add("Wisdom");
        savingThrows.add("Charisma");
        skills.add("History");
        skills.add("Insight");
        skills.add("Medicine");
        skills.add("Persuasion");
        skills.add("Religion");
        proficiencies.add("");
        firstEquipmentChoice.add("");
        firstEquipmentChoice.add("");
        secondEquipmentChoice.add("");
        secondEquipmentChoice.add("");
        guaranteedEquipment.add("");
        guaranteedEquipment.add("");
    }

    public String getKlasse() {
        return Classes.ENTERCLASS.toString();
    }
}
