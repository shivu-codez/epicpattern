package shape;

import java.util.Scanner;

public class Pattern11 {

	private static Scanner scanner;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);

		System.out.println("Enter the number:");
		int rows = scanner.nextInt();

		rows = rows / 2 + 1;
		int i = 0;
		for (i = 0; i < rows; i++) {
			for (int k = i; k < rows; k++)
				System.out.print("  ");

			for (int j = 0; j <= 2 * i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

		rows = i;

		for (i = rows - 1; i > 0; i--) {
			for (int k = i; k < rows + 1; k++)
				System.out.print("  ");

			for (int j = 2 * i; j > 1; j--) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}

}
