package number;

import java.util.Scanner;

public class DuckNumber {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		String nstr = sc.nextLine();

		int l = nstr.length();
		int ctr = 0;
		char chr;

		for (int i = 1; i < l; i++) {
			chr = nstr.charAt(i);
			if (chr == '0')
				ctr++;
		}

		char f = nstr.charAt(0);

		if (ctr > 0 && f != '0')
			System.out.println("Duck number");
		else
			System.out.println("Not a duck number");
	}

}
