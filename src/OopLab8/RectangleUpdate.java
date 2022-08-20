package OopLab8;

public class RectangleUpdate implements GeometricObject{
    private double width;
    private double length;

    public RectangleUpdate(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle[width = " + width + ", length = " + length + "]";
    }
}
