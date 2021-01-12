/** Fibonacci series 
*@author swastika
*6/1/21
*/
import java.util.Scanner;
public class Exercise3
{
	public static void fibonacci(int n) {
		int num1=1 , num2=1;
		int counter =0;
			while(counter <n) {
				System.out.print(num1 + " ");
				int num3 = num1+num2;
				num1=num2;
				num2=num3;
				counter=counter+1;
			}
	}
  public static void main(String[] args)
  {
	  int n;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number :");
		n=obj.nextInt();
	 fibonacci(n);
  }
}