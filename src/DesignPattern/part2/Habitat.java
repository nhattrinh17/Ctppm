package DesignPattern.part2;

import java.util.ArrayList;
import DesignPattern.part1.*;;

public abstract class Habitat {
    private ArrayList<Pet> occupants;
    private  ArrayList<Habitat> habitats;

    public int addOccupant(Pet pet) {
        occupants.add(pet);
        return occupants.size();
    }

    public ArrayList<Pet> getOccupants() {
        return occupants;
    }

    public int removeOccupant(Pet pet) {
        int index = occupants.indexOf(pet);
        occupants.remove(index);
        return occupants.size();
    }

    public String describe() {
        String result = "";
        for (Habitat habitat : habitats) {
            result += (habitat.describe() + "---");
        }
        return result;
    };

    public void addChild(Habitat habitat) {
        habitats.add(habitat);
    }

    public void removeChild(Habitat habitat) {
        habitats.remove(habitats.indexOf(habitat));
    }

    public ArrayList<Habitat> getChildren() {
        return habitats;
    }
}
