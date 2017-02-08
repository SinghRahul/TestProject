package jenkinsTest;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		int n, c, fact = 1;
		 
	      System.out.println("Enter an integer to calculate it's factorial");
	      Scanner in = new Scanner(System.in);
	 
	      n = in.nextInt();
	 
	      if ( n < 0 )
	         System.out.println("Number should be non-negative.");
	      else
	      {
	         for ( c = 1 ; c <= n ; c++ )
	            fact = fact*c;
	 
	         System.out.println("Factorial of "+n+" is = "+fact);
	      }
	   }
	}