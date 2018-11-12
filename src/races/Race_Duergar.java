package races;

import java.util.ArrayList;

public class Race_Duergar extends Race_Dwarf {

    private ArrayList<String> subRacialBonus;
    private ArrayList<String> languages;

    public Race_Duergar(String name, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {

        super(name, strength+1, dexterity, constitution, intelligence, wisdom, charisma);
        subRacialBonus = super.getSubRacialBonus();
        subRacialBonus.add("Superior Darkvision");
        languages = super.getLanguages();
        languages.add("Undercommon");

    }

    public ArrayList<String> getSubRacialBonus() {
        return subRacialBonus;
    }

    @Override
    public ArrayList getLanguages(){
        return languages;
    }

    @Override
    public String getRasse() {
        return Races.Duergar.toString();
    }
}
