package DesignPattern.part1;

public class MagicDragon extends Pet {

    public MagicDragon(int hunger, int size) {
        super.hunger = hunger;
        super.size = size;
        super.setGrowtgStrategy(new RandomGrowthStrategy());
    }

    @Override
    public String cry() {
        String result  = "Kha Kha Khà Khà";
        return result;
    }

    @Override
    public String toString() {
        return "Goat's current status: " + super.toString();
    }
}
