package chap1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;


public class Exercise5Methods {
	int count;
	
	public Exercise5Methods() {
		count = 0;
	}
	
	public void run() {
		List<Double> test = new ArrayList<>();
		Random input = new Random();
		for (int i = 0; i < 5; i++) {
			test.add(100.0 * (input.nextDouble()));
		}
		System.out.println("Original List inputed:" + test.toString());
		System.out.println("Sorted List:" + quickSort(test).toString());
		System.out.println("Amount of itterations:" + count);
	}

	
	
	
//	private List<T extends Comparable<T>> quickSort1(List<T extends Comparable> unSort) {
//		this.count += 1;
//		int size = unSort.size();
//		if (size > 1) {
//			Comparable partion = unSort.get(size - 1);
//			List<? extends Comparable> a = new ArrayList<>();
//			a.add((Collection<?>) partion);
//			List<? extends Comparable> b = new ArrayList<>();
//			for (int i = 0; i < size - 1; i++) {
//				if (-1 == unSort.get(i).compareTo(partion)) {
//					a.add(unSort.get(i));
//				} else {
//					b.add(unSort.get(i));
//				}
//			}
//			List<? extends Comparable> aSort = quickSort(a);
//			List<? extends Comparable> bSort = quickSort(b);
//			List<? extends Comparable> totalSort = new ArrayList<>();
//			for (int i = 0; i < aSort.size(); i++) {
//				totalSort.add(aSort.get(i));
//			}
//			for (int i = 0; i < bSort.size(); i++) {
//				totalSort.add(bSort.get(i));
//			}
//			return totalSort;
//		} else {
//			return unSort;
//		}
//	}
	
	private static List<Double> quickSort(List<Double> test) {
		int size = test.size();
		if (size > 1) {
			double partion = test.get(size - 1);
			List<Double> a = new ArrayList<>();
			a.add(partion);
			List<Double> b = new ArrayList<>();
			for (int i = 0; i < size - 1; i++) {
				if (test.get(i) <= partion) {
					a.add(test.get(i));
				} else {
					b.add(test.get(i));
				}
			}
			List<Double> aSort = quickSort(a);
			List<Double> bSort = quickSort(b);
			List<Double> totalSort = new ArrayList<>();
			for (int i = 0; i < aSort.size(); i++) {
				totalSort.add(aSort.get(i));
			}
			for (int i = 0; i < bSort.size(); i++) {
				totalSort.add(bSort.get(i));
			}
			return totalSort;
		} else {
			return test;
		}
}

}
