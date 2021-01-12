/**
 * find the sum of N Natural no.
 * @author Swastika
 * 6/1/21
 */
import java.util.Scanner;

public class Exercise5 {
	static int calculateSum(int n)
	{
		
		int sum=0;
		for(int num=1; num<=n; num++)
		{
			if(num % 3==0 || num%5==0)
			{
				sum+=num;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj=new Scanner(System.in);
		System.out.println("enter :");
		int n=obj.nextInt();
		System.out.println(calculateSum(n));

	}

}