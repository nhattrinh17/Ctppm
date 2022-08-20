package javaexercises5;

public class CustomerBank {
    private int id;
    private  String name;
    private char gender;

    public CustomerBank(int id, String name, char gender) {
        this.id= id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public char getGender() {
        return this.gender;
    }

    public String toString() {
        return this.name + "(" + this.id + ")";
    }
}
