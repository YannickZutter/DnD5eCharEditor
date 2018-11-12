package races;

import java.util.ArrayList;

public class Race_Eladrin extends Race_Elf {

    private ArrayList<String> subRacialBonus;
    private ArrayList<String> languages;

    public Race_Eladrin(String name, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {

        super(name, strength, dexterity, constitution, intelligence, wisdom, charisma+1);
        subRacialBonus = super.getSubRacialBonus();
        subRacialBonus.add("Fey Step");
    }

    public ArrayList<String> getSubRacialBonus() {
        return subRacialBonus;
    }

    @Override
    public String getRasse() {
        return Races.Eladrin.toString();
    }
}
