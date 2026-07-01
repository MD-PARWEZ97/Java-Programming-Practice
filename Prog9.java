package PracticeProgram;

import java.util.*;
public class Prog9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String s:");
		String s=sc.nextLine();
		int maxlength=largestLengthofSubstring(s);
		System.out.println("Length of Largest Substring without repatation :"+maxlength);
	}
	public static int largestLengthofSubstring(String s) {
		int [] index = new int [128];
		Arrays.fill(index, -1);
		int left=0; 
		int maxlen=0;
		for(int right=0; right<s.length();right++) {
			char c=s.charAt(right);
			if(index[c] >= left) {
				left=index[c]+1;
			}
			index[c]=right;
			int templen=right - left + 1;
			if(templen > maxlen)
				maxlen=templen;
		}
		return maxlen;
	}
}
