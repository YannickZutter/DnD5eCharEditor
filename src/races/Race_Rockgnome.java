package races;

import java.util.ArrayList;

public class Race_Rockgnome extends Race_Gnome {

    private ArrayList<String> subRacialBonus;

    public Race_Rockgnome(String name, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {

        super(name, strength, dexterity, constitution+1, intelligence, wisdom, charisma);
        subRacialBonus = super.getSubRacialBonus();
        subRacialBonus.add("Artificer's Lore");
        subRacialBonus.add("Tinker");
    }

    public ArrayList<String> getSubRacialBonus() {
        return subRacialBonus;
    }

    @Override
    public String getRasse() {
        return Races.Rockgnome.toString();
    }
}
