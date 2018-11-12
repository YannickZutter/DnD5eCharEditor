package races;

import java.util.ArrayList;

public class Race_Shadarkai extends Race_Elf {

    private ArrayList<String> subRacialBonus;
    private ArrayList<String> languages;

    public Race_Shadarkai(String name, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {

        super(name, strength, dexterity, constitution+1, intelligence, wisdom, charisma);
        subRacialBonus = super.getSubRacialBonus();
        subRacialBonus.add("Necrotic Resistance");
        subRacialBonus.add("Blessing of the Raven Queen");
    }

    public ArrayList<String> getSubRacialBonus() {
        return subRacialBonus;
    }

    @Override
    public String getRasse() {
        return Races.Shadarkai.toString();
    }
}
