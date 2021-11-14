package pattern.shape.numbers;

import java.util.Scanner;

public class Pattern20 {
	private static Scanner scanner;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);

		System.out.println("Enter the number");
		int rows = scanner.nextInt();

		for (int i = 1; i <= rows; i++) {
			for (int j = rows; j > i; j--) {

				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {

				System.out.print(k);
			}
			for (int l = i - 1; l >= 1; l--) {

				System.out.print(l);
			}

			System.out.println();
		}
	}
}
