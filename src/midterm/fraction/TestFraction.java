package midterm.fraction;

import java.util.List;
import java.util.LinkedList;

public class TestFraction {
    public static void main(String[] args) {

        List<Fraction> fractions = new LinkedList<>();

        for (int i = 0; i < 30; i++) {
            int numerator = (int)Math.floor(Math.random() * 999);
            int denominator = (int)Math.floor(Math.random() * 999);
            fractions.add(new Fraction(numerator, denominator));
        }

        // for (Fraction fraction : fractions) {
        //     System.out.println(fraction);
        // }
        // printToValue(fractions);
        printToDenominator(fractions);
    }

    public static void printToValue(List<Fraction> fractions) {
        List<Fraction> fractionsSub = new LinkedList<>();
        fractionsSub = fractions;
        for (int i = 0; i < fractionsSub.size(); i++) {
            for (int j = i; j < fractionsSub.size(); j++) {
                if(fractionsSub.get(i).compareTo(fractionsSub.get(j)) == 1) {
                    Fraction tg = new Fraction(fractionsSub.get(i));
                    fractionsSub.get(i).setFraction(fractionsSub.get(j));
                    fractionsSub.get(j).setFraction(tg);
                }
            }
        }
        for (Fraction fraction : fractionsSub) {
            System.out.println(fraction);
        }
    }

    public static void printToDenominator(List<Fraction> fractions) {
        List<Fraction> fractionsSub = new LinkedList<>();
        fractionsSub = fractions;
        for (int i = 0; i < fractionsSub.size(); i++) {
            for (int j  = i; j < fractionsSub.size(); j++) {
                if(fractionsSub.get(i).getDenominator() > fractionsSub.get(j).getDenominator()) {
                    Fraction tg = new Fraction(fractionsSub.get(i));
                    // System.out.println(fractionsSub.get(i) + "  " + fractionsSub.get(j));
                    fractionsSub.get(i).setFraction(fractionsSub.get(j));
                    fractionsSub.get(j).setFraction(tg);
                    // System.out.println(fractionsSub.get(i) + "  " + fractionsSub.get(j));

                }
            }
        }
        for (Fraction fraction : fractionsSub) {
            System.out.println(fraction);
        }
    }
}
