package pattern.shape.alphabets;

import java.util.Scanner;

public class Pattern14 {
	private static Scanner scanner;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);

		System.out.println("Enter the number:");
		int rows = scanner.nextInt();

		for (int i = 0; i <= rows; i++) {
			int alphabet = 65;
			for (int j = 0; j <= i; j++) {

				System.out.print((char) (alphabet + j) + " ");
			}
			for (int k = i - 1; k >= 0; k--) {

				System.out.print((char) (alphabet + k) + " ");
			}

			System.out.println();
		}
	}
}
