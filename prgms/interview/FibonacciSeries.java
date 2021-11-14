package interview;

import java.util.Scanner;

public class FibonacciSeries {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		System.out.println("Enter the number:");
		int num = sc.nextInt();
		fibonacciNumber(num);
	}

	public static void fibonacciNumber(int num) {

		int num1 = 0, num2 = 1;

		for (int i = 1; i <= num; ++i) {
			System.out.print(num1 + " ");
			int sumOfPrevTwo = num1 + num2;
			num1 = num2;
			num2 = sumOfPrevTwo;
		}
	}

}
