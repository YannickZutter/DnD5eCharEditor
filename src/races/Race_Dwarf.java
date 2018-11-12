package races;

import java.util.ArrayList;

public class Race_Dwarf extends InitRace{

    private ArrayList<String> racialBonus = new ArrayList<>();
    private ArrayList<String> subRacialBonus = new ArrayList<>();
    private ArrayList<String> languages = new ArrayList<>();

    private String size;
    private int speed;
    String name;

    public Race_Dwarf(String name, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma){

        super(name, strength, dexterity, constitution+2, intelligence, wisdom, charisma+2);
        racialBonus.add("Your speed is not reduced by wearing heavy armor");
        racialBonus.add("Darkvision");
        racialBonus.add("Dwarven Resiliance");
        racialBonus.add("Dwarven Combat Training");
        racialBonus.add("Tool Proficiency");
        racialBonus.add("Stonecunning");
        languages.add("Common");
        languages.add("Dwarvish");
        size = "medium";
        speed = 25;
    }


    public String getRasse(){
        return Races.Dragonborn.toString();
    }
    public ArrayList<String> getRacialBonus(){
        return racialBonus;
    }
    public ArrayList<String> getSubRacialBonus(){
        return subRacialBonus;
    }
    public ArrayList<String> getLanguages(){
        return languages;
    }
    public String getSize(){
        return size;
    }
    public int getSpeed(){
        return speed;
    }

}
