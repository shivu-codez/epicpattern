package shape;

import java.util.Scanner;

public class Pattern6 {

	private static Scanner scanner;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);

		System.out.println("Enter the number:");
		int rows = scanner.nextInt();

		for (int i = 0; i < rows; i++) {
			for (int j = rows; j > i; j--) {
				if (j == rows || j == i + 1 || i == 0)
					System.out.print("* ");
				else
					System.out.print("  ");
			}

			System.out.println();
		}

	}

}
