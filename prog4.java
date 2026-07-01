package PracticeProgram;

import java.util.*;
public class prog4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String s :");
		String s=sc.nextLine();
		String str=sequanceString(s);
		System.out.println(str);
	}
	public static String sequanceString(String s) {
		String temp="", word="";
		for(int i=0; i<s.length();i++) {
			char c=s.charAt(i);
			if(c!=' ')
			word=c+word;
			if(c==' ' || i<s.length()-1) {
				word=temp+ " " +word;
				temp="";
			}
		}
		return word;
	}
}
