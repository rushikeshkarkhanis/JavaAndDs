package com.rk.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	@Autowired
	private SortedAlgo sortedAlgo;

	public void setSortedAlgo(SortedAlgo sortedAlgo) {
		this.sortedAlgo = sortedAlgo;
	}

	public int binarySearch(int arrOfNum[], int numToSearch) {

		// Loose coupling is by create a interface

		// Sorting an array
		// Bubble

		// used sortedalgo instead of algo

		// BubbleSortAlgo algo = new BubbleSortAlgo();

		int[] sortedNum = sortedAlgo.sort(arrOfNum);

		// Quick

		// QuikSortAlgo algo2 = new QuikSortAlgo();

		int[] sortNum = sortedAlgo.sort(arrOfNum);
		// Searching an array

		// Return a result

		System.out.println(sortedNum);
		System.out.println(sortNum);
		System.out.println(sortedAlgo);
		return 3;
	}

}
