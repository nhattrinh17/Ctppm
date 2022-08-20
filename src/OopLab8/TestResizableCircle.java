package OopLab8;

public class TestResizableCircle {
    public static void main(String[] args) {
        ResizableCircle resizableCircle1 = new ResizableCircle(6.5);
        System.out.println(resizableCircle1);
        System.out.println("Area is:" + resizableCircle1.getArea());
        System.out.println("Perimeter is:" + resizableCircle1.getPerimeter());

        resizableCircle1.resize(150);
        System.out.println("The area after change is:" + resizableCircle1.getArea());
        System.out.println("The perimeter after change is:" + resizableCircle1.getPerimeter());

    }
}
