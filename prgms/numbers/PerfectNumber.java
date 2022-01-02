package number;

import java.util.Scanner;

public class PerfectNumber {

	private static Scanner in;

	public static void main(String[] args) {
		int n, sum = 0;
		in = new Scanner(System.in);
		System.out.println("Enter a number:");
		n = in.nextInt();
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == n) {
			System.out.println("Number is Perfect");
		} else {
			System.out.println("Number is not Perfect");
		}
	}

	int divisor(int x) {
		return x;
	}

}
