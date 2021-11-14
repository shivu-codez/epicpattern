package pattern.shape.numbers;

import java.util.Scanner;

public class Pattern10 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		System.out.println("Enter the number");
		int rows = scanner.nextInt();
		int k = 1;

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print(k + " ");
				k++;
			}

			System.out.println();
		}
	}
}
