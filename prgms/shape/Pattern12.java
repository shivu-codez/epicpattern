package shape;

import java.util.Scanner;

public class Pattern12 {

	private static Scanner scanner;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);

		System.out.println("Enter the number:");
		int rows = scanner.nextInt();

		rows = rows / 2 + 1;

		int i = 0;

		for (i = 0; i < rows; i++) {
			for (int k = i; k < rows - 1; k++)
				System.out.print("  ");

			for (int j = i; j < rows; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

		rows = i;

		int m = 2;
		for (i = rows; i > 1; i--) {
			for (int k = i; k < rows + 1; k++)
				System.out.print("  ");

			for (int j = 0; j < m; j++) {
				System.out.print("* ");
			}
			m++;
			System.out.println();
		}

	}

}
