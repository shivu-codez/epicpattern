package interview;

import java.util.Scanner;

public class NaturalNumber {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		System.out.println("Enter the number:");
		int num = sc.nextInt();
		nuturalNumber(num);
	}

	public static void nuturalNumber(int num) {
		int sum = 0;

		for (int i = 1; i <= num; ++i) {
			sum += i;
		}

		System.out.println("Sum = " + sum);
	}

}
