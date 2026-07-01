package PracticeProgram;

import java.util.Scanner;

public class EachWordProg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String s:");
		String s=sc.nextLine();
		String str=EachWordString(s);
		System.out.println(str);
		sc.close();
	}
	public static String EachWordString(String s) {
		String rev="";
		String temp="";
		for(int i=0; i<s.length();i++) {
			char c=s.charAt(i);
			if(c!=' ') {
				temp = c+temp;
			}
			if(c == ' ' || i == s.length()-1) {
				rev = rev + " " +temp;
				temp="";
			}
		}
		return rev;
	}
}
