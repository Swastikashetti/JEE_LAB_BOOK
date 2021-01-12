import java.util.Scanner;

import com.cg.eis.exception.InvalidAgeException;

public class Exercise1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ag = new Scanner(System.in);
		System.out.println("Enter your age :" + " ");
		int age = ag.nextInt();
		
		 try {
			   if(age < 15) 
			    throw new InvalidAgeException("Invalid age");
			   else
			    System.out.println("Valid age");
			  }
		catch (InvalidAgeException e) {
			System.out.println("you have entered : "+e.getMessage());
		} 
	}
}

