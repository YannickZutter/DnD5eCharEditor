package classes;

import java.util.ArrayList;

public class InitClass implements ClassInterface{

    private int numHitDie;
    private String hitDice;
    private int proficiencyBonus;
    private int hitpoints;
    private ArrayList<String> savingThrows = new ArrayList<>();
    private ArrayList<String> skills = new ArrayList<>();
    private ArrayList<String> features = new ArrayList<>();
    private ArrayList<String> proficiencies = new ArrayList<>();
    private ArrayList<String> firstEquipmentChoice = new ArrayList<>();
    private ArrayList<String> secondEquipmentChoice = new ArrayList<>();
    private ArrayList<String> thirdEquipmentChoice = new ArrayList<>();
    private ArrayList<String> fourthEquipmentChoice = new ArrayList<>();
    private ArrayList<String> garanteedEquipment = new ArrayList<>();

    @Override
    public int getNumHitDie(){
        return numHitDie;
    }
    @Override
    public String getHitDice(){
        return hitDice;
    }
    @Override
    public int getHitpoints(int constitution){
        return hitpoints+constitution;
    }
    @Override
    public int getProficiencyBonus(){
        return proficiencyBonus;
    }
    @Override
    public ArrayList<String> getSavingThrows(){
        return savingThrows;
    }
    @Override
    public ArrayList<String> getSkills(){
        return skills;
    }
    @Override
    public ArrayList<String> getFeatures(){
        return features;
    }
    @Override
    public ArrayList<String> getProficiencies(){
        return proficiencies;
    }
    @Override
    public ArrayList<String> getFirstEquipmentChoice(){
        return firstEquipmentChoice;
    }
    @Override
    public ArrayList<String> getSecondEquipmentChoice(){
        return secondEquipmentChoice;
    }
    @Override
    public ArrayList<String> getThirdEquipmentChoice(){
        return thirdEquipmentChoice;
    }
    @Override
    public ArrayList<String> getFourthEquipmentChoice(){
        return fourthEquipmentChoice;
    }
    @Override
    public ArrayList<String> getGuaranteedEquipment(){
        return garanteedEquipment;
    }
    @Override
    public ArrayList<String> getAllFeatures(int constitution){
        ArrayList<String> temp = new ArrayList<>();

        temp.add(String.valueOf(getNumHitDie()));
        temp.add(getHitDice());
        temp.add(String.valueOf(getHitpoints(constitution)));
        temp.add(String.valueOf(getProficiencyBonus()));
        for(int i = 0; i < getSavingThrows().size(); i++){
            temp.add(getSavingThrows().get(i));
        }
        for(int i = 0; i < getSkills().size(); i++){
            temp.add(getSkills().get(i));
        }
        for(int i = 0; i < getFeatures().size(); i++){
            temp.add(getFeatures().get(i));
        }
        for(int i = 0; i < getProficiencies().size(); i++){
            temp.add(getProficiencies().get(i));
        }
        for(int i = 0; i < getFirstEquipmentChoice().size(); i++){
            temp.add(getFirstEquipmentChoice().get(i));
        }
        for(int i = 0; i < getSecondEquipmentChoice().size(); i++){
            temp.add(getSecondEquipmentChoice().get(i));
        }
        for(int i = 0; i < getThirdEquipmentChoice().size(); i++){
            temp.add(getThirdEquipmentChoice().get(i));
        }
        for(int i = 0; i < getFourthEquipmentChoice().size(); i++){
            temp.add(getFourthEquipmentChoice().get(i));
        }
        for(int i = 0; i < getGuaranteedEquipment().size(); i++){
            temp.add(getGuaranteedEquipment().get(i));
        }
        return temp;
    }

}
