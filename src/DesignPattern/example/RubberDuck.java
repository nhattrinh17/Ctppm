package DesignPattern.example;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }
    
    @Override
    void display() {
        System.out.println("I'm Rubber Duck");
    }
}
