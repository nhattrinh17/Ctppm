package DesignPattern.part1;

public class Cat extends Pet{

    public Cat(int hunger, int size) {
        super.hunger = hunger;
        super.size = size;
        super.setGrowtgStrategy(new SteadyGrowthStrategy());
    }

    @Override
    public String cry() {
        String result  = "Mèo méo meo mèo meo";
        return result;
    }

    @Override
    public String toString() {
        return "Cat's current status: " + super.toString();
    }
}
