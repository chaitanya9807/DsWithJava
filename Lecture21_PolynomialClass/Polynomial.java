package Lecture21_PolynomialClass;

public class Polynomial {
    private int[] DegreeCoeff;

    public Polynomial() {
        this.DegreeCoeff = new int[5];
    }

    public void setCoefficient(int degree, int coeff) {
        if (degree >= DegreeCoeff.length) {
            int[] newDegreeCoeff = new int[degree + 1];
            for (int i = 0; i < DegreeCoeff.length; i++) {
                newDegreeCoeff[i] = DegreeCoeff[i];
            }
            DegreeCoeff = newDegreeCoeff;
        }
        DegreeCoeff[degree] = coeff;
    }

    public Polynomial add(Polynomial P) {
        Polynomial Sum = new Polynomial();
        int i = 0, j = 0;
        while (i < this.DegreeCoeff.length && j < P.DegreeCoeff.length) {
            Sum.setCoefficient(i, this.DegreeCoeff[i] + P.DegreeCoeff[j]);
            i++;
            j++;
        }
        while (i < this.DegreeCoeff.length) {
            Sum.setCoefficient(i, this.DegreeCoeff[i]);
            i++;
        }
        while (j < P.DegreeCoeff.length) {
            Sum.setCoefficient(j, P.DegreeCoeff[j]);
            j++;
        }
        return Sum;
    }

    public Polynomial subtract(Polynomial P) {
        Polynomial Diff = new Polynomial();
        int i = 0, j = 0;
        while (i < this.DegreeCoeff.length && j < P.DegreeCoeff.length) {
            Diff.setCoefficient(i, this.DegreeCoeff[i] - P.DegreeCoeff[j]);
            i++;
            j++;
        }
        while (i < this.DegreeCoeff.length) {
            Diff.setCoefficient(i, this.DegreeCoeff[i]);
            i++;
        }
        while (j < P.DegreeCoeff.length) {
            Diff.setCoefficient(j, -P.DegreeCoeff[j]);
            j++;
        }
        return Diff;
    }

    public Polynomial multiply(Polynomial P) {
        Polynomial product = new Polynomial();
        int i = 0, j = 0;
        for (i = 0; i < this.DegreeCoeff.length; i++) {
            for (j = 0; j < P.DegreeCoeff.length; j++) {
                int newDegree = i + j;
                int newCoeff = this.DegreeCoeff[i] * P.DegreeCoeff[j];
                if (newDegree < product.DegreeCoeff.length) {
                    newCoeff = product.DegreeCoeff[newDegree] + newCoeff;
                }
                product.setCoefficient(newDegree, newCoeff);
            }
        }
        return product;
    }

    public void print() {
        for (int i = 0; i < DegreeCoeff.length; i++) {
            if (DegreeCoeff[i] != 0) {
                System.out.print(DegreeCoeff[i] + "x" + i + " ");
            }
        }
    }
}