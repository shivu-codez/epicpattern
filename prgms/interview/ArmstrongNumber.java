package interview;

import java.util.Scanner;

public class ArmstrongNumber {
	
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        armstrong(num);
	}
	
	public static void armstrong(int num) {
		int originalNumber = num;
		int remainder = 0 , result = 0;
        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
	}

}
