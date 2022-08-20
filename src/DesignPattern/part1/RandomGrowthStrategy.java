package DesignPattern.part1;

public class RandomGrowthStrategy implements GrowtgStrategy {
    @Override
    public boolean canGrow() {
        return true;
    }

    @Override
    public void grow() {
        System.out.println("Phát triển 1 cách ngẫu nhiên");
    }
}
