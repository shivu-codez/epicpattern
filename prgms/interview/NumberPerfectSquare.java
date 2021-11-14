package interview;

import java.util.Scanner;

public class NumberPerfectSquare {

	private static Scanner scanner;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		
		System.out.println("Enter a Number:");
        int num = scanner.nextInt();
        perfectRoot(num);
	}
	
	public static void perfectRoot(int num) {
		double root = Math.sqrt(num);
        if((Math.floor(root) - root)==0)
             System.out.println(num+" is a Perfect Square Number");
        else
            System.out.println(num+" is Not a Perfect Square Number");
	}

}
