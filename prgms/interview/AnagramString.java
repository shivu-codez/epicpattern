package interview;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

	private static Scanner sc;

	public static void main(String[] args) {
		String str1, str2;

		sc = new Scanner(System.in);

		System.out.println("Enter the String 1: ");
		str1 = sc.next();

		System.out.println("Enter the String 2: ");
		str2 = sc.next();
		
		anagram(str1, str2);

	}

	public static void anagram(String str1, String str2) {
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		if (str1.length() == str2.length()) {

			char[] charArray1 = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();

			Arrays.sort(charArray1);
			Arrays.sort(charArray2);

			boolean result = Arrays.equals(charArray1, charArray2);

			if (result) {
				System.out.println(str1 + " and " + str2 + " are anagram.");
			} else {
				System.out.println(str1 + " and " + str2 + " are not anagram.");
			}
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagram.");
		}
	}

}
