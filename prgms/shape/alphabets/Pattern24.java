package pattern.shape.alphabets;

import java.util.Scanner;

public class Pattern24 {
	private static Scanner scanner;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);

		System.out.println("Enter the String");
		String input = scanner.nextLine();

		for (int i = 1; i <= input.length(); i++) {
			for (int j = input.length(); j > i; j--) {

				System.out.print(" ");
			}
			for (int k = i * 2 - 1; k >= 1; k--) {

				System.out.print(input.charAt(i - 1));
			}

			System.out.println("");
		}
	}
}
