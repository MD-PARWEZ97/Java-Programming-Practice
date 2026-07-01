package PracticeProgram;

public class EachWordReve {
	public static void main(String[] args) {
		String s ="I Am a good guy";
		System.out.print(s);
		System.out.println();
		String s1=reverse(s);
		System.out.println(s1);
		
	}
	public static String reverse(String s) {
		String temp="";
		String rev="";
		for(int i=0; i<s.length();i++) {
			
			char c=s.charAt(i);
			
			if(c!=' ')
				temp = c+temp;
			
			if(c==' ' || i == s.length()-1) {
				rev= rev+" "+temp;
			
			temp="";
			}
		}
		return rev.trim();
	}
}
