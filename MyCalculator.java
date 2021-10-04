package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		
		Calculator obj = new Calculator();
		int add = obj.add();
		System.out.println("Sum is"+add);
		System.out.println("Diff is"+ (obj.sub()));
		System.out.println("Multiplication is"+(obj.multiply()));
		System.out.println("Division is"+(obj.divide()));
	}

}
