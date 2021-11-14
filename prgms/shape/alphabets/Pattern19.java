package pattern.shape.alphabets;

import java.util.Scanner;

public class Pattern19 {
	private static Scanner scanner;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);

		System.out.println("Enter the number:");
		int rows = scanner.nextInt();

		for (int i = rows; i >= 0; i--) {
			int alphabet = 65;
			for (int j = 0; j < i; j++) {

				System.out.print(" ");
			}
			for (int k = i; k <= rows; k++) {

				System.out.print((char) (alphabet + k) + " ");
			}

			System.out.println();
		}
	}
}
