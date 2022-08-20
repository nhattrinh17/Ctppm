package javaexercises5;

public class TestRectangle {
    public static void main (String [] args) {
        Rectangle rectangle1 = new Rectangle(1.2f, 3.4f);
        System.out.println(rectangle1); // toString ()
        Rectangle rectangle2 = new Rectangle () ; // default constructor
        System .out.println(rectangle2) ;

        rectangle1.setLength(5.6f);
        rectangle1.setWidth(7.8f);
        System.out.println(rectangle1) ; // toString ()
        System.out.println("Length is: " + rectangle1.getLength());
        System.out.println("Width is: " + rectangle1 . getWidth());

        // Test getArea () and getPerimeter ()
        System.out.printf( "Area is: %.2f \n" , rectangle1 .getArea() );
        System.out.printf( "Perimeter is: %.2f" , rectangle1 .getPerimeter()); 
    }
}
