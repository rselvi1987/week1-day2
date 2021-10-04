package week1.day2;

import java.util.Arrays;

public class MissingAnElement {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,6,7,8};
		Arrays.sort(arr);
		for (int i =1;i<arr.length;i++) {
			if (i!=arr[i-1]) {  
				// arr [i-1] -- Position of the array-- so the output would be the value of 0 position which is equal to 1st number
				System.out.println(i);
				break;
			}
			
			}
	}

}
