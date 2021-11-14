package pattern.shape.numbers;

import java.util.Scanner;

public class Pattern8 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		System.out.println("Enter the number");
		int rows = scanner.nextInt();

		for (int i = rows; i >= 1; i--) {
			for (int j = rows; j >= i; j--) {

				System.out.print(j + " ");
			}

			System.out.println();
		}
	}
}