package races;

import java.util.ArrayList;

public class Race_Deepgnome extends Race_Gnome {

    private ArrayList<String> subRacialBonus;
    private ArrayList<String> languages;

    public Race_Deepgnome(String name, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {

        super(name, strength, dexterity+1, constitution, intelligence+2, wisdom, charisma);
        subRacialBonus = super.getSubRacialBonus();
        subRacialBonus.add("Superior Darkvision");
        subRacialBonus.add("Gnome Cunning");
        subRacialBonus.add("Stone Camouflage");
        languages = super.getLanguages();
        languages.add("Undercommon");

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
    return Races.Deepgnome.toString();
    }
}
