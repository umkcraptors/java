import java.util.Scanner;
public class AddingDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		   System.out.println("Enter a num:");
		 Scanner input = new Scanner(System.in);
		   num = input.nextInt();
		   
	        int sum = 0;
	       for (int i=0;i<num;i++) {
	            sum = sum + num % 10;
	            num = num / 10;
	        }
	        System.out.println("the sum of digits is:");
	        System.out.println(sum);
	    }
		   
		   
		   
	}


