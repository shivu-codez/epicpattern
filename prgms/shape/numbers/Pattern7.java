package pattern.shape.numbers;

import java.util.Scanner;

public class Pattern7 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		System.out.println("Enter the number");
		int rows = scanner.nextInt();

		for (int i = 1; i <= rows; i++) {
			for (int j = rows; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}