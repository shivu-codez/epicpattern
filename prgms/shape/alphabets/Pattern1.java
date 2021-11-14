package pattern.shape.alphabets;

import java.util.Scanner;

public class Pattern1 {
	private static Scanner scanner;

	public static void main(String[] args) {
		int alphabet = 65;

		scanner = new Scanner(System.in);

		System.out.println("Enter the number:");
		int rows = scanner.nextInt();

		for (int i = 0; i <= rows; i++) {
			for (int j = 0; j <= i; j++) {

				System.out.print((char) (alphabet + j) + " ");
			}

			System.out.println();
		}
	}
}
