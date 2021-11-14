package interview;

import java.util.Scanner;

public class SwapTwoNumbersWithoutThirdVariable {

	private static Scanner sc;

	public static void main(String[] args) {
		
        sc = new Scanner(System.in); 
        System.out.println("Enter the number1:");  
        int x = sc.nextInt();  
        System.out.println("Enter the number1:");  
        int y = sc.nextInt();  
        swapNumbers(x, y);
	}
	
	public static void swapNumbers(int x,int y) {
		System.out.println("before swapping numbers: "+x +" "+ y);  
        x = x + y;   
        y = x - y;   
        x = x - y;   
        System.out.println("After swapping: "+x +"  " + y); 
	}

}
