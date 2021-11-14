package pattern.shape.numbers;

import java.util.Scanner;

public class Pattern5 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int rows = scanner.nextInt();

		for (int i = rows; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {

				System.out.print(j + " ");
			}

			System.out.println();
		}
		for (int i = 1; i <= rows; i++) {
			for (int j = i; j >= 1; j--) {

				System.out.print(j + " ");
			}

			System.out.println();
		}
	}
}