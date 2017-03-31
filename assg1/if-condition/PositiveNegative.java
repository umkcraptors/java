import java.util.Scanner;
public class PositiveNegative {

	public static void main(String[] args) {
			
	     int num ;
 
	 Scanner input = new Scanner(System.in);
     System.out.println("Enter Num:" );  
    num = input.nextInt();
     
	 
		if (num>0){
			
			System.out.println(num +"num is positive ");
			
		}
		else if(num<0){
			System.out.println(num + "num is negative");
		}
		else{
			System.out.println(num  +"num is zero");
		}

	}

}
