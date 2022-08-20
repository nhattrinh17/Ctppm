package inheritanceOophw7;

public class CircleUpdate extends Shape{
    private double radius;

    public CircleUpdate() {
        super();
        this.radius = 1.0;
    }

    public CircleUpdate(double radius) {
        super();
        this.radius = radius;
    }

    public CircleUpdate(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    @Override
    public String toString() {
        return  "Cricle[" + super.toString() + ", radius = " + this.radius + "]";
    }

    
}
