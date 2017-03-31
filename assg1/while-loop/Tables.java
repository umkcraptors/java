package whileLoops;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		   System.out.println("Enter a num:");
		 Scanner input = new Scanner(System.in);
		   num = input.nextInt();
	int result ;
	int i=1;
		   while(i<=10){
			   result =num*i;
		   System.out.println(num +" * "+i+ " is " +result);
		   i++;
		   }
		
	}

}
