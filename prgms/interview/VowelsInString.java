package interview;

import java.util.Scanner;

public class VowelsInString {
	
	private static Scanner sc;

	public static void main(String[] args) {
		String str;
		sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		str = sc.next();
		
		vowels(str);
	}
	
	public static void vowels(String str) {
		 System.out.println("Vowels:");
	      for(int i=0; i<str.length(); i++) {
	         if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
	            System.out.print(str.charAt(i)+" ");
	         }
	      }
	}

}
