package pattern.number;

import java.util.Scanner;

public class Pattern7 {
	private static Scanner sca;

	public static void main(String[] args) {
		sca = new Scanner(System.in);
		System.out.println("Enter the limit");
		int n = sca.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i==0 || n-j==i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
