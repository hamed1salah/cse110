package lap5;
import java.util.Scanner;

public class palindrone {
	
	
	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter a number: ");
		        long number = scanner.nextLong();
		        boolean isPalindrome = isPalindrome(number);
		        if (isPalindrome) {
		            System.out.println(number + " is a palindrome.");
		        } else {
		            System.out.println(number + " is not a palindrome.");
		        }
		    }

		    public static boolean isPalindrome(long number) {
		        long reversedNumber = 0;
		        long tempNumber = number;
		        while (tempNumber != 0) {
		            reversedNumber = reversedNumber * 10 + tempNumber % 10;
		            tempNumber /= 10;
		        }
		        return number == reversedNumber;
		    }
		}
			
		
					
				
			
