package number;

import java.util.Scanner;

public class AutomotphicNumber {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = in.nextInt();
 
        int c=0, sqr = num*num;
        int temp =num;  
 
        while(temp>0){
            c++;
            temp=temp/10;
        }
 
        int lastSquareDigits = (int) (sqr%(Math.pow(10,c)));
 
        if(num == lastSquareDigits)
            System.out.println("Automorphic number");
        else
            System.out.println("Not an Automorphic number");
	}

}
