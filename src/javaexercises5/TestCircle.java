package javaexercises5;

public class TestCircle {
    
    public static void main (String [] args) {
        Circle circle1 = new Circle();
        System.out.println("The cricle1 has radius of " + circle1.getRadius() + " and area of " + circle1.getArea());
        
        Circle circle2 = new Circle(2.0);
        System.out.println("The cricle1 has radius of " + circle2.getRadius() + " and area of " + circle2.getArea());
        
        Circle circle3 = new Circle(2.0, "transparent");
        System.out.println("The cricle1 has radius of " + circle3.getRadius() +  " and color of " + circle3.getColor() + " and area of " + circle3.getArea());
        //3. Khi chạy dòng System.out.println(circle1.radius) thì báo lỗi là không thể hiển thi radius.
        // Vì khi tạo ra thuộc tính radius ta để là private nên không thể truy cập vào để lấy ra hay sửa trực tiếp thuộc tính
        
        Circle circle4 = new Circle();
        circle4.setRadius(4.0);
        circle4.setColor("pink");
        System.out.println("Radius and color is: " + circle4.getRadius() + " " + circle4.getColor());
        
        Circle circle5 = new Circle();
        System.out.println(circle5.toString());

        Circle circle6 = new Circle(17.03);
        System.out.println(circle6);
    }
    
}
