package shape;

import java.util.Scanner;

public class Pattern5 {

	private static Scanner scanner;

	public static void main(String args[]) {

		scanner = new Scanner(System.in);

		System.out.println("Enter the number:");
		int rows = scanner.nextInt();

		for (int i = 0; i < rows; i++) {
			for (int k = i; k < rows; k++)
				System.out.print("  ");

			for (int j = 0; j < rows; j++) {
				if (j == 0 || j == i || i == rows - 1)
					System.out.print(" *");
				else
					System.out.print("  ");
			}

			System.out.println();
		}
	}

}
