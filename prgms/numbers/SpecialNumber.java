package number;

import java.util.Scanner;

public class SpecialNumber {

	private static Scanner sc;

	public static void main(String[] args) {
		int n, num, r, sumOfFactorial = 0;
		sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		n = sc.nextInt();
		num = n;
		while (num > 0) {
			r = num % 10;
			int fact = 1;
			for (int i = 1; i <= r; i++) {
				fact = fact * i;
			}
			sumOfFactorial = sumOfFactorial + fact;
			num = num / 10;
		}
		if (n == sumOfFactorial) {
			System.out.println("Special Number");
		} else {
			System.out.println("Not Special Number");
		}
	}

}
