package PracticeProgram;

import java.util.*;
public class Annagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First String s:");
		String s=sc.nextLine();
		System.out.println("Enter the Secound String t :");
		String t=sc.nextLine();
		boolean str = isAnnagram(s,t);
		System.out.println(str);
	}
	public static boolean isAnnagram(String s, String t) {
		if(s.length()!=t.length())
			return false;
		
		int[] freq1 = getFrequency(s);
		int[] freq2 = getFrequency(t);
		for(int i=0; i<128; i++) {
			if(freq1[i]!=freq2[i])
				return false;
		}		
		return true;
	}
	public static int[] getFrequency(String s) {
		s=s.toLowerCase();
		int[] freq = new int [128];
		for(int i=0; i<s.length();i++) {
			freq[s.charAt(i)]++;
		}
		return freq;
	}
}
