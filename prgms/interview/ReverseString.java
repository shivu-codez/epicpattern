package interview;

import java.util.Scanner;

public class ReverseString {

	private static Scanner sc;

	public static void main(String[] args) {
		String s;
		sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		s = sc.nextLine();
		reverseString(s);
	}
	
	public static void reverseString(String str) {
		String res = "";
		System.out.println("Before reversing string is: "+str);
		for (int i = str.length(); i > 0; --i) {
			res += str.charAt(i - 1);
		}
		System.out.println("After reversing string is: "+res);
	}

}
