package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {

		String test = "I am a software tester";
		String[] testArray = test.split("");
		for (int i = 0; i < testArray.length; i++) {

			if (i % 2 == 0) {

				int length = testArray[i].length();

				char[] totestchar = testArray[i].toCharArray();

				for (int j = length - 1; j >= 0; j--) {
					System.out.print(totestchar[j]);
				}
			} else {
				System.out.print(testArray[i]);
			}
			System.out.print(" ");
		}

	}
}
