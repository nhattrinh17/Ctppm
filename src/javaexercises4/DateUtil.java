package javaexercises4;

import java.util.Scanner;

public class DateUtil {
    public static String [] strMonths = {"Jan", "Feb ", "Mar", "Apr", "May", "Jun",
        "Jul", "Aug", "Sep ", "Oct", "Nov", "Dec"};

    public static int [] daysInMonths = 
        {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static String [] strDay = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isValiDate (int year, int month, int day) {
        if (!(year >= 1 && year <= 999)) {
            return false;
        }
        if (!(month >= 1 && month <= 12)) {
            return false;
        }
        if (!(isLeapYear(year) && month == 2 && day == 30)) {
            return false;
        } 
        if (!(day <= daysInMonths[month])) {
            return false;
        }
        return true;
    }

    public static int getDayOfWeek (int year, int month, int day) {
        int JMD;
        JMD = (day + ((153 * (month + 12 * ((14 - month) / 12) - 3) + 2) / 5) +
            (365 * (year + 4800 - ((14 - month) / 12))) +
            ((year + 4800 - ((14 - month) / 12)) / 4) - 
            ((year + 4800 - ((14 - month) / 12)) / 100) + 
            ((year + 4800 - ((14 - month) / 12)) / 400)  - 32045) % 7;
        return JMD;
    }

    public static String printDate (int year, int month, int day) {
        String strDate = "";
        strDate += strDay[getDayOfWeek(year, month, day)];
        strDate += (" " + day + " " + strMonths[month - 1] + " " + year);
        return strDate;
    }

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter year: ");
        int year = sc.nextInt();
        System.out.printf("Enter month: ");
        int month = sc.nextInt();
        System.out.printf("Enter day: ");
        int day = sc.nextInt();
        System.out.println(isLeapYear(year));
        System.out.println(isValiDate(year, month, day));
        System.out.println(getDayOfWeek(year, month, day));
        System.out.println(printDate(year, month, day));
        sc.close();
    }
}
