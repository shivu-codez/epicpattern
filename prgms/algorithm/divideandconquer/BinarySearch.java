package algorithms.divideandconquer;

import java.util.Arrays;

public class BinarySearch {

	public int binarySearch(int[] inputArr, int key) {

		int start = 0;
		int end = inputArr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (key == inputArr[mid]) {
				return mid;
			}
			if (key < inputArr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		BinarySearch mbs = new BinarySearch();
		System.out.println("Array Elements:");
		int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16 };

		System.out.println(Arrays.toString(arr));

		int num1 = 8;

		System.out.println("Key " + num1 + "'s position: " + mbs.binarySearch(arr, num1));
	}
}