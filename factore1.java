package PracticeProgram;

import java.util.*;
public class factore1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		System.out.print("All the Factor is : ");
		int count =0;
		int i =1;
		while(i<=n/2) {
			if(n%i==0) {
			
				System.out.print(i+" ");
				count++;
			}
			i++;
		}
		System.out.print("\nTotal mumber of count : "+count);
	}
}
