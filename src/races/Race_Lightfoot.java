package races;

import java.util.ArrayList;

public class Race_Lightfoot extends Race_Halfling {

    private ArrayList<String> subRacialBonus;
    private ArrayList<String> languages;

    public Race_Lightfoot(String name, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {

        super(name, strength, dexterity, constitution, intelligence, wisdom, charisma+1);
        subRacialBonus = super.getSubRacialBonus();
        subRacialBonus.add("Natural Stealthy");
        languages = super.getLanguages();
        languages.add("");

    }

    public ArrayList<String> getSubRacialBonus() {
        return subRacialBonus;
    }

    @Override
    public ArrayList getLanguages() {
        return languages;
    }

    @Override
    public String getRasse() {
        return Races.Lightfoot.toString();
    }
}
