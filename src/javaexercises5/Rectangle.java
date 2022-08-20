package javaexercises5;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle() {
        this.length = 1.00f;
        this.width = 1.00f;
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return this.length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return this.width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        double area = this.length * this.width;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * (this.length + this.width);
        return perimeter;
    }

    public String toString() {
        return "Rectangle[length=" + this.length + " ,width=" + this.width + "]";
    }
}
