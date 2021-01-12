/**Second Smallest in the array
 * @swastika
 * 7/1/21
 */
import java.util.Arrays;

public class Exercise1 {
	public static int getSeconSmallest(int[] array) {
		Arrays.sort(array);
		if(array.length==0)
		{
			return 0;
		}
		else
		{
			System.out.println(array[1]);
			
			
			
		}
		
		return 0;
	}
public static void main(String[]args)
{
	int []array= {1,7,2,4,9,8};
	getSeconSmallest(array);
}
}