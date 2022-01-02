package number;

import java.util.Scanner;

public class ISBN {

	private static Scanner in;

	public static void main(String args[]) {
		in = new Scanner(System.in);
		System.out.print("Enter the ISBN: ");
		long isbn = in.nextLong();

		int sum = 0, count = 0, m = 10;
		while (isbn != 0) {
			int d = (int) (isbn % 10);
			count++;
			sum += d * m;
			m--;
			isbn /= 10;
		}

		if (count != 10) {
			System.out.println("Illegal ISBN");
		} else if (sum % 11 == 0) {
			System.out.println("Legal ISBN");
		} else {
			System.out.println("Illegal ISBN");
		}
	}

}
