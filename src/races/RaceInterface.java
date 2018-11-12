package races;

import java.util.List;

public interface RaceInterface {

    String getName();
    String getRasse();
    String getKlasse();
    int getStrength();
    int getDexterity();
    int getConstitution();
    int getIntelligence();
    int getWisdom();
    int getCharisma();
    String[] getRacialBonus();
    String[] getLanguages();
    String getSize();
    List<String> getAllAttributes();

    void setName();
    void setRasse();
    void setKlasse();
    void setStrength();
    void setDexterity();
    void setConstitution();
    void setIntelligence();
    void setWisdom();
}
