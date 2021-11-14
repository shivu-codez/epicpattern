package interview;

import java.util.Scanner;

public class SmallestNumberOfThree {

	private static Scanner scanner;

	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		int num1, num2, num3;
		
        System.out.println("Enter First Number:");
        num1 = scanner.nextInt();
        
        System.out.println("Enter Second Number:");
        num2 = scanner.nextInt();
        
        System.out.println("Enter Third Number:");
        num3 = scanner.nextInt();
        
        smallest(num1, num2, num3);
	}
	
	public static void smallest(int num1,int num2,int num3) {
		int result, temp;
		
        temp = num1 < num2 ? num1:num2;
        result = num3 < temp ? num3:temp;
        
        System.out.println("Smallest Number : "+result);
	}

}
