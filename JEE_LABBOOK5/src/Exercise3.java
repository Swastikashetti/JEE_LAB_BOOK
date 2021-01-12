import java.util.Scanner;

import com.cg.eis.exception.EmployeeException;

public class Exercise3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sal = new Scanner(System.in);
		System.out.println("Enter salary of the employee :" + " ");
		int salary = sal.nextInt();
		
		 try {
			   if(salary < 3000) 
			    throw new EmployeeException("Salary is Less than 3000 ");
			   else
			    System.out.println("Salary of the employee is : " + " " + salary);
			  }
		catch (EmployeeException e) {
			System.out.println(e.getMessage());
		} 
	}
}


