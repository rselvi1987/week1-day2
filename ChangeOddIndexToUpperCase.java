package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		String Str = "changeme";
		
	char[] Str1=	Str.toCharArray();
		
		for (int i = 0; i < Str1.length; i++) {
			
			if (i%2==0) {
				
				Str1[i]= Character.toUpperCase(Str1[i]);
			
			System.out.println(Str1[i]);
			
			} else {
				
			}
			
		System.out.println(Str1[i]);
			
		}
		
	}

}
