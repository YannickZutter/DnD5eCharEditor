package races;

import java.util.ArrayList;

public class Race_Forestgnome extends Race_Gnome {

    private ArrayList<String> subRacialBonus;
    private ArrayList<String> languages;

    public Race_Forestgnome(String name, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {

        super(name, strength, dexterity+1, constitution, intelligence, wisdom, charisma);
        subRacialBonus = super.getSubRacialBonus();
        subRacialBonus.add("Natural Illusionist");
        subRacialBonus.add("Speak with Small Beasts");

    }

    public ArrayList<String> getSubRacialBonus() {
        return subRacialBonus;
    }

    @Override
    public String getRasse() {
        return Races.Forestgnome.toString();
    }
}
