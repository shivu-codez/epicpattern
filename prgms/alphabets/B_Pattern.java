package pattern.alphabets;

import java.util.Scanner;

public class B_Pattern {
	private static Scanner sca;

	public static void main(String[] args) {
		sca = new Scanner(System.in);
		System.out.println("Enter the limit");
		int n = sca.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 || j == n / 2 && i != 0 && i != n / 2 && i != n - 1
						|| (i == n / 2 || i == n - 1 || i == 0) && j < n / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
