package javaexercises5;

public class Date {
    private int day;
    private int mouth;
    private int year;

    public Date (int day, int mouth, int year) {
        this.day = day;
        this.mouth = mouth;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMouth() {
        return this.mouth;
    }

    public void setMouth(int mouth) {
        this.mouth = mouth;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int mouth, int year) {
        this.day = day;
        this.mouth = mouth;
        this.year = year;
    }

    public String toString() {
        String day = this.day < 10 ? ("0"+this.day): (""+this.day); 
        String mouth = this.mouth < 10 ? ("0"+this.mouth): (""+this.mouth); 
        String year = this.year < 10 ? ("0"+this.year): (""+this.year); 
        return day + "/" + mouth  + "/" + year;
    }
}
