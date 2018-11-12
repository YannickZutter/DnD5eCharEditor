package races;

import java.util.ArrayList;

public abstract class InitRace implements RaceInterface {

    private String name;
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int speed;

    public InitRace(){

    }

    public InitRace(String name, int strength, int dexterity, int constitution, int intelligence,
                  int wisdom, int charisma)
    {
        this.name = name;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getStrength() {
        return strength;
    }

    @Override
    public int getDexterity() {
        return dexterity;
    }

    @Override
    public int getConstitution() {
        return constitution;
    }

    @Override
    public int getIntelligence() {
        return intelligence;
    }

    @Override
    public int getWisdom() {
        return wisdom;
    }

    @Override
    public int getCharisma() {
        return charisma;
    }

    @Override
    public int getSpeed(){
        return speed;
    }
    public ArrayList<String> getAllAttributes(){

        ArrayList<String> attributes = new ArrayList<String>();

        attributes.add(getName());
        attributes.add(getRasse());
        attributes.add(String.valueOf(getStrength()));
        attributes.add(String.valueOf(getDexterity()));
        attributes.add(String.valueOf(getConstitution()));
        attributes.add(String.valueOf(getIntelligence()));
        attributes.add(String.valueOf(getWisdom()));
        attributes.add(String.valueOf(getCharisma()));
        attributes.add(String.valueOf(getSpeed()));
        for(int i = 0; i<getRacialBonus().size(); i++){
            attributes.add(getRacialBonus().get(i));
        }
        for(int i = 0; i<getSubRacialBonus().size(); i++){
            attributes.add(getSubRacialBonus().get(i));
        }
        for(int i = 0; i<getLanguages().size(); i++){
            attributes.add(getLanguages().get(i));
        }
        attributes.add(String.valueOf(getSize()));
        return attributes;
    }
}
