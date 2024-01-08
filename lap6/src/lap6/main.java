package lap6;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	
	      
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the values ");

	        int count = 0;
	        double sum = 0;
	        double value;

	        do {
	            value = scanner.nextDouble();

	            if (value != 0) {
	                sum += value;
	                count++;
	            }
	        } while (value != 0);

	        if (count > 0) {
	            double average = sum / count;
	            System.out.println("The average is: " + average);
	        } else {
	            System.out.println("No values entered. Cannot calculate average.");
	        }

	        scanner.close();
	    }
	        
}
