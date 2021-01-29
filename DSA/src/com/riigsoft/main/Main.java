package com.riigsoft.main;

import java.util.Arrays;

import com.riigsoft.sort.BubbleSort;

public class Main {

	public static void main(String[] args) {
		int [] numbers ={7,2,4,1,3};
		var bubble = new BubbleSort();
		bubble.sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}

}
