package number;

import java.util.Scanner;

public class LeastCommonMultiple {

	private static Scanner in;

	public static void main(String[] args) {
		int a, b;
		in = new Scanner(System.in);

		System.out.println("Enter a number1:");
		a = in.nextInt();

		System.out.println("Enter a number2:");
		b = in.nextInt();
		int gcd = 1;

		for (int i = 1; i <= a && i <= b; ++i) {
			if (a % i == 0 && b % i == 0)
				gcd = i;
		}
		int lcm = (a * b) / gcd;
		System.out.printf("The LCM of %d and %d is %d.", a, b, lcm);
	}

}
