package midterm.fraction;

import java.lang.Number;

public class Fraction extends Number implements Comparable<Fraction>{
    private int numerator;
    private int denominator;

    public Fraction(Fraction fraction) {
        this.numerator = fraction.getNumerator();
        this.denominator = fraction.getDenominator();
    }

    public Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }
    
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void setFraction(Fraction fraction) {
        this.numerator = fraction.getNumerator();
        this.denominator = fraction.getDenominator();
    }

    public Fraction add(Fraction fraction) {
        int numeratorResult;
        int denominatorResult;

        numeratorResult = this.numerator * fraction.getDenominator() + this.denominator * fraction.getNumerator();
        denominatorResult = this.denominator + fraction.getDenominator();
        
        Fraction result = new Fraction(numeratorResult, denominatorResult);
        return result;
    }

    public Fraction add(int number) {
        int numeratorResult;
        int denominatorResult;

        numeratorResult = this.numerator  + this.denominator * number;
        denominatorResult = this.denominator;
        
        Fraction result = new Fraction(numeratorResult, denominatorResult);
        return result;
    }
    
    @Override
    public int compareTo(Fraction fraction) {
        this.simplify();
        if(this.numerator * fraction.getDenominator() > this.denominator * fraction.getNumerator()) {
            return 1;
        } else if(this.numerator * fraction.getDenominator() < this.denominator * fraction.getNumerator()) {
            return -1;
        }
        return 0;
    }

    @Override
    public double doubleValue() {
        double numeratorSub = 1.000 * this.getNumerator();
        double result = numeratorSub / this.denominator;
        return result;
    }

    @Override
    public float floatValue() {
        float numeratorSub = 1 ;
        numeratorSub *= this.getNumerator();
        float result = numeratorSub / this.denominator;
        return result;
    }

    @Override
    public int intValue() {
        return this.numerator / this.denominator;
    }

    @Override
    public long longValue() {
        long numeratorSub = this.getDenominator();
        long result = numeratorSub / this.denominator;
        return result;
    }

    public boolean equals(Fraction fraction) {
        this.simplify();
        if(this.numerator * fraction.getDenominator() == this.denominator * fraction.getNumerator()) {
            return true;
        }
        return false;
    }

    private void simplify() {
        if(!(this.numerator == 1 || this.denominator == 1)) {
            for (int i = 2; i <= this.numerator; i++) {
                if(this.numerator % i == 0  & this.denominator % i == 0) {
                    this.numerator /= i;
                    this.denominator /= i;
                }   
            }
        }
    }

    @Override
    public String toString() {
        return "Fraction[" + this.numerator + "/" + this.denominator + "]";
    }
}