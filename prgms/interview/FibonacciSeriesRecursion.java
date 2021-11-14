package interview;

import java.util.Scanner;

public class FibonacciSeriesRecursion {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		System.out.println("Enter the number:");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.print(fibonacciNumber(i) + " ");
		}
	}

	public static int fibonacciNumber(int n) {
		if (n < 2)
			return n;
		return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
	}

}
