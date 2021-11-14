package shape;

import java.util.Scanner;

public class Pattern1 {

	private static Scanner scanner;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);

		System.out.println("Enter the number:");
		int rows = scanner.nextInt();

		for (int i = 0; i < rows; i++) {
			System.out.print(" ");

			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();

		}
	}
}
