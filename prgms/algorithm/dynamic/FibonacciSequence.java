package algorithms.dynamic;

import java.time.Instant;

public class FibonacciSequence {

	public static void main(String[] args) {

		long fibResult = 0;

		int num1 = 30;
		int num2 = 10;
		System.out.println("First " + num1 + " fibonacii series numbers: ");
		long startTime = Instant.now().toEpochMilli();

		for (int i = 1; i < num1; i++) {
			fibResult = fibonacii(i);
			System.out.print(fibResult + " ");
		}
		System.out.println();
		long endTime = Instant.now().toEpochMilli();

		System.out.println("Execution time: " + (endTime - startTime) + " ms");

		System.out.println("First " + num2 + " fibonacii series numbers: ");
		startTime = Instant.now().toEpochMilli();

		for (int i = 1; i < num2; i++) {
			fibResult = fibonacii(i);
			System.out.print(fibResult + " ");
		}
		System.out.println();
		endTime = Instant.now().toEpochMilli();

		System.out.println("Execution time: " + (endTime - startTime) + " ms");

	}

	private static long fibonacii(long n) {

		if (n <= 2) {
			return 1;
		}
		long fibNumber = fibonacii(n - 1) + fibonacii(n - 2);

		return fibNumber;
	}
}