package interview;

import java.util.Scanner;

public class FirstNonRepeatedCharacterInString {

	private static Scanner sc;

	public static void main(String[] args) {
		String str;

		sc = new Scanner(System.in);

		System.out.println("Enter the String: ");
		str = sc.next();

		firstNonRepeated(str);
	}

	public static void firstNonRepeated(String str) {
		for (char i : str.toCharArray()) {
			if (str.indexOf(i) == str.lastIndexOf(i)) {
				System.out.println("First non-repeating character is: " + i);
				break;
			}
		}
	}

}
