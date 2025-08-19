package com.assignment2;

import java.util.Scanner;

public class Info {
  public static void main(String[] args) {
	  Scanner value=new Scanner(System.in);	  
	  String name=value.nextLine();  
	  int rollno=value.nextInt();
	  value.nextLine(); 
	  char grade=value.next().charAt(0);
	  int percentage=value.nextInt();

	  System.out.println(name);
	  System.out.println(rollno);	  
	  System.out.println(grade);
	  System.out.println(percentage + "%");

  }
}
