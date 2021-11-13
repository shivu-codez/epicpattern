package pattern.number;

import java.util.Scanner;

public class Pattern3 {
	private static Scanner sca;

	public static void main(String[] args) {
		sca = new Scanner(System.in);
		System.out.println("Enter the limit");
		int n = sca.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i>=0&&j==0||i==j&&j>=n/2||i+j==n-1&&i<3*(n/4)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
