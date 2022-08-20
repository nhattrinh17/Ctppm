package javaexercises6;

public class TestMyDate {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(28, 2, 2012);
        System.out.println(date1);
        System.out.println(date1.nextDay());
        System.out.println(date1.nextDay());
        System.out.println(date1.nextMounth());
        System.out.println(date1.nextYear());

        MyDate date2 = new MyDate(2, 1, 2012);
        System.out.println(date2);
        System.out.println(date2.previousDay());
        System.out.println(date2.previousDay());
        System.out.println(date2.previousMounth());
        System.out.println(date2.previousYear());

        MyDate date3 = new MyDate(29, 2, 2012);
        System.out.println(date3.previousYear());
    }
}
