package pattern.shape.numbers;

import java.util.Scanner;

public class Pattern24 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		System.out.println("Enter the number");
		int rows = scanner.nextInt();

		for (int i = 1; i <= rows; i++) {
			for (int j = i; j <= rows; j++) {

				System.out.print(j + " ");
			}
			for (int k = rows - 1; k >= i; k--) {

				System.out.print(k + " ");
			}

			System.out.println();
		}
	}
}
