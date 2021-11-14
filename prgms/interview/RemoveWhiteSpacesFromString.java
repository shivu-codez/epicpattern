package interview;

import java.util.Scanner;

public class RemoveWhiteSpacesFromString {

	private static Scanner sc;
	
	public static void main(String[] args) {
		String s;
		sc = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		s = sc.nextLine();
		
		System.out.println("String : "+s);
		System.out.println("After Replace : "+s.replaceAll(" ", ""));
	}

}
