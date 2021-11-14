package interview;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestNumberInArray {

	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		int num[] = new int[size];
		System.out.println("Enter elements of array: ");
		for(int i=0;i<size;i++) {
			num[i] = sc.nextInt();
		}
		secondLargestNumber(num);
	}
	
	public static void secondLargestNumber(int num[]) {
		int n = num.length;
		 
	    Arrays.sort(num); 
	    System.out.println("Second Highest Number in array is: "+num[n-2]);
	}

}
