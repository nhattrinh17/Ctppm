package DesignPattern.part1;

public class Pet {
    protected int hunger;
    protected int size;
    private GrowtgStrategy growtgStrategy;

    public boolean canGrow() {
        return growtgStrategy.canGrow();
    }

    public String cry() {
        return "Không biết khóc";
    }

    public String describe() {
        String result  = "Hunger: " + this.hunger + ", size:" + this.size ;
        return result;
    }

    public void feed(String food) {
        if(food.trim() != "") {
            this.hunger = 0;
            System.out.println("Feeding: " + food);
        } else {
            System.out.println("Chưa thêm thức ăn");
        }
    }

    public int getHunger() {
        return hunger;
    }

    public void grow() {
        growtgStrategy.grow();
    }

    protected boolean isGrown() {
        if(size > 0) {
            return true;
        }
        return false;
    }

    public boolean isHungry() {
        if(this.hunger > 0) {
            return true;
        }
        return false;
    }

    public void timePasses() {
        System.out.println("1 year later");
    }

    public void setGrowtgStrategy(GrowtgStrategy growtgStrategy) {
        this.growtgStrategy = growtgStrategy;
    }

    public String toString() {
        return "Hunger: " + this.hunger + ", size:" + this.size;        
    }
}
