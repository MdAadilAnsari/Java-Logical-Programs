package com.logical.examples;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesUsingLinkedHashSet {
	private static Set<String> charSet = null;

	public static void removeDuplicate(String str) {
		String[] string = str.split(" ");
		
		charSet = new LinkedHashSet<String>();
		for (String s : string) {
			charSet.add(s);
		}
		StringBuilder sb = new StringBuilder();
		for (String str1 : charSet) {
			sb.append(str1);
		}
		System.out.println(sb.toString());
	}

	public static void main(String[] args) {
		removeDuplicate("I am am learning java java");
	}

}
