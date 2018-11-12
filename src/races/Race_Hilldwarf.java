package races;

import java.util.ArrayList;

public class Race_Hilldwarf extends Race_Dwarf {

    private ArrayList<String> subRacialBonus;

    public Race_Hilldwarf (String name, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {

        super(name, strength, dexterity, constitution, intelligence, wisdom+1, charisma);
        subRacialBonus = super.getSubRacialBonus();
        subRacialBonus.add("Dwarven Toughness");
    }

    public ArrayList<String> getSubRacialBonus() {
        return subRacialBonus;
    }

    @Override
    public String getRasse() {
        return Races.Hilldwarf.toString();
    }
}
