package PracticeProgram;

import java.util.*;
public class kth_permutation {
	static int count=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String s :");
		String s=sc.nextLine();
		System.out.println("Enter the Kth ");
		int k=sc.nextInt();
		permutation(s,k);
		sc.close();
	}
	public static void permutation(String s, int k) {
		printPermutation("",s,k);
		System.out.println("Total Number of Count : "+count);
	}
	
	public static void printPermutation(String prefix, String remaining, int k) {
		if(remaining.length()==0) {
			count++;
			if(count==k)
			System.out.println(prefix);
		return;
		}
		for(int i=0; i<remaining.length();i++) {
			char c=remaining.charAt(i);
			String left=remaining.substring(0,i)+remaining.substring(i+1);
			printPermutation(prefix+c,left,k);
		}
	}
}
