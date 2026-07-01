package For_Loop;

import java.util.Scanner;

public class LCM2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int n1= sc.nextInt();
		System.out.println("Enter the Secound Number: ");
		int n2= sc.nextInt();
		System.out.println("Enter the Third Number: ");
		int n3=sc.nextInt();
		
		 int lcm =getLcm(n1,n2,n3);
		 System.out.println("lcm is :"+lcm);
	}
	public static int getLcm(int a, int b, int c) {
		int big = ( a>b && a>c) ? a:(b>c?b:c);
		
		// int big = Math.max(a, Math.max(b, c));
		
		for(int i=big; ; i+=big) {
			if(i%a==0 && i%b==0 && i%c==0)
				return i;
		}
	}
}
