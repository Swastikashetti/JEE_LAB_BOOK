/**Mirror image of a String
 * @author Swastika
 */
import java.util.*; 
public class Exercise2{

public static String getImage(String reversed)
{ 
String sb=new StringBuffer(reversed).reverse().toString().toUpperCase() ;
return sb; 
} 

public static void main(String[] args)
{ 
Scanner sc=new Scanner(System.in);
System.out.print("Enter the string : ");
String word=sc.nextLine();
String reversed= getImage(word); 
System.out.println("The reverse word with a seprated pipe(|) is : "+word+"|"+reversed); 
} 
}