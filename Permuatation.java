package PracticeProgram;

import java.util.*;
public class Permuatation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String s :");
		String s=sc.nextLine();
		permutation(s);
		sc.close();
	}
	public static void permutation(String s) {
		printPermutation("",s);
	}
	
	public static void printPermutation(String prefix,String remaining) {
		if(remaining.length()==0) {
			System.out.println(prefix);
			return;
		}
		for(int i=0; i<remaining.length();i++) {
			char c=remaining.charAt(i);
			String left = remaining.substring(0,i) + remaining.substring(i+1);
			printPermutation(prefix+c, left);
		}
	}
}
