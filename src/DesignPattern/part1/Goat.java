package DesignPattern.part1;

public class Goat extends Pet {

    public Goat(int hunger, int size) {
        super.hunger = hunger;
        super.size = size;
        super.setGrowtgStrategy(new SteadyGrowthStrategy());
    }

    @Override
    public String cry() {
        String result  = "Be be Bê bê";
        return result;
    }

    @Override
    public String toString() {
        return "Goat's current status: " + super.toString();
    }
}
