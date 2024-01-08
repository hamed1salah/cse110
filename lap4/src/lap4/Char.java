package lap4;
import java.util.Scanner;
public class Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner SC = new Scanner (System.in);
char op = SC.next().charAt(0);

int x1 = 50 ;
int x2 = 10;

switch (op) {
case '+':
	System.out.println(x1+x2);
	break; 
	
case '-':
	System.out.println(x1-x2);
	break;
default : 
	System.out.println("please enter a valid operater");
}

		
	}

}
