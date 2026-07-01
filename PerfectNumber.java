package While_Loop;

import java.util.*;
public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		boolean str=perfectNumebr(n);
		System.out.println(str);
	}
	public static boolean perfectNumebr(int n) {
		if(n < 6) {
			System.out.print("Not Perfect Number: ");
			return false;
		}
		int sum=0;
		int i=1;
		while(i <= n/2) {
			if(n%i==0)
				sum = sum+i;
			i++;
		}
		return n==sum;
	}
}
