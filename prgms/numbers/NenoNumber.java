package number;

import java.util.Scanner;

public class NenoNumber {

	private static Scanner sc;

	public static void main(String[] args) {
		int n, sqr = 1, sum = 0, r;
		sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		n = sc.nextInt();
		sqr = n * n;
		while (sqr > 0) {
			r = sqr % 10;
			sum = sum + r;
			sqr = sqr / 10;
		}
		if (n == sum) {
			System.out.println("Neon Number");
		} else {
			System.out.println("Not Neon Number");
		}
	}

}
