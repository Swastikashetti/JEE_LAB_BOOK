/**Java program that reads a line of integers and then displays each integer and the sum of all integers. (Use String Tokenizer class)?
 * @author Swastika
 */
import java.util.*;
class Exercise1
{
	public static void main(String args[])
	{
			Scanner str = new Scanner(System.in);
			System.out.print("Enter a line of numbers with space: ");
			String input = str.nextLine();
			StringTokenizer st = new StringTokenizer(input," ");
			int sum = 0;
			while(st.hasMoreTokens())
			{
				int n = 0;
				n = Integer.parseInt(st.nextToken());
				System.out.println("Number is: "+n);
				sum += n;
			}
			System.out.println("Sum of the numbers is: "+sum);
	}
}