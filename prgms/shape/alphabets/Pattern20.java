package pattern.shape.alphabets;

import java.util.Scanner;

public class Pattern20 {
	private static Scanner scanner;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);

		System.out.println("Enter the number:");
		int rows = scanner.nextInt();

		for (int i = 0; i <= rows; i++) {
			int alphabet = 65;
			for (int j = rows; j > i; j--) {

				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {

				System.out.print((char) (alphabet + k));
			}
			for (int l = i - 1; l >= 0; l--) {

				System.out.print((char) (alphabet + l));
			}

			System.out.println();
		}
	}
}
