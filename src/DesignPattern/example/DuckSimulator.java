package DesignPattern.example;

import java.util.*;

public class DuckSimulator {
    public static void main(String[] args) {
        List<Duck> ducks = new LinkedList<>();

        Duck myDuck = new RubberDuck();

        ducks.add(new MallardDuck());
        ducks.add(new DecoyDuck());
        ducks.add(new RedheadDuck());

        ducks.add(myDuck);

        processDuck(ducks);

        myDuck.setFlyBehavior(new FlyRocketPowered());
        myDuck.setQuackBehavior(new Squeak());

        System.out.println("Sau khi thay đổi");

        processDuck(ducks);
    }

    public static void processDuck(List<Duck> ducks) {
        for (Duck duck : ducks) {
            System.out.println("------------");
            System.out.println("Name: " + duck.getClass().getName());
            duck.display();
            duck.perfromQuack();
            duck.perfromFly();
            duck.swim();
        }
    }
}
