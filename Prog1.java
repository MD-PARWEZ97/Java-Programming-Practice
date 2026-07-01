package PracticeProgram;

public class Prog1 {
	public static void main(String[] args) {
		String s ="leet Code";
		String s1=reverse(s);
		System.out.println(s1);
		
	}
	public static String reverse(String s) {
		String rev ="";
		for(int i=0; i<s.length();i++) {
			char c=s.charAt(i);
			
			rev=c+rev;
			
		}
		return rev;
	}
}
