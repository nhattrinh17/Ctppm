package DesignPattern.example;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    abstract void display();

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void perfromFly() {
        flyBehavior.fly();
    }

    public void perfromQuack() {
        quackBehavior.quack();
    }
}
