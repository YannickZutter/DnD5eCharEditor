package races;

import java.util.ArrayList;

public class Race_Halforc extends InitRace {

    private ArrayList<String> racialBonus = new ArrayList<>();
    private ArrayList<String> subRacialBonus = new ArrayList<>();
    private ArrayList<String> languages = new ArrayList<>();

    private String size;
    private int speed;
    String name;

    public Race_Halforc(String name, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {

        super(name, strength+2, dexterity, constitution+1, intelligence, wisdom, charisma);
        racialBonus.add("Darkvision");
        racialBonus.add("Menacing");
        racialBonus.add("Relentless Endurance");
        racialBonus.add("Savage Attacks");
        languages.add("Common");
        languages.add("Ore");
        size = "medium";
        speed =30;
    }


    public String getRasse() {
        return Races.Halforc.toString();
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
