import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		
		
   System.out.println("enter the n value:");
   int n;
   Scanner input = new Scanner(System.in);
   n = input.nextInt();
   
    int result =1;
  
     for(int i =1;i<=n;i++){
    	 
     result = result * i;
     }
		System.out.println("the factorial of"+n+ "is:");
		System.out.println(result);
		
	}

}
