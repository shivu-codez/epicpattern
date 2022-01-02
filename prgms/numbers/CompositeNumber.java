package number;

import java.util.Scanner;

public class CompositeNumber {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		int n, p, i, c = 0;
		System.out.println("Enter a Number:");
		n = in.nextInt();
		p = n;
		for (i = 2; i < n; i++) {
			if (n % i == 0) {
				c++;
			}
		}
		if (c > 1) {
			System.out.println("Composite Number : " + p);
		} else {
			System.out.println("Not Composite Number : " + p);
		}
	}

}
