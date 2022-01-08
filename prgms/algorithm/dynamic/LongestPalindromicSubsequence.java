package algorithms.dynamic;

public class LongestPalindromicSubsequence {
	public static String findLongestPalindrome(String X, String Y, int m, int n, int[][] lookup) {
		if (m == 0 || n == 0) {
			return "";
		}

		if (X.charAt(m - 1) == Y.charAt(n - 1)) {
			return findLongestPalindrome(X, Y, m - 1, n - 1, lookup) + X.charAt(m - 1);
		}

		if (lookup[m - 1][n] > lookup[m][n - 1]) {
			return findLongestPalindrome(X, Y, m - 1, n, lookup);
		}

		return findLongestPalindrome(X, Y, m, n - 1, lookup);
	}

	public static int LCSLength(String X, String Y, int n, int[][] lookup) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (X.charAt(i - 1) == Y.charAt(j - 1)) {
					lookup[i][j] = lookup[i - 1][j - 1] + 1;
				}

				else {
					lookup[i][j] = Integer.max(lookup[i - 1][j], lookup[i][j - 1]);
				}
			}
		}

		return lookup[n][n];
	}

	public static void main(String[] args) {
		String X = "ABBDCACB";

		String Y = new StringBuilder(X).reverse().toString();

		int[][] lookup = new int[X.length() + 1][X.length() + 1];

		System.out
				.println("The length of the longest palindromic subsequence -> " + LCSLength(X, Y, X.length(), lookup));

		System.out.println("The longest palindromic subsequence -> "
				+ findLongestPalindrome(X, Y, X.length(), X.length(), lookup));
	}
}