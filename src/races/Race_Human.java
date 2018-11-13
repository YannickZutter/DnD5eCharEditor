package races;

import java.util.ArrayList;

public class Race_Human extends InitRace {

    private ArrayList<String> racialBonus = new ArrayList<>();
    private ArrayList<String> subRacialBonus = new ArrayList<>();
    private ArrayList<String> languages = new ArrayList<>();

    private String size;
    private int speed;
    String name;

    public Race_Human(String name, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {

        super(name, strength+1, dexterity+1, constitution+1, intelligence+1, wisdom+1, charisma+1);
        racialBonus.add("You can speak one language of your choice");
        languages.add("Common");
        size = "medium";
        speed = 30;
    }


    public String getRasse() {
        return Races.Human.toString();
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
