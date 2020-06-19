package com.logical.examples;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicacy {

	//Approach-1
	public static void removeDuplicateFromSortedArray() {

		int[] sortedArr = { 1, 2, 2, 3, 4, 5, 5 };

		int[] tempArr = new int[sortedArr.length];

		int j = 0;
		for (int i = 0; i < sortedArr.length - 1; i++) {

			if (sortedArr[i] != sortedArr[i + 1]) {

				tempArr[j] = sortedArr[i];
				j++;
			}
		}
		tempArr[j] = sortedArr[sortedArr.length - 1];

		for (int i = 0; i < tempArr.length; i++) {
			System.out.print(tempArr[i] + ",");
		}
		System.out.println("");
	}

	// Approach-2 By using Set
	public static void removeDuplicateFromUnSortedArray() {

		Set<Integer> set = new HashSet<Integer>();

		int arr[] = { 4, 2, 5, 5, 6, 6, 7, 2 , 4 };

		for (int i = 0; i < arr.length; i++) {

			set.add(arr[i]);
		}

		for (int number : set) {
			System.out.print(number+",");
		}

	}

	public static void main(String[] args) {
		removeDuplicateFromSortedArray();
		
		removeDuplicateFromUnSortedArray();

	}

}
