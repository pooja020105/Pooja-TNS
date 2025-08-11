package day4.java.wrapper;

public class WrapperClass {

	public static void main(String[] args) {
		
		int x = 5;
		//autoboxing
		Integer y = Integer.valueOf(x);
		
		//unboxing 
		
		int z = y;
		
		System.out.println(y +" "+ z);

	}
}
