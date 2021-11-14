package interview;

import java.util.Scanner;

public class RemoveDuplicatesInArray {
	
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
		
		int res[] = removeDuplicates(num);
		
		System.out.println("Results: ");
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i] +" ");
		}
		
	}
	
	public static int[] removeDuplicates(int[] num){
	    int end = num.length;

	    for (int i = 0; i < end; i++) {
	        for (int j = i + 1; j < end; j++) {
	            if (num[i] == num[j]) {                  
	            	num[j] = num[end-1];
	                end--;
	                j--;
	            }
	        }
	    }

	    int[] whitelist = new int[end];
	    System.arraycopy(num, 0, whitelist, 0, end);
	    return whitelist;
	}

}
