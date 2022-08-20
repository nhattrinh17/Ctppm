package javaexercises6;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime () {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public MyTime (int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString() {
        String hour = this.hour < 10 ? ("0"+this.hour): (""+this.hour); 
        String minute = this.minute < 10 ? ("0"+this.minute): (""+this.minute); 
        String second = this.second < 10 ? ("0"+this.second): (""+this.second); 
        return hour + ":" + minute  + ":" + second;    
    }

    public MyTime nextSecond () {
        int newSecond = 0;
        int newMinute = 0;
        int newHour = 0;
        if(this.second == 59) {
            newSecond = 0;
            newMinute = this.minute + 1;
            if (newMinute == 60) {
                newMinute = 0;
                newHour = this.hour + 1;
                if (newHour == 24) {
                    newHour = 0;
                }
            } else {
                newHour = this.hour;
            }
        } else {
            newSecond = this.second + 1;
            newMinute = this.minute;
            newHour = this.hour;
        }
        MyTime newTime = new MyTime(newHour, newMinute, newSecond);
        this.setTime(newHour, newMinute, newSecond);
        return newTime;
    }

    public MyTime nextMinute () {
        int newSecond = this.second;
        int newMinute = 0;
        int newHour = 0;
        newMinute = this.minute + 1;
        if (newMinute == 60) {
            newMinute = 0;
            newHour = this.hour + 1;
            if (newHour == 24) {
                newHour = 0;
            }
        } else {
            newHour = this.hour;
        }
        MyTime newTime = new MyTime(newHour, newMinute, newSecond);
        this.setTime(newHour, newMinute, newSecond);
        return newTime;
    }

    public MyTime nextHour () {
        int newSecond = this.second;
        int newMinute = this.minute;
        int newHour = this.hour + 1;
        if (newHour == 24) {
            newHour = 0;
        }
        MyTime newTime = new MyTime(newHour, newMinute, newSecond);
        this.setTime(newHour, newMinute, newSecond);
        return newTime;
    }

    public MyTime previousSecond () {
        int newSecond = 0;
        int newMinute = 0;
        int newHour = 0;
        newSecond = this.second - 1;
        if(newSecond == -1) {
            newSecond = 59;
            newMinute = this.minute - 1;
            if (newMinute == -1) {
                newMinute = 59;
                newHour = this.hour - 1;
                if (newHour == -1) {
                    newHour = 23;
                }
            } else {
                newHour = this.hour;
            }
        } else {
            newSecond = this.second - 1;
            newMinute = this.minute;
            newHour = this.hour;
        }
        MyTime newTime = new MyTime(newHour, newMinute, newSecond);
        this.setTime(newHour, newMinute, newSecond);
        return newTime;
    }

    public MyTime previousMinute () {
        int newSecond = this.second;
        int newMinute = 0;
        int newHour = 0;
        newMinute = this.minute - 1;
        if (newMinute == -1) {
            newMinute = 59;
            newHour = this.hour - 1;
            if (newHour == -1) {
                newHour = 23;
            }
        }
        MyTime newTime = new MyTime(newHour, newMinute, newSecond);
        this.setTime(newHour, newMinute, newSecond);
        return newTime;
    }

    public MyTime previousHour () {
        int newSecond = this.second;
        int newMinute = this.minute;
        int newHour = this.hour -1;
        if (newHour == -1) {
            newHour = 23;
        }
        MyTime newTime = new MyTime(newHour, newMinute, newSecond);
        this.setTime(newHour, newMinute, newSecond);
        return newTime;
    }
}
