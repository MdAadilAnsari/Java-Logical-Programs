/**
 * 
 */
package com.logical.examples;

/**
 * @author Aadil
 *
 */
public class ReverseAString {
	
	public static void reverseInputString(String string) {
		StringBuilder sb = new StringBuilder(string);
		String result = sb.reverse().toString();
		System.out.println(result);
	}
	
	public static void reverseStringWithoutInbuiltMethod(String str) {
		byte[] strByteArray = str.getBytes();
		byte[] result = new byte[strByteArray.length];
		for(int i=0; i<strByteArray.length;i++) {
			result[i] = strByteArray[strByteArray.length-i-1];
			System.out.println(new String(result));
		}
	}
	public static void main(String[] args) {
		reverseInputString("Rahul Khanna");
		reverseInputString("abcba");
		System.out.println();
		reverseStringWithoutInbuiltMethod("aabdbdbbdytr");
	}

}
