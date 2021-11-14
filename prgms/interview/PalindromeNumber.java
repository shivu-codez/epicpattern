package interview;

import java.util.Scanner;

public class PalindromeNumber {
	
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		System.out.println("Enter the number:");
		int num = sc.nextInt();
		palindromeNumber(num);
	}
	
	public static void palindromeNumber(int num) {
		int reversedNum = 0, remainder;
	    int originalNum = num;
	    
	    while (num != 0) {
	      remainder = num % 10;
	      reversedNum = reversedNum * 10 + remainder;
	      num /= 10;
	    }
	    
	    if (originalNum == reversedNum) {
	      System.out.println(originalNum + " is Palindrome.");
	    }
	    else {
	      System.out.println(originalNum + " is not Palindrome.");
	    }
	}

}
