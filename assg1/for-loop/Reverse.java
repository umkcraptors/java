import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
	
		int num,revnum;
		   System.out.println("Enter a num:");
		 Scanner input = new Scanner(System.in);
		   num = input.nextInt();
		   
		   for(int i=0;i<num;i++){
		   revnum =num%10;
		   num =num /10;
		
		   System.out.print(revnum);
		   
		   }
		   
		  	   
	}

}
