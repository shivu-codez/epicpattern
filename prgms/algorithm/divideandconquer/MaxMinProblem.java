package algorithms.divideandconquer;



public class MaxMinProblem {
    int[] array;
    int max, min;

    public MaxMinProblem(int n) {
        array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) Math.round(Math.random() * 12 + 26);
        }
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void dacMaxMini() {
        dacMaxMin(0, array.length - 1);
    }

    public void dacMaxMin(int i, int j) {
        int max1, min1, mid;
        if (i == j) {
            max = min = array[i];
        } else if (i == j - 1) {
            if (array[i] < array[j]) {
                max = array[j];
                min = array[i];
            } else {
                max = array[i];
                min = array[j];
            }
        } else {
            mid = (i + j) / 2;
            dacMaxMin(i, mid);
            max1 = max;
            min1 = min;
            dacMaxMin(mid + 1, j);
            if (max < max1) {
                max = max1;
            }
            if (min > min1) {
                min = min1;

            }
        }
    }

    public static void main(String[] a) {
    	MaxMinProblem m = new MaxMinProblem(20);
        System.out.println("Array Elements:");
        m.print();
        m.dacMaxMini();
        System.out.println("Array maximum element : " + m.getMax());
        System.out.println("Array minimum element : " + m.getMin());
    }
}