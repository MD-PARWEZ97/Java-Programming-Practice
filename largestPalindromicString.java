package PracticeProgram;

import java.util.*;
public class largestPalindromicString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String s: ");
		String s=sc.nextLine();
		String str=largstPalindromicSubstring(s);
		System.out.println(str);
	}
	public static String largstPalindromicSubstring(String s) {
		int maxlen=0;
		int start=0;
		int end=0;
		for(int i=0; i<s.length();i++) {
			int oddsize=expendAroundCenter(s,i,i);
			int evensize=expendAroundCenter(s,i,i+1);
			int max = oddsize > evensize ? oddsize : evensize;
			if(max > maxlen) {
				maxlen=max;
				start = i-(max-1)/2;
				end = i+max/2;
			}
		}
		return s.substring(start, end+1);
	}
	
	public static int expendAroundCenter(String s, int start, int end) {
		while(start >=0 && end <s.length() && s.charAt(start) == s.charAt(end)) {
			start--;
			end++;
		}
		return end - start-1;
	}
}
