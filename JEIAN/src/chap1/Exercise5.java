package chap1;

import java.util.ArrayList;
import java.util.Random;

public class Exercise5 {

	public static void main(String[] args) {

		ArrayList<Double> test = new ArrayList<>();
		Random input = new Random();
		for (int i = 0; i < 100; i++) {
			test.add(100.0 * (input.nextDouble()));
		}
		System.out.println("Original List inputed:" + test.toString());
		System.out.println("Sorted List:" + quickSort(test).toString());

	}

	private static ArrayList<Double> quickSort(ArrayList<Double> unSort) {
		int size = unSort.size();
		if (size > 1) {
			double partion = unSort.get(size - 1);
			ArrayList<Double> a = new ArrayList<>();
			a.add(partion);
			ArrayList<Double> b = new ArrayList<>();
			for (int i = 0; i < size - 1; i++) {
				if (unSort.get(i) <= partion) {
					a.add(unSort.get(i));
				} else {
					b.add(unSort.get(i));
				}
			}
			ArrayList<Double> aSort = quickSort(a);
			ArrayList<Double> bSort = quickSort(b);
			ArrayList<Double> totalSort = new ArrayList<>();
			for (int i = 0; i < aSort.size(); i++) {
				totalSort.add(aSort.get(i));
			}
			for (int i = 0; i < bSort.size(); i++) {
				totalSort.add(bSort.get(i));
			}
			return totalSort;
		} else {
			return unSort;
		}
	}

}
