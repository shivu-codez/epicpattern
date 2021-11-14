package shape;

import java.util.Scanner;

public class Pattern9 {

	private static Scanner scanner;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);

		System.out.println("Enter the number:");
		int rows = scanner.nextInt();

		for (int i = 0; i < rows; i++) {
			for (int k = i; k < rows; k++)
				System.out.print("  ");

			for (int j = 0; j <= 2 * i; j++) {
				if (j == 0 || j == 2 * i || i == 0 || i == rows - 1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}

			System.out.println();
		}

	}

}
