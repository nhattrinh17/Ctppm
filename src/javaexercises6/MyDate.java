package javaexercises6;

public class MyDate {
    private int day;
    private int month;
    private int year;

    static String[] MONTHS =  {"Jan", "Feb", "Mar", "Apr", "Mav", "Jun", 
                                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    static String[] DAYS = {"Monday", "Tuesday", "Wendensday","Thursday",
                             "Friday", "Saturday", "Sunday"};
    static int[] DAYinMONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean isLeapYear(int year) {
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isValidDate(int year, int month, int day) {
        if(year < 1 || year > 9999) {
            return false;
        } 
        if(month < 1 || month > 12) {
            return false;
        }
        if(MyDate.isLeapYear(year)) {
            if(month == 2 && (day < 1 || day > 29)) {
                return false;
            } else {
                if(day < 1 ||day > MyDate.DAYinMONTHS[month]) {
                    return false;
                }
            }
        } else {
            if(day < 1 ||day > MyDate.DAYinMONTHS[month]) {
                return false;
            }
        }
        return true;
    }

    public static String getDayOfWeek(int year, int month, int day) {
        int JMD;
        JMD = (day + ((153 * (month + 12 * ((14 - month) / 12) - 3) + 2) / 5) +
            (365 * (year + 4800 - ((14 - month) / 12))) +
            ((year + 4800 - ((14 - month) / 12)) / 4) - 
            ((year + 4800 - ((14 - month) / 12)) / 100) + 
            ((year + 4800 - ((14 - month) / 12)) / 400)  - 32045) % 7;
        return MyDate.DAYS[JMD];
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        String day = ""+this.day;
        String dayStr = MyDate.getDayOfWeek(this.year, this.month, this.day); 
        String monthStr = MyDate.MONTHS[this.month - 1]; 
        String year = this.year + ""; 
        return dayStr + " " + day + " " + monthStr  + " " + year;
    }

    public MyDate nextDay() {
        int newDay = this.day + 1;
        int newMounth = this.month;
        int newYear = this.year;
        if(MyDate.isLeapYear(this.year)) {
            if(newMounth == 2 && newDay >= 30) {
                newDay = 1;
                newMounth = this.month + 1;
                if(newMounth == 13) {
                    newMounth = 0;
                    newYear = this.year + 1;
                }
            } else if(newMounth != 2 && newDay == (MyDate.DAYinMONTHS[this.month - 1] + 1)){
                newDay = 1;
                newMounth = this.month + 1;
                if(newMounth == 13) {
                    newMounth = 0;
                    newYear = this.year + 1;
                }
            }
        } else {
            if(newDay == (MyDate.DAYinMONTHS[this.month - 1] + 1)) {
                newDay = 1;
                newMounth = this.month + 1;
                if(newMounth == 13) {
                    newMounth = 0;
                    newYear = this.year + 1;
                }
            }
        }
        this.setDate(newDay, newMounth, newYear);
        return this;
    }

    public MyDate previousDay() {
        int newDay = this.day - 1;
        int newMounth = this.month;
        int newYear = this.year;
        if(MyDate.isLeapYear(this.year)) {
            if(this.month == 3 && newDay == 0) {
                newDay = 29;
                newMounth = this.month - 1;
                if(newMounth == 0) {
                    newMounth = 12;
                    newYear = this.year - 1;
                }
            } else if(this.month != 3 && newDay == 0){
                newDay = MyDate.DAYinMONTHS[(this.month == 1)? 11 : (this.month - 2)];
                newMounth = this.month - 1;
                if(newMounth == 0) {
                    newMounth = 12;
                    newYear = this.year - 1;
                }
            }
        } else {
            if(newDay == 0) {
                newDay = MyDate.DAYinMONTHS[(this.month == 1)? 11 : (this.month - 2)];
                newMounth = this.month - 1;
                if(newMounth == 0) {
                    newMounth = 12;
                    newYear = this.year - 1;
                }
            }
        }
        this.setDate(newDay, newMounth, newYear);
        return this;
    }

    public MyDate nextMounth() {
        int newDay = this.day;
        int newMounth = this.month + 1;
        int newYear = this.year;
        if(newMounth == 13) {
            newMounth = 1;
            newYear = this.year + 1;
        }
        this.setDate(newDay, newMounth, newYear);
        return this;
    }

    public MyDate previousMounth() {
        int newDay = this.day;
        int newMounth = this.month - 1;
        int newYear = this.year;
        if(newMounth == 0) {
            newMounth = 12;
            newYear = this.year - 1;
        }
        if(newDay == MyDate.DAYinMONTHS[this.month - 1]) {
            newDay = MyDate.DAYinMONTHS[newMounth - 1];
        }
        this.setDate(newDay, newMounth, newYear);
        return this;
    }

    public MyDate nextYear() {
        int newDay = this.day;
        int newMounth = this.month;
        int newYear = this.year + 1;
        if(MyDate.isLeapYear(newYear)) {
            if (this.month == 2) {
                newDay = 29;
            }
        }
        this.setDate(newDay, newMounth, newYear);
        return this;
    }

    public MyDate previousYear() {
        int newDay = this.day;
        int newMounth = this.month;
        int newYear = this.year - 1;
        if(MyDate.isLeapYear(newYear)) {
            if (this.month == 2) {
                newDay = 29;
            }
        } else if(MyDate.isLeapYear(this.year) && newMounth == 2) {
            newDay = 28;
        }
        this.setDate(newDay, newMounth, newYear);
        return this;
    }
}
