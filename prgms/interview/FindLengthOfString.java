package interview;

import java.util.Scanner;

public class FindLengthOfString {
	
	private static Scanner sc;

	public static void main(String[] args) {
		String str;

		sc = new Scanner(System.in);

		System.out.println("Enter the String: ");
		str = sc.next();
		
		getLengthOfString(str);
	}

	public static void getLengthOfString(String str) {
		int length = 0;
		char[] strCharArray = str.toCharArray();
		for (char c : strCharArray) {
			length++;
		}
		System.out.println("Length Of String : "+length);
	}

}
