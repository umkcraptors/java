import java.util.Scanner; 
public class Tables {

	public static void main(String[] args) {
		int num;
		   System.out.println("Enter a num:");
		 Scanner input = new Scanner(System.in);
		   num = input.nextInt();
	int result ;
		   for(int i=1;i<=10;i++){
			   result =num*i;
		   System.out.println(num +" * "+i+ " is " +result);
		   }

	}

}
