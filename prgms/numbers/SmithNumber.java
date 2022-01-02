package number;

import java.util.Scanner;

public class SmithNumber {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n, f = 2, m, t, s1 = 0, s2 = 0, d;
		System.out.println("Enter a number:");
		n = sc.nextInt();
		m = n;
		while (n > 1) {
			if (n % f == 0) {
				t = f;
				while (t != 0) {
					d = t % 10;
					s1 += d;
					t /= 10;
				}
				n = n / f;
			} else
				f++;
		}
		t = m;
		while (t != 0) {
			d = t % 10;
			s2 += d;
			t /= 10;
		}
		if (s1 == s2)
			System.out.println("Smith Number");
		else
			System.out.println("Not a Smith Number");
	}

}
