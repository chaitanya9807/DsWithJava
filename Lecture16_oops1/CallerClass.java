package Lecture16_oops1;

public class CallerClass {
    public static void main(String[] args) {
        ComplexNumbers c1 = new ComplexNumbers(3, 2);
        ComplexNumbers c2 = new ComplexNumbers(4, 5);
        c1.print();
        c2.print();
        c1.multiply(c2);
        c1.print();
    }
}