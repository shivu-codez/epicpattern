package pattern.alphabets;

import java.util.Scanner;

public class G_Pattern {
	private static Scanner sca;

	public static void main(String[] args) {
		sca = new Scanner(System.in);
		System.out.println("Enter the limit");
		int n = sca.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == 0 && j < (3 * n) / 4 || i == n / 2 && j > n / 2 || i == n - 1 && j < n / 2
						|| j == n / 2 && i >= n / 2 || j == n - 1 && i >= n / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
