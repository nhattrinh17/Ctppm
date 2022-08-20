package inheritanceOophw7;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        System.out.println("Cylinder:"
            + " radius = " + cylinder1.getRadius()
            + " height = " + cylinder1.getHeight()
            + " base area = " + cylinder1.getArea()
            + " volunme = " + cylinder1.getVolume());
        
        Cylinder cylinder2 = new Cylinder(10);
        System.out.println("Cylinder:"
            + " radius = " + cylinder2.getRadius()
            + " height = " + cylinder2.getHeight()
            + " base area = " + cylinder2.getArea()
            + " volunme = " + cylinder2.getVolume());
        Cylinder cylinder3 = new Cylinder(2.0, 10.0);
        System.out.println("Cylinder:"
            + " radius = " + cylinder3.getRadius()
            + " height = " + cylinder3.getHeight()
            + " base area = " + cylinder3.getArea()
            + " volunme = " + cylinder3.getVolume());
        System.out.println(cylinder3);
}
}
