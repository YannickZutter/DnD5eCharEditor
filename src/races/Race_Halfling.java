package races;

import java.util.ArrayList;

public class Race_Halfling extends InitRace {

    private ArrayList<String> racialBonus = new ArrayList<>();
    private ArrayList<String> subRacialBonus = new ArrayList<>();
    private ArrayList<String> languages = new ArrayList<>();

    private String size;
    private int speed;
    String name;

    public Race_Halfling(String name, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {

        super(name, strength, dexterity+2, constitution, intelligence, wisdom, charisma);
        racialBonus.add("Lucky");
        racialBonus.add("Brave");
        racialBonus.add("Nimble");
        languages.add("Common");
        languages.add("Halfling");
        size = "small";
        speed =25;
    }


    public String getRasse() {
        return Races.Halfling.toString();
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
