package races;

import java.util.ArrayList;

public class Race_Mountaindwarf extends Race_Dwarf {

    private ArrayList<String> subRacialBonus;

    public Race_Mountaindwarf (String name, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {

        super(name, strength+2, dexterity, constitution, intelligence, wisdom, charisma);
        subRacialBonus = super.getSubRacialBonus();
        subRacialBonus.add("Dwarven Armor Training");
    }

    public ArrayList<String> getSubRacialBonus() {
        return subRacialBonus;
    }

    @Override
    public String getRasse() {
        return Races.Mountaindwarf.toString();
    }
}
