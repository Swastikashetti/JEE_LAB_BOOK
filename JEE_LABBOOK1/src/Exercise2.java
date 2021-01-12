/**
 * Simulation of traffic light.
 * @author Swastika
 * 6/1/21
 */
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) 
{
		// TODO Auto-generated method stub
 Scanner myObj = new Scanner(System.in);
 System.out.println("Select the light :");
 String trafficLight=myObj.nextLine().toUpperCase();
 System.out.println("Action is: " + trafficLight);
 switch(trafficLight)
{
 case "RED" :
	 System.out.println("STOP");
	 break;
 case "YELLOW" :
	 System.out.println("READY");
	 break;
default :
		 System.out.println("GO");
}
}
}