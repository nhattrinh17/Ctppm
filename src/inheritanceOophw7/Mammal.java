package inheritanceOophw7;

public class Mammal extends Animal{
    public Mammal(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Mamal[" + super.toString() + "]";
    }
}
