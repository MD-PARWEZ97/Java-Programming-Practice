
package PracticeProgram;

import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number  is : ");
		int n=sc.nextInt();
		test(n);
	}
	public static void test(int n) {
		if(n < 2) {
			System.out.println(n + " is not prime");
			return;
		}
		int i =2;
		while(i <= n/2) {
			if(n%i==0) {
				System.out.println(n +" n is not prime");
				return;
			}
			i++;
		}
		System.out.println(n+ " is prime");
	}
}
