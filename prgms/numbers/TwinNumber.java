package number;

import java.util.Scanner;

public class TwinNumber {

	private static Scanner sc;

	public static void main(String[] args) {
		int n1, n2, i, f1, f2;
		f1 = f2 = 1;
		sc = new Scanner(System.in);
		System.out.println("Enter First number:");
		n1 = sc.nextInt();
		System.out.println("Enter Second number:");
		n2 = sc.nextInt();
		for (i = 2; i < n1; i++) {
			if (n1 % i == 0) {
				f1 = 0;
				break;
			}
		}
		for (i = 2; i < n2; i++) {
			if (n2 % i == 0) {
				f2 = 0;
				break;
			}
		}
		if (f1 == 1 && f2 == 1 && Math.abs(n1 - n2) == 2) {
			System.out.println("Twin Prime Number");
		} else {
			System.out.println("Not a Twin Prime Number");
		}
	}

}
