package PracticeProgram;

import java.util.*;
public class Prog7 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String :");
	String s=sc.nextLine();
	int size=largestPalindromic(s);
	System.out.println("Largest length of Palindromic Substring : "+size);
  }
public static int largestPalindromic(String s) {
	int maxlength=0;
	for(int i=0; i<s.length();i++) {
		int oddsize=expentAroundCenter(s,i,i);
		int evensize=expentAroundCenter(s,i,i+1);
		
		int max=oddsize > evensize ? oddsize:evensize;
		if(max > maxlength) {
			maxlength=max;
		}
	}
	return maxlength;
}
public static int expentAroundCenter(String s, int start, int end) {
		while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)) {
			start--;
			end++;
		}
		return end-start-1;
 }
}
