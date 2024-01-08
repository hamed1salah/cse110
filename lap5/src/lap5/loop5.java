package lap5;
import java.util.Scanner;

public class loop5 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner (System.in);
		
		System.out.println("write the number");
		
		int number = Sc.nextInt();
		
		int reversedNumber= 0;
		
		while (number!= 0);{
			
		int digit = number % 10;
		
		reversedNumber = reversedNumber * 10 + digit; 
		number/=10;
		}
		 
		System.out.println("reversednumber:"+ reversedNumber );
		
		
	}
	
}
