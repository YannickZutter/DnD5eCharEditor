package races;

import java.util.ArrayList;

public class Race_Dragonborn extends InitRace{

    private ArrayList<String> racialBonus = new ArrayList<>();
    private ArrayList<String> subRacialBonus = new ArrayList<>();
    private ArrayList<String> languages = new ArrayList<>();

    private String size;
    private int speed;
    String name;

    public Race_Dragonborn(String name, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma){

        super(name, strength+2, dexterity, constitution, intelligence, wisdom, charisma+2);
        racialBonus.add("Breath Weapon");
        racialBonus.add("Damage resistance according to ancestry");
        languages.add("Common");
        languages.add("Draconic");
        size = "medium";
        speed = 30;
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
