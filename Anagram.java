package week1.day2;

import java.util.Arrays;

public class Anagram {
	
	/*
	 * Pseudo Code
	  
	 *Declare a String 
		String text1 = "stops";
	 *Declare another String
		String text2 = "potss"; 
	 * a) Check length of the strings are same then (Use A Condition)
	 * b) Convert both Strings in to characters
	 * c) Sort Both the arrays
	 * d) Check both the arrays has same value
	 * 
	 */

	public static void main(String[] args) {

		String text1 = "stops";
		String text2 = "potss";
		if(text1.length()==text2.length()) {
			System.out.println("Both the texts length are same");
		}
		 	
		char[] text1Array = text1.toCharArray();
		Arrays.sort(text1Array);
		char[] text2Array = text2.toCharArray();
		Arrays.sort(text2Array);
		
		int compare = Arrays.compare(text1Array, text2Array);
		if (compare==0) {
			
			System.out.println("Both are same");
		} else {
			
			System.out.println("Both are not same");
		}
	}

}
