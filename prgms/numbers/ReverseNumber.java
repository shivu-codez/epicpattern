package number;

import java.util.Scanner;

public class ReverseNumber {

	private static Scanner sc;

	public static void main(String[] args) {
		int a, res = 0, n;
		sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n = sc.nextInt();
		while (n != 0) {
			a = n % 10;
			res = (res * 10) + a;
			n = n / 10;
		}
		System.out.println("Reverse number is " + res);
	}

}
