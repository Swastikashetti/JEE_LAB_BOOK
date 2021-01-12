/*Sort Arrays
 * author-L.S.Kanishka
 */
import java.util.Arrays;

public class Exercise2 {
public static void main(String[]args)
{
	String[]arr= {"abcd","efgh","ijkl","mnop","qrst"};
	sortStrings(arr);
}

private static void sortStrings(String[] arr) {
	if((arr.length%2)!=0)
	{
		Arrays.sort(arr);
		for(int i=0;i<(arr.length /2)+1;i++)
		{
			arr[i]=arr[i].toUpperCase();
		}
		for(int i=(arr.length /2)+1+1;i<arr.length;i++)
		{
			arr[i]=arr[i].toLowerCase();
		}

		for (String element: arr) {
            System.out.println(element);
        }
		
	}
	else
	{
		Arrays.sort(arr);
		for(int i=0;i<(arr.length /2);i++)
		{
			arr[i]=arr[i].toUpperCase();
		}
		for(int i=(arr.length /2)+1;i<arr.length;i++)
		{
			arr[i]=arr[i].toLowerCase();
		}
		System.out.println(arr);
		for (String element: arr) {
            System.out.println(element);
        }	
	}	
}
}
