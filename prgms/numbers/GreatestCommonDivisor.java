package number;

import java.util.Scanner;

public class GreatestCommonDivisor {

	private static Scanner in;

	public static void main(String[] args) {
		int num1, num2;
		in = new Scanner(System.in);

		System.out.println("Enter the number1:");
		num1 = in.nextInt();

		System.out.println("Enter the number2:");
		num2 = in.nextInt();
		int gcd = 1;

		for (int i = 1; i <= num1 && i <= num2; i++) {
			if (num1 % i == 0 && num2 % i == 0)
				gcd = i;
		}

		System.out.printf("GCD of %d and %d is: %d", num1, num2, gcd);
	}
}
