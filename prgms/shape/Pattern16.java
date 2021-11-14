package shape;

import java.util.Scanner;

public class Pattern16 {

	private static Scanner scanner;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		System.out.println("Enter the number:");
		int rows = scanner.nextInt();
		
		for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }

            for (int k = i; k <= rows; k++)
            {
                if( i == 1 || k == i || k == rows)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = rows-1; i >= 1; i--)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }

            for (int k = i; k <= rows; k++)
            {
                if( i == 1 || k == i || k == rows)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
	}

}
