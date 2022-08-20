package midterm.poly;

public interface Poly {
    public int coefficient(int index);
    public int [] coefficients();
    public int degree();
    public Poly derivative();
    public double evaluate(double value);
}
