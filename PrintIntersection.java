package week1.day2;

import java.util.Iterator;

public class PrintIntersection {

	public static void main(String[] args) {
  
		int[] arr1 = { 1,2,3,4,5,6,7};
		
		int[] arr2 = { 3,4,6,9,0,11,1};
		
		for (int i = 0; i < arr1.length; i++) {
			
			for (int j = 0; j < arr2.length; j++) {
				
				if (arr1[i]==arr2[j]) {
					
					System.out.println("Intersection value is" + arr1[i]);
				}
				
			}
			
		}
	}

}
