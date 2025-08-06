package day.basic;

public class ContinueStatement {

	public static void main(String[] args) {
		for (int n = 1; n < 15; n++)
		{
		if (n%2 != 1)
		continue;
		System.out.print(n + " ");
		}
	}

}
