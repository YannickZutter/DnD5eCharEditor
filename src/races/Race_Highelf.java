package races;

import java.util.ArrayList;

public class Race_Highelf extends Race_Elf {

    private ArrayList<String> subRacialBonus;
    private ArrayList<String> languages;

    public Race_Highelf(String name, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {

        super(name, strength, dexterity, constitution, intelligence+1, wisdom, charisma);
        subRacialBonus = super.getSubRacialBonus();
        subRacialBonus.add("Elf Weapon Training");
        subRacialBonus.add("Cantrip(Intelligence)");
        languages = super.getLanguages();
        languages.add("additional language fo your choice");

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
        return Races.Highelf.toString();
    }
}
