package lap4;
import java.util.Scanner;
public class Week {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner SC = new Scanner (System.in);
		int day = SC.nextInt();
		
		
		switch (day) {
		
		case 1 : System.out.println("sunday");
		 break;
		 
		  case 2 : System.out.println("monday");
	 	   break;
		
		   case 3 : System.out.println("thursday");
		    break;
		
		     case 4 : System.out.println("wednesday");
		      break;
		   
		default : System.out.println("enter a valid number ");
		}

	}

}
