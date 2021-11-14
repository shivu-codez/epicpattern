package interview;

import java.util.Scanner;

public class AddTwoNumberWithoutPlusOperator {
	
	private static Scanner scn;

	public static void main(String[] args) {
		System.out.println("Enter a number1: ");
		scn = new Scanner(System.in);
		int num1 = scn.nextInt();
		System.out.println("Enter a number2: ");
		int num2 = scn.nextInt();
		System.out.println("Sum : "+add(num1,num2));
	}
	
	public static int add(int a, int b) {
	    return a-(-b);
	}

}
