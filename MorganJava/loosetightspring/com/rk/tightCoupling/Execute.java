package com.rk.tightCoupling;

public class Execute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchImpl binarySearchImpl = new BinarySearchImpl();

		int result = binarySearchImpl.binarySearch(new int[] { 12, 5, 19, 10 }, 3);

		System.out.println(result);
	}

}
