package pattern.shape.alphabets;

import java.util.Scanner;

public class Pattern16 {
	private static Scanner scanner;
	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);

		System.out.println("Enter the number:");
		int rows = scanner.nextInt();

		for (int i = 0; i <= rows; i++) {
			int alphabet = 65;
			for (int j = rows; j >= i; j--) {

				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {

				System.out.print((char) (alphabet + k) + " ");
			}

			System.out.println();
		}
		for (int i = 0; i <= rows; i++) {
			int alphabet = 65;
			for (int j = -1; j <= i; j++) {

				System.out.print(" ");
			}
			for (int k = 0; k <= (rows-1) - i; k++) {

				System.out.print((char) (alphabet + k) + " ");
			}

			System.out.println();
		}
	}
}
