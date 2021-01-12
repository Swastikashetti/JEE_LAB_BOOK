/**
 * Positive String or not
 * @author Swastika
 */
import java.util.Scanner;
public class Exercise6 {
	
	private static boolean checkIfPositive(String word) 
	{
		char[] character=word.toCharArray();
		for(int i=0;i<character.length-1;i++)
		{
			if(character[i]<character[i+1])
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);
		System.out.println("Enter the string :"+" ");
		String word = str.nextLine();
	 System.out.print(checkIfPositive(word));
	}
}