package com.rk.tightCoupling;

public class BinarySearchImpl {

	/*
	 * Tightly coupled
	 */

	public int binarySearch(int arrOfNum[], int numToSearch) {

		// Sorting an array
		// Bubble

		BubbleSortAlgo algo = new BubbleSortAlgo();

		int[] sortedNum = algo.sort(arrOfNum);

		// Quick

		QuikSortAlgo algo2 = new QuikSortAlgo();

		int[] sortNum = algo2.sort(arrOfNum);
		// Searching an array

		// Return a result

		return 3;
	}

}
