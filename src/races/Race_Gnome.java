package races;

import java.util.ArrayList;

public class Race_Gnome extends InitRace {

    private ArrayList<String> racialBonus = new ArrayList<>();
    private ArrayList<String> subRacialBonus = new ArrayList<>();
    private ArrayList<String> languages = new ArrayList<>();

    private String size;
    private int speed;
    String name;

    public Race_Gnome(String name, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {

        super(name, strength, dexterity, constitution, intelligence+2, wisdom, charisma);
        racialBonus.add("Darkvision");
        racialBonus.add("Gnome Cunning");
        languages.add("Common");
        languages.add("Gnomish");
        size = "small";
        speed =25;
    }


    public String getRasse() {
        return Races.Gnome.toString();
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
