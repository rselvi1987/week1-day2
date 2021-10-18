package week1.day2;

public class Palindrome {

	public static void main(String[] args) {

		String Str1 = "LiriL";
		String reverse = "";

		for (int i = Str1.length() - 1; i >= 0; i--) {

			reverse = reverse + Str1.charAt(i);

		}

		if (Str1.equalsIgnoreCase(reverse)) {

			System.out.println("It is a Palindrome");

		}

		else {

			System.out.println("It is not a Palindrome");
		}
	}

}
