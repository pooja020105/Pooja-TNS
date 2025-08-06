package day.basic;

public class ConditionalStatement {

	public static void main(String[] args) {
		int x = 6, y = 5;
		int a = 26;
		int b = 30;

		if (x >= y) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		if (!(a < b) || (a == b)) {
			System.out.println("Condition is TRUE");
		} else

		{
			System.out.println("Condition is FALSE");
		}
	}

}
