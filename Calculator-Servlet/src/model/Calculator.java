package model;

public class Calculator {
	private final double arg1;
	private final double arg2;

	public Calculator(double arg1, double arg2) {
		this.arg1 = arg1;
		this.arg2 = arg2;
	}

	public double sumar() {
		return this.arg1 + this.arg2;
	}
}