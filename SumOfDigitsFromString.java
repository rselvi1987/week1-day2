package week1.day2;

public class SumOfDigitsFromString {

	public static void main(String[] args) {

		String text = "Tes12Le79af65";
		int sum=0;
		String text1= text.replaceAll("[\\D]", "");
		System.out.println(text1);
		char[] text2= text1.toCharArray();
		for (int i = 0; i < text2.length; i++) {
			
			if(Character.isDigit(text2[i])) {
				
				int p = Character.getNumericValue(text2[i]);
				sum=sum+p;
			}
			
		}
		
		System.out.println(sum);
	}

}
