package com.itwill01.method;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		int done = calculator.add(23, 34);
		System.out.println(done);

		done = calculator.sub(23, 34);
		System.out.println(done);

		done = calculator.mul(23, 34);
		System.out.println(done);

		done = calculator.div(454, 34);
		System.out.println(done);

	}
}