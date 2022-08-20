package DesignPattern.part1;

public class SteadyGrowthStrategy implements GrowtgStrategy{
    @Override
    public boolean canGrow() {
        return true;
    }

    @Override
    public void grow() {
        System.out.println("Phát triển ổn định");
    }
}
