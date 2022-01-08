package algorithms.backtracking;

import java.util.Stack;

class SubSet {
	int set[];
	int sum;

	Stack<Integer> solutionSet;
	boolean hasSolution;

	SubSet(int set[], int sum) {
		this.set = set;
		this.sum = sum;
		this.solutionSet = new Stack<>();
		hasSolution = false;
	}

	public void solve(int s, int idx) {
		if (s > sum)
			return;

		if (s == sum) {
			hasSolution = true;

			displaySolutionSet();

			return;
		}

		for (int i = idx; i < set.length; i++) {
			solutionSet.push(set[i]);

			solve(s + set[i], i + 1);

			solutionSet.pop();
		}
	}

	private void displaySolutionSet() {
		for (Integer item : solutionSet) {
			System.out.print(item + " ");
		}
		System.out.println();
	}

}

public class SubsetSum {
	public static void main(String[] args) {
		int set[] = { 10, 7, 5, 18, 12, 20, 15 };
		int size = 30;

		SubSet ss = new SubSet(set, size);
		ss.solve(0, 0);

		if (ss.hasSolution == false)
			System.out.print("No Solution");
	}
}