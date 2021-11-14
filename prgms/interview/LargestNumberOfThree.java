package interview;

import java.util.Scanner;

public class LargestNumberOfThree {

	private static Scanner sc;

	public static void main(String[] args) {
		int a, b, c, largest;  
		sc = new Scanner(System.in);  
		
		System.out.println("Enter the first number:");  
		a = sc.nextInt();  
		
		System.out.println("Enter the second number:");  
		b = sc.nextInt();  
		
		System.out.println("Enter the third number:");  
		c = sc.nextInt();  
		
		largest(a,b,c);
	}
	
	public static void largest(int a,int b,int c) {
		int largest = c > (a > b ? a : b) ? c : ((a > b) ? a : b);  
		System.out.println("The largest number is: "+largest);
	}

}
