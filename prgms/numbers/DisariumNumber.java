package number;

import java.util.Scanner;

public class DisariumNumber {

	private static Scanner sc;

	public static void main(String[] args) {
		int r, n, num, digits = 0, sum = 0;
		sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		n = sc.nextInt();
		num = n;
		while (num > 0) {
			digits++;
			num = num / 10;
		}
		num = n;
		while (num > 0) {
			r = num % 10;
			sum = sum + (int) Math.pow(r, digits);
			num = num / 10;
			digits--;
		}

		if (n == sum) {
			System.out.println("Disarium Number");
		} else {
			System.out.println("Not Disarium Number");
		}
	}

}
