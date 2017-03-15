package chap2;

public class ComplexNumber {

	private double x, y;

	public ComplexNumber(double real, double imaginary) {
		this.x = real;
		this.y = imaginary;
	}

	public double getReal() {
		return x;
	}

	public double getImaginary() {
		return y;
	}

	public double magnitude() {
		return Math.sqrt(x * x + y * y);
	}

	public String toString() {
		return (x + " + " + y + "i");
	}

	public static ComplexNumber add(ComplexNumber a, ComplexNumber b) {
		return new ComplexNumber(a.x + b.x, a.y + b.y);
	}

	public ComplexNumber add(ComplexNumber a) {
		return new ComplexNumber(this.x + a.x, this.y + a.y);
	}

}
