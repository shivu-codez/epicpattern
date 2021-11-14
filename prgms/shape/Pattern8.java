package shape;

import java.util.Scanner;

public class Pattern8 {

	private static Scanner scanner;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);

		System.out.println("Enter the number:");
		int rows = scanner.nextInt();

		for (int i = rows; i > 0; i--) {
			for (int k = i; k < rows; k++)
				System.out.print("  ");

			for (int j = 2 * i; j > 1; j--) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}

}
