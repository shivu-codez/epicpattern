package interview;

import java.util.Scanner;

public class AutomorphicNumber {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        automorphicNumber(num);
	}
	
	public static void automorphicNumber(int num) {
		int sq_num = num*num;  
		 
        String str_num = Integer.toString(num);  
        String square = Integer.toString(sq_num);  
 
        if(square.endsWith(str_num))  
            System.out.println("Entered number is Automorphic.");
        else
            System.out.println("Entered number is Not an Automorphic.");
	}

}
