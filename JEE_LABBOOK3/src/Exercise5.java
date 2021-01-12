/**Write a Java program that displays the number of characters, lines and words in a text. 
 * @author swastika
 * 
 */

	import java.util.*;
	import java.io.*;
	public class Exercise5{ 
		static int wordCount = 0,lineCount=0;
		public static void main(String args[]) { 
			String s="";
			try {
				s = getInputString();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("No.of words "+wordCount);
			System.out.println("No.of characters "+s.length());
			System.out.println("No.of lines "+lineCount);
		}
		private static String getInputString() throws IOException  {
			String fileName = "C:\\Users\\Swastika\\Desktop\\java daily notes.txt"; 
			Scanner sc = new Scanner(new FileInputStream(fileName));
			String s="",tempString="";
			while (sc.hasNextLine()) { 
				tempString=sc.nextLine(); 
				s+=tempString+" ";
				String[] words=tempString.split(" ");
				wordCount+=words.length;
				lineCount++;
			} 
			
			return s;
		}
	}
