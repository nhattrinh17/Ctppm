package inheritanceOophw7;

public class Dog extends Mammal{
    public Dog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        if(another == null) {
            System.out.println("Dog object does not exist");
        } else {
            System.out.println("Wooof");
        }
    }

    @Override
    public String toString() {
        return "Dog[" + super.toString() + "]";
    }
}
