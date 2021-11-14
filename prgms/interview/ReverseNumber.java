package interview;

import java.util.Scanner;

public class ReverseNumber {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		reverse(num);
	}

	public static void reverse(int num) {
		int reversed = 0;

		while (num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10;
		}
		System.out.println("Reversed: " + reversed);
	}

}
