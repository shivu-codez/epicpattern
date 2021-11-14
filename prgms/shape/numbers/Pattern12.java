package pattern.shape.numbers;

import java.util.Scanner;

public class Pattern12 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		System.out.println("Enter the number");
		int rows = scanner.nextInt();

		for (int i = 1; i <= rows; i++) {
			int temp = i;
			for (int j = i; j >= 1; j--) {

				System.out.print(temp + " ");

				temp = temp + rows;
			}

			System.out.println();
		}
	}
}
