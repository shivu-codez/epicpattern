package interview;

import java.util.Scanner;

public class SquareRootOfNumber {

	private static Scanner scn;

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		scn = new Scanner(System.in);
		int n = scn.nextInt();
		getSqrt(n);
	}

	public static void getSqrt(int number) {

		double i, precision = 0.00001;
		for (i = 1; i * i <= number; ++i)
			;
		for (--i; i * i < number; i += precision)
			;
		System.out.println("Square root of given number: " + i);
	}

}
