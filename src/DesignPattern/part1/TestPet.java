package DesignPattern.part1;

import java.util.LinkedList;
import java.util.List;

public class TestPet {
    public static void main(String[] args) {
        List<Pet> pets = new LinkedList<Pet>();

        pets.add(new Cat(1, 14));
        pets.add(new Goat(0, 18));
        pets.add(new MagicDragon(1, 24));
        pets.add(new CuddlyToy(0, 10));

        for (Pet pet : pets) {
            System.out.println("---------");
            System.out.println(pet.cry());
            System.out.println(pet.canGrow());
            pet.grow();
            System.out.println(pet.toString());
            pet.timePasses();
            // pet.feed("Khong Lam thi co an cut thoi noi cho nhanh");
        }
    }    
}
