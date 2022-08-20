package DesignPattern.example;

public class DecoyDuck extends Duck {
    
    public DecoyDuck() {
        flyBehavior = new FlyRocketPowered();
        quackBehavior = new MuteQuack();
    }

    @Override
    void display() {
        System.out.println("I'm Decoy Duck");
    }
}
