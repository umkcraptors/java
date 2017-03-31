package whileLoops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		   System.out.println("enter the n value:");
		   int n;
		   Scanner input = new Scanner(System.in);
		   n = input.nextInt();
		   
		    int result =1;
		    int i =1;
		     while(i<=n){
		    	 
		     result = result * i;
		     i++;
		     }
				System.out.println("the factorial of"+n+ "is:");
				System.out.println(result);
		
	}

}
