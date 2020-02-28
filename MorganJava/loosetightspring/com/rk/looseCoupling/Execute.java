package com.rk.looseCoupling;

public class Execute {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// In context of Spring

		// What are beans?

		// What are the dependencies of the beans

		// Where to search for Beans

		BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new BubbleSortAlgo());

		BinarySearchImpl binarySearchImpl2 = new BinarySearchImpl(new QuikSortAlgo());

		int result = binarySearchImpl.binarySearch(new int[] { 12, 5, 19, 10 }, 3);

		int result2 = binarySearchImpl2.binarySearch(new int[] { 12, 5, 19, 10 }, 3);
		System.out.println(binarySearchImpl);
		System.out.println(binarySearchImpl2);
		System.out.println(result);
		System.out.println(result2);
	}

}
