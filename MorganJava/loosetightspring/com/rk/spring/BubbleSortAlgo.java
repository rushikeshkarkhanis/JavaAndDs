package com.rk.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSortAlgo implements SortedAlgo {
	public int[] sort(int[] num) {

		// Logic for Bubble
		return num;
	}
}
