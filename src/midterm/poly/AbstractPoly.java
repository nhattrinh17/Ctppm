package midterm.poly;

public abstract class AbstractPoly implements Poly{
    private int degree;

    public AbstractPoly() {
        this.degree = 1;
    }

    @Override
    public int degree() {
        return degree;
    }

    // public int[] derivative() {
    //     int [] coefficientsSub = new int[10];
    //     int coefficient = this.degree;
    //     for (int i = 0; i < this.coefficients().length; i++) {
    //         coefficientsSub[i] = this.coefficient(i)*coefficient;
    //         coefficient--;
    //     }
    //     return coefficientsSub;
    // }

    public boolean equals(AbstractPoly abstractPoly) {
        if(this.degree == abstractPoly.degree()){
            if(this.coefficients().length == abstractPoly.coefficients().length) {
                for (int i = 0; i < this.coefficients().length; i++) {
                    if(this.coefficients()[i] != abstractPoly.coefficients()[i]) {
                        return false;
                    }
                }
                return true;
            }
        } 
        return false;
    }
}
