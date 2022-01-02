package number;

import java.util.Scanner;

public class FibonacciNumbers {

	private static Scanner scanner;

	public static void main(String[] args) {
		int n;
		
		scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
        n = scanner.nextInt();
        
		int firstTerm = 0, secondTerm = 1;
        
	    System.out.println("Fibonacci Series Upto " + n + ": ");
	    
	    while (firstTerm <= n) {
	      System.out.print(firstTerm + ", ");

	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;

	    }
	}

}
