package javaexercises6;

public class TestMyTime {
    public static void main(String [] args) {
        MyTime myTime1 = new MyTime(23, 11, 59);
        System.out.println("Hour is" + myTime1.getHour());
        System.out.println("Minute is" + myTime1.getMinute());
        System.out.println("Second is" + myTime1.getSecond());
        System.out.println(myTime1);
        System.out.println("Next second:" + myTime1.nextSecond());
        System.out.println("Next Minute:" + myTime1.nextMinute());
        System.out.println("Next Hour:" + myTime1.nextHour());
        System.out.println("Previous second:" + myTime1.previousSecond());
        System.out.println("Previous Minute:" + myTime1.previousMinute());
        System.out.println("Previous Hour:" + myTime1.previousHour());
    }
}
