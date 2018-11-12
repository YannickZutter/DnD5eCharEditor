package main;

import races.Race_Duergar;
import races.Race_Dwarf;

import java.util.ArrayList;

public class Start {

    public static void main(String[] args) {

        Race_Dwarf dwarf = new Race_Dwarf("a", 1, 1, 1, 1, 1, 1);
        Race_Duergar duergar = new Race_Duergar("d", 2, 2, 2, 2, 2, 2);

        System.out.println("Languages dwarf:");
        for(int i = 0; i< dwarf.getLanguages().size(); i++){
            System.out.println(dwarf.getLanguages().get(i));
        }
        System.out.println("Languages duergar:");
        for(int i = 0; i < duergar.getLanguages().size(); i++){
            System.out.println(duergar.getLanguages().get(i));
        }
    }
}
