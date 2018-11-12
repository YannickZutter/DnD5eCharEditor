package races;

import java.util.ArrayList;

public class Race_Seaelf extends Race_Elf {

    private ArrayList<String> subRacialBonus;
    private ArrayList<String> languages;

    public Race_Seaelf (String name, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {

        super(name, strength, dexterity, constitution+1, intelligence, wisdom, charisma);
        subRacialBonus = super.getSubRacialBonus();
        subRacialBonus.add("Sea Elf Training");
        subRacialBonus.add("Child of the Sea");
        subRacialBonus.add("Friend of the Sea");
        languages = super.getLanguages();
        languages.add("Aquan");

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
        return Races.Seaelf.toString();
    }
}
