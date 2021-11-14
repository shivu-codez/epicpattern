package interview;

public class PrintOddNumber {

	public static void main(String[] args) {
		System.out.println("The Odd Numbers between 1 to 100 are:");
		for (int number = 1; number <= 100; number++) {
			if (number % 2 != 0) {
				System.out.print(number + " ");
			}
		}
	}

}
