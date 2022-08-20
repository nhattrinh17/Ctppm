package javaexercises5;

public class Circle {
    
    private double radius;
    private String color;

    public Circle() {
        radius = 1.00;
        color  = "đỏ";
    };

    public Circle(double radius) {
        this.radius = radius;
        color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    public double getCircumference() {
        double circumference = 2* Math.PI * radius;
        return circumference;
    }

    public String toString() {
        return "Circle[radius = " + radius + " color = " + color + " ] ";
    } 

}
