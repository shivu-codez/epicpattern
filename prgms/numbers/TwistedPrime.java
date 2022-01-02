package number;

import java.util.Scanner;

public class TwistedPrime {

	private static Scanner sc;

	public static void main(String[] args) {
		int n, reverse, sum = 0, flag;
		sc = new Scanner(System.in);
		System.out.println("Enter a prime number:");
		n = sc.nextInt();

		while (n != 0) {
			reverse = n % 10;
			sum = sum * 10 + reverse;
			n = n / 10;
		}

		flag = 0;
		for (int j = 2; j <= sum / 2; j++) {
			if ((sum % j) == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			System.out.println("Twisted Prime");
		else
			System.out.println("Not Twisted Prime");
	}
}
