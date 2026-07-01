package PracticeProgram;

import java.util.*;
public class LargestPalindromicSubstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String s: ");
		String s=sc.nextLine();
		int largestLen=largestPalindromicSubstring(s);
		System.out.println(largestLen);
		sc.close();
	}
	public static int largestPalindromicSubstring(String s) {
		int maxlen=0;
		for(int i=0; i<s.length();i++) {
			int oddsize =expendAroundCenter(s,i,i);
			int evensize =expendAroundCenter(s,i,i+1);
			
			int max = oddsize > evensize ? oddsize : evensize;
			if(max > maxlen) {
				maxlen = max;
			}
		}
		return maxlen;
	}
	public static int expendAroundCenter(String s, int start, int end) {
		while(start >=0  &&  end < s.length() && s.charAt(start) == s.charAt(end)) {
			start--;
			end++;
		}
		return end-start-1;
	}
}
