package week1.day2;

public class CharacterOccurance {

	public static void main(String[] args) {
		String str = "Welcome to Chennai";
		int count = 0;
		char[] charArray = str.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 'e') {
				count++;
			}
		}
		System.out.println(count);
	}

}
