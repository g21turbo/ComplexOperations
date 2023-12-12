public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    // Adds the specified real and imaginary values to the current complex number
    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    // Adds the real and imaginary parts of another complex number (other) to the current complex number
    public void add(ComplexNumber other) {
        add(other.real, other.imaginary);
    }

    // Subtracts the specified real and imaginary values from the current complex number
    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    // Subtracts the real and imaginary parts of another complex number (other) from the current complex number
    public void subtract(ComplexNumber other) {
        subtract(other.real, other.imaginary);
    }



}
