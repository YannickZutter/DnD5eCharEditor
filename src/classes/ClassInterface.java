package classes;

import java.lang.reflect.Array;
import java.util.ArrayList;

public interface ClassInterface {

    int getNumHitDie();
    String getHitDice();
    int getHitpoints(int constitution);
    int getProficiencyBonus();
    ArrayList<String> getSavingThrows();
    ArrayList<String> getSkills();
    ArrayList<String> getFeatures();
    ArrayList<String> getProficiencies();
    ArrayList<String> getFirstEquipmentChoice();
    ArrayList<String> getSecondEquipmentChoice();
    ArrayList<String> getThirdEquipmentChoice();
    ArrayList<String> getFourthEquipmentChoice();
    ArrayList<String> getGuaranteedEquipment();
    ArrayList<String> getAllFeatures(int constitution);
}
