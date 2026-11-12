class ComplexNumber {

    private final double real;
    private final double imaginary;

    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(real + other.real, imaginary + other.imaginary);
    }

    void display() {
        String sign = imaginary < 0 ? " - " : " + ";
        System.out.println(real + sign + Math.abs(imaginary) + "i");
    }
}

public class ComplexNumberDemo {

    public static void main(String[] args) {
        ComplexNumber first = new ComplexNumber(4, 3);
        ComplexNumber second = new ComplexNumber(2, -5);
        ComplexNumber sum = first.add(second);

        System.out.print("First number: ");
        first.display();
        System.out.print("Second number: ");
        second.display();
        System.out.print("Sum: ");
        sum.display();

        // Java does not let classes define new meanings for operators such
        // as +. A named method like add() is used for user-defined objects.
    }
}
