package pattern.shape.numbers;

import java.util.Scanner;

public class Pattern15 {
	private static Scanner scanner;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);

		System.out.println("Enter the number");
		int rows = scanner.nextInt();

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j < i; j++) {

				System.out.print(" ");
			}
			for (int k = 1; k <= rows - i + 1; k++) {

				System.out.print(k + " ");
			}

			System.out.println();
		}
	}
}