import java.util.Scanner;
import com.cg.eis.exception.*
;
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner fs= new Scanner(System.in);
		System.out.println("Enter First Name :" + " ");
		String firstName= fs.nextLine();
		
		Scanner ls= new Scanner(System.in);
		System.out.println("Enter Last Name :" + " ");
		String lastName= ls.nextLine();
		
		try
		{
			if(firstName.isEmpty() || lastName.isEmpty())
			{
				throw new InvalidNameException("First or Last Name of the message not entered ");
			}
			else
			{
				System.out.println("Name of the Employee :" + " " + firstName + " " + lastName);
			}
		}
		catch (InvalidNameException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
