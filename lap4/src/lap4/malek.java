package lap4;
import java.util.Scanner;

public class malek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner SC = new Scanner (System.in);
		
		String name = SC.next();
		

		switch (name) {
		
		case "salah" : System.out.println("class 1");
		 break;
		 
		  case "malek": System.out.println("class 2");
	 	   break;
		
		   case "ali" : System.out.println("class 3");
		    break;
		
		     case "joe": System.out.println("class 4");
		      break;
		   
		default : System.out.println("enter a valid number ");
		}

	}

}
