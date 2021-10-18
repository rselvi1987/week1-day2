package week1.day2;

public class PrintDuplicatesInArray {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		int[] array1 = { 1,2,3,4,1,1,5,6,3,7,77};
		
		int count = 0;
		
		for (int i = 0; i < array1.length; i++) {
			
			for (int j = i+1; j < array1.length; j++) {
				
				if (array1[i]==array1[j]) {
					
					System.out.println("Duplicate value is" + array1[j]);	
					
				}
				
			}
		
		}
	}

}
