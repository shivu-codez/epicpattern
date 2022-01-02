package number;

import java.util.Scanner;

public class NivenNumber {

	private static Scanner sc;

	public static void main(String[] args) {
		int n, num, r, sum = 0;
		sc = new Scanner(System.in);
		System.out.print("Enter a number");
		n = sc.nextInt();
		num = n;
		while (num > 0) {
			r = num % 10;
			sum = sum + r;
			num = num / 10;
		}
		if (n % sum == 0) {
			System.out.println("Niven Number");
		} else {
			System.out.println("Not Niven Number");
		}
	}

}
