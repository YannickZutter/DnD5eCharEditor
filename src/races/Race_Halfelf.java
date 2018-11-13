package races;

import java.util.ArrayList;

public class Race_Halfelf extends InitRace {

    private ArrayList<String> racialBonus = new ArrayList<>();
    private ArrayList<String> subRacialBonus = new ArrayList<>();
    private ArrayList<String> languages = new ArrayList<>();

    private String size;
    private int speed;
    String name;

    public Race_Halfelf(String name, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {

        super(name, strength, dexterity, constitution, intelligence, wisdom, charisma);
        racialBonus.add("Increase the Score of two abilities of your choice by 1");
        racialBonus.add("Speak one additional language of your choice");
        racialBonus.add("Darkvision");
        racialBonus.add("Fey Ancestry");
        racialBonus.add("Skill Versatility");
        languages.add("Common");
        languages.add("Elven");
        size = "medium";
        speed =30;
    }


    public String getRasse() {
        return Races.Halfelf.toString();
    }

    public ArrayList<String> getRacialBonus() {
        return racialBonus;
    }

    public ArrayList<String> getSubRacialBonus() {
        return subRacialBonus;
    }

    public ArrayList<String> getLanguages() {
        return languages;
    }

    public String getSize() {
        return size;
    }

    public int getSpeed() {
        return speed;
    }

}
