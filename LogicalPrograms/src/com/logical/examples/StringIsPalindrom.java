package com.logical.examples;

public class StringIsPalindrom {
	
	public static boolean stringIsPalindrom(String str) {
		if(str==null)
			return false;
		int length = str.length();
		System.out.println(length / 2);
		for(int i = 0; i < length / 2; i++) {
			if(str.charAt(i)!= str.charAt(length-i-1))
			return false;
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		stringIsPalindrom("abcba");
		stringIsPalindrom("abdab");
		
		String s = "Hello ";
		s += "World";
		System.out.println(s);
		System.out.println(s.trim());
		
		String str1 = "Welcome to Java Program";
		char[] chars = str1.toCharArray();
		System.out.println(chars);
	}

}
