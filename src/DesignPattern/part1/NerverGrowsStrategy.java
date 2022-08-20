package DesignPattern.part1;

public class NerverGrowsStrategy implements GrowtgStrategy{
    @Override
    public boolean canGrow() {
        return false;
    }

    @Override
    public void grow() {
        System.out.println("Không bao giờ phát triển");
    }
}
