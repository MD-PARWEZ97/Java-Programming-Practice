package PracticeProgram;

import java.util.Scanner;

public class Prog6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Stirng s :");
		String s=sc.nextLine();
		String str=eachWordReverse(s);
		System.out.println(str);
	}

	public static String eachWordReverse(String s) {
		String rev="", temp="";
		for(int i=0; i<s.length();i++) {
			char c=s.charAt(i);
			if(c!=' ')
				temp=c+temp;
			if(c==' ' || i==s.length()-1) {
				rev=rev+" "+temp;
				temp=" ";
			}
		}
		return rev;
	}
}
