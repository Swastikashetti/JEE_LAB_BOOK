/**
 * Create a method to find the sum of the cubes of the digits of an n digit number
 * @author Swastika
 * 05/01/21
 */
public class Exercise1 {
	static int cubesOf(int num, int sum)
	{
		while(num!=0) {
		int digit=num%10;	
		sum+=digit*digit*digit;
		num=num/10;
		}
		int result=sum;
		return result;
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num=22;
		int sum=0;
		int result;
		cubesOf(num,sum);
		System.out.println(cubesOf(num,sum));

	}

}