package DesignPattern.part1;

public class CuddlyToy extends Pet{
    public CuddlyToy(int hunger, int size) {
        super.hunger = hunger;
        super.size = size;
        super.setGrowtgStrategy(new NerverGrowsStrategy());
    }

    @Override
    public String toString() {
        return "Đồ Chơi thôi m";
    }
}
