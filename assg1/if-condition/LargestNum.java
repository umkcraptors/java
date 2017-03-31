import java.util.Scanner;
public class LargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int num1,num2;
 
		 Scanner input = new Scanner(System.in);
	     System.out.println("Enter Num1:" );  
	    num1 = input.nextInt();
		
		 
	     System.out.println("Enter Num2:" );  
	    num2 = input.nextInt();
		
		if(num1>num2){
			System.out.println("num1 is greater than num2");
		}
		else{
			System.out.println("num2 is greater than num1");
		}
	}

}
