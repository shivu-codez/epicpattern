package interview;

import java.util.Scanner;

public class TwoDigitNumberToWords {

	private static Scanner sc;

	public static void main(String args[]) {
		sc = new Scanner(System.in);
		System.out.println("enter the 2 digit number");
		int num = sc.nextInt();
		printWord(num);
	}

	public static void printWord(int num) {
		int n1 = num, n2 = num;
		int b = n1 % 10, a = n2 / 10;

		String[] single_digits = new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
				"nine" };
		String[] two_digits = new String[] { "", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
				"sixteen", "seventeen", "eighteen", "nineteen" };
		String[] tens_multiple = new String[] { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy",
				"eighty", "ninety" };
		if (a == 1) {
			System.out.println(two_digits[b + 1]);
		} else if (b == 0)
			System.out.println(tens_multiple[a]);
		else
			System.out.println(tens_multiple[a] + " " + single_digits[b]);
	}
}
