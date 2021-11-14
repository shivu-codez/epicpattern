package shape;

import java.util.Scanner;

public class Pattern4 {
	private static Scanner scanner;

	public static void main(String args[]) {

		scanner = new Scanner(System.in);

		System.out.println("Enter the number:");
		int rows = scanner.nextInt();

		for (int i = 0; i < rows; i++) {
			for (int k = 0; k < rows - i; k++) {
				System.out.print("  ");
			}
			for (int j = 0; j < rows; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}

	}
}
