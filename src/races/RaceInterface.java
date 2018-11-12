package races;

import java.util.ArrayList;

public interface RaceInterface {

    String getName();
    String getRasse();
    int getStrength();
    int getDexterity();
    int getConstitution();
    int getIntelligence();
    int getWisdom();
    int getCharisma();
    int getSpeed();
    ArrayList<String> getRacialBonus();
    ArrayList<String> getSubRacialBonus();
    ArrayList<String> getLanguages();
    String getSize();
    ArrayList<String> getAllAttributes();
}
