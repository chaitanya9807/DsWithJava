package Lecture16_oops1;

public class ComplexNumbers {
    int real;
    int imaginary;

    public ComplexNumbers(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void plus(ComplexNumbers c) {
        this.real += c.real;
        this.imaginary += c.imaginary;
    }

    public void multiply(ComplexNumbers c) {
        int r = this.real * c.real - this.imaginary * c.imaginary;
        int i = this.real * c.imaginary + this.imaginary * c.real;
        this.real = r;
        this.imaginary = i;
    }

    public void print() {
        System.out.println(this.real + " + i" + this.imaginary);
    }
}
