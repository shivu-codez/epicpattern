package interview;

import java.util.Scanner;

public class CountTheNumberWordsInString {
	
	private static Scanner sc;

	public static void main(String[] args) {
		String s;
		sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		s = sc.nextLine();
		countWords(s);
	}
	
	public static void countWords(String str) {
		int length = str.split(" ").length;
		System.out.println("String has " + length + " words long.");
	}

}
