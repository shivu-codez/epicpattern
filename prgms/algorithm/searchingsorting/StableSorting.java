package algorithms.searchingsorting;

import java.util.Arrays;

public class StableSorting {
	static void stableSelectionSort(int[] a, int n) {
		for (int i = 0; i < n - 1; i++) {

			int min = i;
			for (int j = i + 1; j < n; j++)
				if (a[min] > a[j])
					min = j;

			int key = a[min];
			while (min > i) {
				a[min] = a[min - 1];
				min--;
			}

			a[i] = key;
		}
	}

	static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		int[] a = { 4, 5, 3, 2, 4, 1 };
		System.out.println("Array:");
		System.out.println(Arrays.toString(a));
		stableSelectionSort(a, a.length);
		System.out.println("Sorted Array:");
		printArray(a);
	}
}