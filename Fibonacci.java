package While_Loop;

import java.util.*;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		Fibonacciserise(n);
	}
	public static void Fibonacciserise(int n) {
		if(n < 0) {
			System.out.print("Invalid Input Enter");
			return;
		}
			int n1=0, n2=1;
			int i=0;
			
			while(i <= n) {
				System.out.print(n1+" ");
				
				n2 = n1+n2;
				n1=n2-n1;
				
				i++;
			}
	}
}
