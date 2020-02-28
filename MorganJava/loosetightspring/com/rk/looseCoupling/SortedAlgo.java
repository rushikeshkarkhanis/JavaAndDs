package com.rk.looseCoupling;

import org.springframework.stereotype.Component;

@Component
public interface SortedAlgo {
	public int[] sort(int[] num);
}
