package interview;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesInString {
	
	private static Scanner scn;
	
	public static void main(String[] args) {
		
		System.out.println("Enter the String: ");
		scn = new Scanner(System.in);
		String string = scn.next();
		removeDuplicateCharacters(string);
	}
	
	public static void removeDuplicateCharacters(String string) {
		char[] chars = string.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char c : chars) {
		    charSet.add(c);
		}

		StringBuilder sb = new StringBuilder();
		for (Character character : charSet) {
		    sb.append(character);
		}
		System.out.println(sb.toString());
	}
}
