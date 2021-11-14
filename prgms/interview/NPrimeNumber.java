package interview;

import java.util.Scanner;

public class NPrimeNumber {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		nthPrimeNumber(num);
	}

	public static void nthPrimeNumber(int n) {
		int num, count, i;
		num = 1;
		count = 0;

		while (count < n) {
			num = num + 1;
			for (i = 2; i <= num; i++) {
				if (num % i == 0) {
					break;
				}
			}
			if (i == num) {
				count = count + 1;
			}
		}
		System.out.println("Value of nth prime: " + num);
	}

}
