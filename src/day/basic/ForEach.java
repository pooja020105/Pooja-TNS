package day.basic;

public class ForEach {

	public static void main(String[] args) {
		int num[]= {1,26,34,56,78};	
				for(int value:num)
				{
				System.out.println(value);	
				}
				
				char alphabet[]= {'j','a','v','a'};
				for(char a:alphabet)
				{
					System.out.print(a);		
				}
				System.out.println(" ");
				String language[]= {"C","python","java"};
				for(String l:language)
				{
					System.out.print(l+" ");		
				}

	}

}
