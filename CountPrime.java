package While_Loop;

import java.util.*;
public class CountPrime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		printPrime(n);
	}
	public static void printPrime(int n) {
		if(n < 2) {
			System.out.print(n+": is not prime");
		return;
		}
		int count=0;
		int i=1;
		while(i<=n) {
			if(n%i ==0) {
				count++;
			}
			i++;
		}
		if(count==2)
			System.out.print(n+": is prime");
		else {
			System.out.print(n+": not prime");
		}
	}
}
