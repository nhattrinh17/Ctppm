package OopLap10.Polynomials;

public interface Poly {
    public double[] coefficients();
    
    public double coefficient(int index);

    public int degree();

    public Poly derivative();

}
