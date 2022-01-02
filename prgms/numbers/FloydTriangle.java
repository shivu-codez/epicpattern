package number;

import java.util.Scanner;

public class FloydTriangle {

	private static Scanner in;

	public static void main(String[] args) {
		int n, num = 1, c, d;
		in = new Scanner(System.in);
		System.out.println("Enter the number:");
		n = in.nextInt();
		System.out.println("Floyd's triangle :");
		for (c = 1; c <= n; c++) {
			for (d = 1; d <= c; d++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}

}
