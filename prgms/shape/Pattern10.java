package shape;

import java.util.Scanner;

public class Pattern10 {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		System.out.println("Enter the number:");
		int rows = scanner.nextInt();

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

		for (int i = 0; i < rows - 1; i++) {
			for (int j = i; j < rows - 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
