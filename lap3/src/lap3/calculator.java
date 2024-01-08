package lap3;

import java.util.Scanner;
import java.util.*;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fnum;
		double snum;
		// the data value 
		
		Scanner sc = new Scanner (System.in);
		System.out.println("please enter first number");
		fnum = sc.nextDouble();
		
		//fnum++ = .fnum+1 
		//fnum += 2. fnum+2
		
		System.out.println("please enter secound number");
		
		snum = sc.nextDouble();
		
		double sum= fnum+snum;
		
        double time= fnum*snum;
		
		double divide= fnum/snum;
		
		double subtract= fnum-snum;
		
		System.out.println("what do u need ");
		 
		String x1 = sc.next();
		
		if(x1.equals("sum"))
			// .equals for string 
			
		System.out.println("the sum is " + sum);
	
		if (x1.equals("time" ))
		
		System.out.println("the time is "+ time);
		
		if (x1.equals("divide"))
			
		System.out.println("the divide is "+ divide);
		
		
		if (x1.equals("subtract" ))
			
			System.out.println("the subtract is "+ subtract );
	}

}
