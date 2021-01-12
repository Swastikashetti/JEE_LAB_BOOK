/**Create a method which accepts an integer array, reverse the numbers in the array and returns the resulting array in sorted order
 * @author Swastika
 */
import java.util.*;
public class Exercise3 {
	
	private static int[] getSorted(int[] array) {
		int length = array.length;
		for(int index=0;index<length;index++) {
			StringBuilder stb = new StringBuilder();
			stb.append(array[index]+"");
			stb.reverse();
			array[index]=Integer.parseInt(stb.toString());
		}
		Arrays.sort(array);
		return array;
	}
	
	private static int[] getInputArray() {
		Scanner scn = new Scanner(System.in);
		int size=0;
		System.out.println("Enter the size of the array");
		size = scn.nextInt();
		int [] array = new int[size];
		System.out.println("Enter the numbers of the array");
		for(int i=0;i<size;i++) {
			array[i]=scn.nextInt();
		}
		return array;
	}

	public static void main(String[] args) {
		int [] array = getInputArray();
		int length = array.length;
		array = getSorted(array);
		System.out.print("Sorted Array:");
		for(int i=0;i<length;i++) {
			System.out.print(array[i]+",");
		}
	}
}