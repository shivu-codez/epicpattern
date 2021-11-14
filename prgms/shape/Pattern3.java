package shape;

import java.util.Scanner;

public class Pattern3 {
	private static Scanner scanner;

	public static void main(String args[]) {

		scanner = new Scanner(System.in);

		System.out.println("Enter the number:");
		int rows = scanner.nextInt();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				if (i == 0 || i == rows - 1 || j == 0 || j == rows - 1 || i == j || j == rows - i - 1) {
					System.out.print("*  ");
				} else
					System.out.print("   ");
			}
			System.out.println();
		}
	}
}
