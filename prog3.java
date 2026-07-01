package PracticeProgram;

import java.util.*;
public class prog3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String s: ");
		String s=sc.nextLine();
		String str=reverseEachWord(s);
		System.out.println(str);
		sc.close();
	}
	public static String reverseEachWord(String s) {
		String temp="";
		String rev="";
		for(int i=0; i<s.length();i++) {
			char c=s.charAt(i);
			if(c!=' ')
				temp = c+temp;
			if(c==' '|| i==s.length()-1) {
				rev=rev+" "+temp;
				temp="";
			}
		}
		return rev;
	}
}
