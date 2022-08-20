package javaexercises5;

public class TestMyLine {
    public static void main(String[] args) {
        MyPoint begin = new MyPoint(1, 3);
        MyPoint end = new MyPoint(4, 6);
        MyLine myLine1 = new MyLine(begin, end);

        System.out.println(myLine1);
        System.out.println("Mypoint begin:" + myLine1.getBegin());
        System.out.println("Mypoint beginX:" + myLine1.getBeginX());
        System.out.println("Mypoint beginY:" + myLine1.getBeginY());
        System.out.println("Mypoint end:" + myLine1.getEnd());
        System.out.println("Mypoint endX:" + myLine1.getEndX());
        System.out.println("Mypoint endY:" + myLine1.getEndY());
        System.out.println("Leng MyLine: " + myLine1.getLength());
        System.out.println("Geandient MyLine: " + myLine1.getGrandient());
    }
}
