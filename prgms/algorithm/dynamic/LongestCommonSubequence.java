package algorithms.dynamic;

public class LongestCommonSubequence {
	static void lcs(String S1, String S2, int m, int n) {
		int[][] lcstable = new int[m + 1][n + 1];

		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0)
					lcstable[i][j] = 0;
				else if (S1.charAt(i - 1) == S2.charAt(j - 1))
					lcstable[i][j] = lcstable[i - 1][j - 1] + 1;
				else
					lcstable[i][j] = Math.max(lcstable[i - 1][j], lcstable[i][j - 1]);
			}
		}

		int index = lcstable[m][n];
		int temp = index;

		char[] lcs = new char[index + 1];
		lcs[index] = '\0';

		int i = m, j = n;
		while (i > 0 && j > 0) {
			if (S1.charAt(i - 1) == S2.charAt(j - 1)) {
				lcs[index - 1] = S1.charAt(i - 1);

				i--;
				j--;
				index--;
			}

			else if (lcstable[i - 1][j] > lcstable[i][j - 1])
				i--;
			else
				j--;
		}

		System.out.println("S1 : " + S1);
		System.out.println("S2 : " + S2);
		System.out.print("LCS : ");
		for (int k = 0; k <= temp; k++)
			System.out.print(lcs[k]);
		System.out.print("");
	}

	public static void main(String[] args) {
		String S1 = "ACADB";
		String S2 = "CBDA";
		int m = S1.length();
		int n = S2.length();
		lcs(S1, S2, m, n);
	}
}