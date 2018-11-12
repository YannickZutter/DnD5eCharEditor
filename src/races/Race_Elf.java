package races;

import java.util.ArrayList;

public class Race_Elf extends InitRace{

    private ArrayList<String> racialBonus = new ArrayList<>();
    private ArrayList<String> subRacialBonus = new ArrayList<>();
    private ArrayList<String> languages = new ArrayList<>();

    private String size;
    private int speed;
    String name;

    public Race_Elf(String name, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma){

        super(name, strength, dexterity+2, constitution, intelligence, wisdom, charisma+2);
        racialBonus.add("Darkvision");
        racialBonus.add("Keen Senses");
        racialBonus.add("Fey Ancestry");
        racialBonus.add("Trance");
        languages.add("Common");
        languages.add("Elven");
        size = "medium";
        speed = 30;
    }
    
    public String getRasse(){
        return Races.Elf.toString();
    }
    public ArrayList<String> getRacialBonus(){
        return racialBonus;
    }
    public ArrayList<String> getSubRacialBonus(){
        return subRacialBonus;
    }
    public ArrayList<String> getLanguages(){
        return languages;
    }
    public String getSize(){
        return size;
    }
    public int getSpeed(){
        return speed;
    }

}
