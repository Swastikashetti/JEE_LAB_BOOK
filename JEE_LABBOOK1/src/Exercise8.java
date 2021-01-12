/**Find if it is power two
 * @author Swastika
 */
import java.util.Scanner;

public class Exercise8 {
	static boolean checkNumber(int n)
	{
	    boolean flag=true;
		int square = n*n;
		if(square%2==0)
		{
			flag=true;
		}
		else
		{
			flag=false;
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=obj.nextInt();
		System.out.println(checkNumber(n));
		

	}

}