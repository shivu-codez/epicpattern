package pattern.number;

import java.util.Scanner;

public class Pattern2 {
	private static Scanner sca;

	public static void main(String[] args) {
		sca = new Scanner(System.in);
		System.out.println("Enter the limit");
		int n = sca.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i == n-j && i!=0) || (i==0 && j!=0) || i==n-1 || (i==1 && j==0) || (i==0 && j==n-1) ) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
