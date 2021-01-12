
public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "JAVA";
		System.out.println(alterString(str));
	}
 public static String alterString(String str) {
	 
	 StringBuffer s = new StringBuffer(str);
	 for(int i=0;i<str.length();i++)
	 {
		 char c = s.charAt(i);
		 if(!(c=='A' || c=='E' ||c=='I' ||c=='O' ||c=='U' || 
				 c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u'))
		 {
			 s.replace(i, i+1,String.valueOf((char)(c+1)));
		 }
	 }
	 return s.toString();
 }
}