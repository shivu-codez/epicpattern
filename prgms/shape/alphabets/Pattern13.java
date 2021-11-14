package pattern.shape.alphabets;

import java.util.Scanner;

public class Pattern13 {
	private static Scanner scanner;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);

		System.out.println("Enter the number:");
		int rows = scanner.nextInt();

		for (int i = 1; i <= rows; i++) {
			int alphabet = 65;
			for (int j = rows; j > i; j--) {

				System.out.print(" ");
			}
			int temp = 1;
			for (int k = 1; k <= i; k++) {

				System.out.print((char) (alphabet - 1 + temp) + "");

				temp = temp * (i - k) / (k);
			}

			System.out.println();
		}
	}
}
