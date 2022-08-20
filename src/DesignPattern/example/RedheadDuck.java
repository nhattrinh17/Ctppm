package DesignPattern.example;

public class RedheadDuck extends Duck{
    
    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    
    @Override
    void display() {
        System.out.println("I'm Red Head Duck");
    }
}
