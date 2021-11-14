package interview;

import java.util.Scanner;

public class NumberPositiveOrNegative {
	
	private static Scanner scanner;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		System.out.println("Enter a Number:");
        int num = scanner.nextInt();
        
        positiveOrNegative(num);
	}
	
	public static void positiveOrNegative(int num) {
		if(num>0)  
		{  
		System.out.println("The number is positive.");  
		}  
		else if(num<0)  
		{  
		System.out.println("The number is negative.");  
		}  
		else  
		{  
		System.out.println("The number is zero.");  
		}  

	}

}
