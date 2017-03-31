package whileLoops;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num,revnum;
		   System.out.println("Enter a num:");
		 Scanner input = new Scanner(System.in);
		   num = input.nextInt();
		   
		   while(num!=0){
		   revnum =num%10;
		   num =num /10;
		
		   System.out.print(revnum);
		   
		   }
		
		
	}

}
