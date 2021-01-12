/** Prime Number 
*@author swastika
*6/1/21
*/
import java.util.Scanner;
public class Exercise4 {
	public static void main(String args[])
    {
        int  num, i, j, count=0;
        
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
		for(i=2; i<=num; i++)
        {
            count = 0;
            for(j=2; j<i; j++)
            {
                if(i%j == 0)
                {
                    count++;
                    break;
                }
            }
            if(count == 0)
            {
                System.out.println(i);
            }
        }
    }
}

