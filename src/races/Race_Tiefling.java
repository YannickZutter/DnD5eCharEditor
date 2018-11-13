package races;

import java.util.ArrayList;

public class Race_Tiefling extends InitRace {

    private ArrayList<String> racialBonus = new ArrayList<>();
    private ArrayList<String> subRacialBonus = new ArrayList<>();
    private ArrayList<String> languages = new ArrayList<>();

    private String size;
    private int speed;
    String name;

    public Race_Tiefling(String name, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {

        super(name, strength, dexterity, constitution, intelligence+1, wisdom, charisma);
        racialBonus.add("Increase either Charisma or Dexterity by 2");
        racialBonus.add("Darkvision");
        racialBonus.add("Hellish Resistance");
        racialBonus.add("Infernal Legacy");
        languages.add("Common");
        languages.add("Infernal");
        size = "medium";
        speed = 30;
    }


    public String getRasse() {
        return Races.Tiefling.toString();
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
