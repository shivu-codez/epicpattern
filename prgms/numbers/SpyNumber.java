package number;

import java.util.Scanner;

public class SpyNumber {

	private static Scanner sc;

	public static void main(String[] args) {
		int r, n, num, mul = 1, sum = 0;
		sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		n = sc.nextInt();
		num = n;
		while (num > 0) {
			r = num % 10;
			sum = sum + r;
			mul = mul * r;
			num = num / 10;
		}
		if (mul == sum) {
			System.out.println("Spy Number");
		} else {
			System.out.println("Not Spy Number");
		}
	}

}
