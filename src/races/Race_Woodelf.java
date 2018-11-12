package races;

import java.util.ArrayList;

public class Race_Woodelf extends Race_Elf {

    private ArrayList<String> subRacialBonus;
    private ArrayList<String> languages;

    public Race_Woodelf(String name, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {

        super(name, strength, dexterity, constitution, intelligence, wisdom+1, charisma);
        subRacialBonus = super.getSubRacialBonus();
        subRacialBonus.add("Elf Weapon Training");
        subRacialBonus.add("Fleet of Foot");
        subRacialBonus.add("Mask of the Wild");

    }

    public ArrayList<String> getSubRacialBonus() {
        return subRacialBonus;
    }


    @Override
    public String getRasse() {
        return Races.Woodelf.toString();
    }
}
