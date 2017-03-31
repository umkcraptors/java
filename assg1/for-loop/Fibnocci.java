import java.util.Scanner;
public class Fibnocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		int a=0; 
		int b=1;
		int n;
		
		 System.out.println("Enter value of n:");
		 Scanner input = new Scanner(System.in);
		   n = input.nextInt();
		
		int sum = a+b;
		System.out.println(a);
		System.out.println(b);
			System.out.println(sum);
		
			
			for(int i=0;i<n;i++){
			a=b;
			b=sum;
			sum = a+b;
			System.out.println(sum);}
			
		
		
	}

}
