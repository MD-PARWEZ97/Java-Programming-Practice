package PracticeProgram;

import java.util.*;
public class fibonsacci {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		printFibonacci(n);
		
	}
	public static void printFibonacci(int n) {
		if(n < 0) {
			System.out.println(n +" Invalid Number ");
			return;
		}
		int n1 = 0, n2 =1;
		for(int i =1; i<n; i++) {
			System.out.print(n1+" ");
			int n3 = n1+n2;
			n1 = n2;
			n2 =n3;
		}
	}
}
