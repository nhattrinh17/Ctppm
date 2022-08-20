package javaexercises5;

public class Book {
    private String name;
    private Author[] author;
    private double price;
    private int qty;

    public Book(String name, Author[] author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = 0;
    }
    
    public Book(String name, Author[] author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return this.name;
    }

    public Author[] getAuthor() {
        return this.author;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        String strAthours = "";
        for (int i = 0; i < author.length; i++) {
            strAthours += (", " + this.author[i].toString());
        }
        return "Book[name= " + this.name + ", " + strAthours + 
            ", price=" + this.price + ", qty=" + this.qty + "]";
    }
}
