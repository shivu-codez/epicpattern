package shape;

import java.util.Scanner;

public class Pattern14 {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		System.out.println("Enter the number:");
		int rows = scanner.nextInt();

		for (int i = 1; i <= rows; i++) {
			for (int j = i; j <= rows; j++) {
				System.out.print("*");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= rows; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = (2 * i - 2); j < (2 * rows - 1); j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

}
