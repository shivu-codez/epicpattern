package pattern.shape.alphabets;

import java.util.Scanner;

public class Pattern25 {
	private static Scanner scanner;
	public static void main(String[] args) {
		int currentRow = 1;
		int counter = 1;
		int alphabet = 65;
		
		scanner = new Scanner(System.in);

		System.out.println("Enter the number:");
		int rows = scanner.nextInt();

		for (int i = 1; i <= rows; i++) {
			if (i % 2 == 0) {

				int reverse = currentRow + counter - 1;

				for (int j = 0; j < i; j++) {

					System.out.print((char) (reverse + alphabet - 1) + " ");

					reverse--;

					counter++;
				}
			} else {

				for (int j = 1; j <= i; j++) {

					System.out.print((char) (counter + alphabet - 1) + " ");

					counter++;
				}
			}

			System.out.println();

			currentRow++;
		}
	}
}
