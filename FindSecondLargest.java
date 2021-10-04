package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {

		int[] array1 = { 1, 2, 3, 7, 334, 1323, 433, 3433 };

		Arrays.sort(array1);

		int i = array1.length;

		System.out.println("Second Largest Number is" + array1[i - 2]);
	}

}
