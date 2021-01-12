/**
 * Find the difference between the sum of the squares and the square of the sum of the first n natural numbers
 * @author Swastika
 * 6/1/21
 */

import java.util.Scanner;

public class Exercise6 {
	
	static int calculateDifference(int n)
	{
		int num, sum=0, sum1=0,sum2=0;
		for(num=1;num<=n;num++)
		{
			sum1+=num*num;
			}
		for(num=1;num<=n;num++)
		{
			
			sum2+=num;
			}
		int result=sum2*sum2;
	    sum=sum1-result;
	    return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj= new Scanner(System.in);
		System.out.println("enter th no. n :");
		int n = obj.nextInt();
		System.out.println(calculateDifference(n));
	}

}
