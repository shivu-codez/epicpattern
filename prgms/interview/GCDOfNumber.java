package interview;

import java.util.Scanner;

public class GCDOfNumber {

	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter a number1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter a number2: ");
		int num2 = sc.nextInt();
		gcd(num1, num2);
	}
	
	public static void gcd(int num1 , int num2) {
		int gcd = 1;

	    for (int i = 1; i <= num1 && i <= num2; ++i) {

	      if (num1 % i == 0 && num2 % i == 0)
	        gcd = i;
	    }

	    System.out.println("GCD of " + num1 +" and " + num2 + " is " + gcd);
	}

}
