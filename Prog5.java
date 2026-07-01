package PracticeProgram;

import java.util.*;
public class Prog5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Stirng s :");
		String s=sc.nextLine();
		String str=Printreverse(s);
		System.out.println(str);
		
	}
	public static String Printreverse(String s) {
		String rev="";
		for(int i=0; i<s.length();i++) {
			char c=s.charAt(i);
			rev= c+rev;
		}
		return rev;
	}
}
