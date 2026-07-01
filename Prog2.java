package PracticeProgram;

import java.util.*;
public class Prog2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String s : ");
		String s =sc.nextLine();
		int result =getLargestPermutation(s);
		System.out.println("Largest Permutation of Substring : "+result);
		sc.close();
	}
	public static int getLargestPermutation(String s) {
		int maxLength=0;
		for(int i=0; i<s.length(); i++) {
			int odd=aroundCenter(s,i,i);
			int even=aroundCenter(s,i,i+1);
			
			int max=odd>even ? odd : even;
			
			if(max>maxLength) {
				maxLength = max;
			}
		}
		return maxLength;
	}
	
	public static int aroundCenter(String s, int start, int end) {
		while(start >=0 && end<s.length() && s.charAt(start)==s.charAt(end)) {
			start--;
			end++;
		}
		return end -start-1;
	}
}
