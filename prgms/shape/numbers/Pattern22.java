package pattern.shape.numbers;

import java.util.Scanner;

public class Pattern22 {
	private static Scanner scanner;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);

		System.out.println("Enter the number");
		int rows = scanner.nextInt();

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j < i; j++) {

				System.out.print("0 ");
			}

			System.out.print(i + " ");
			for (int k = i; k < rows; k++) {

				System.out.print("0 ");
			}

			System.out.println();
		}
	}
}
