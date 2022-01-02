package number;

import java.util.Scanner;

public class ArmstrongNumber {

	private static Scanner sc;

	public static void main(String[] args) {
		int n, cubeSum = 0, num, r;
		sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		n = sc.nextInt();
		num = n;
		while (num > 0) {
			r = num % 10;
			cubeSum = cubeSum + (r * r * r);
			num = num / 10;
		}
		if (n == cubeSum) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not Armstrong Number");
		}
	}

}
