package number;

import java.util.Scanner;

public class MagicNumber {

	private static Scanner sc;

	public static void main(String[] args) {
		int n, r = 1, num, sum = 0;
		sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		n = sc.nextInt();
		num = n;
		while (num > 9) {
			while (num > 0) {
				r = num % 10;
				sum = sum + r;
				num = num / 10;
			}
			num = sum;
			sum = 0;
		}
		if (num == 1) {
			System.out.println("Magic Number");
		} else {
			System.out.println("Not Magic Number");
		}
	}

}
