package While_Loop;

import java.util.*;
public class Prog3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		boolean str=isPerfectNumber(n);
		System.out.println(str+" ");
	}
	public static boolean isPerfectNumber(int n) {
		if(n < 6)
			return false;
		
		int sum =0;
		int i=1;
		
		while(i<=n/2) {
			if(n%i==0) 
				sum = sum+i;
			i++;
		}
		return n==sum;
	}
}
