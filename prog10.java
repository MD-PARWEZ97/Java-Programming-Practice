package PracticeProgram;

import java.util.*;
public class prog10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String s=sc.nextLine();
		boolean str=isPalindromic(s);
		System.out.println(" Palindromic or not : "+str);
	}
	public static boolean isPalindromic(String s) {
		int start =0; int end=s.length()-1;
	while(start <= end) {
		if(s.charAt(start)==s.charAt(end)) {
			return true;
		}
		start++;
		end--;
	}
	return false;
	}
}
