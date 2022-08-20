package inheritanceOophw7;

public class TestLine {
    public static void main(String[] args) {
        Line line1 = new Line(0, 0, 3, 4);
        System.out.println(line1);

        Point pointBegin = new Point(1, 2);
        Point pointEnd = new Point(4, 6);
        System.out.println("Point Begin: " + pointBegin + ", Point End: " + pointEnd);

        Line line2 = new Line(pointBegin, pointEnd);
        System.out.println(line2);

        System.out.println("length Line1: " + line1.getLength());
        System.out.println("length Line2: " + line2.getLength());

        System.out.println("Gradient Line1: " + line1.getGradient());
        System.out.println("Gradient Line2: " + line2.getGradient());        
    }
}
