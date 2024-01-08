package lap4;

import java.util.Scanner;
public class Ifstat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner SC = new Scanner (System.in);

		int x = SC.nextInt();
		int y = SC.nextInt();
		
		if (x%2==0 & y%2==0) {
			System.out.println("both are even");
		}
		else {
			System.out.println("both are odd");
		}
	}

}
