package interview;

import java.util.Scanner;

public class PalindromeString {
	
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		System.out.println("Enter the String:");
		String str = sc.next();
		palindromeString(str);
	}
	
	public static void palindromeString(String string) {
		String rev = "";
		int length = string.length();
		 
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + string.charAt(i);
	 
	      if (string.equals(rev))
	         System.out.println(string+" is a palindrome");
	      else
	         System.out.println(string+" is not a palindrome");
	}

}
