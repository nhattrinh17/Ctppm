package OopLab8;

public class CircleUpdate implements GeometricObject{
    protected double radius;

    public CircleUpdate(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius = " + radius + "]";
    }
}
