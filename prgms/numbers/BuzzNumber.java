package number;

import java.util.Scanner;

public class BuzzNumber {

	private static Scanner sc;

	public static void main(String[] args) {
		int n;
		sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		n = sc.nextInt();
		if (n % 10 == 7 || n % 7 == 0) {
			System.out.println("Buzz number");
		} else {
			System.out.println("Not Buzz number");
		}
	}

}
