package day4.java.interfaces;

public class FunctionInterface {
	public static void main(String[] args) {
		GreetingDemo gd = () -> 
		System.out.println("Hello Everyone, Welcome to the Java Session");
		gd.greet();
		
	}
}
