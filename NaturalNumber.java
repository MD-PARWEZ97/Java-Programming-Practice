package While_Loop;

import java.util.*;
public class NaturalNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		naturalNumber(n);
	}
	
	// sum of natural number
	public static void naturalNumber(int n) {
		if(n < 0) {
			System.out.println("Not Natural Number :");
			return;
		}
		int sum=0;
		int i=1;
		
		while(i <= n) {
			sum = sum+i;
			i++;
			System.out.print(sum+" ");
		}
	}
}
