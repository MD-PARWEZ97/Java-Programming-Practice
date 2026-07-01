package For_Loop;

import java.util.Scanner;

public class HCF {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int n1= sc.nextInt();
		System.out.println("Enter the Secound Number: ");
		int n2= sc.nextInt();
		System.out.println("Enter the Third Number: ");
		int n3=sc.nextInt();
		
		 int lcm =getHcf(n1,n2,n3);
		 System.out.println("HCF is :"+lcm);
	}
	public static int getHcf(int a, int b, int c) {
		int small = (a<b && a<c) ? a:(b<c ? b:c);
		
		for(int i=small; ;i--) {
			if(i%a==0 && i%b==0 && i%c==0)
				return i;
		}
	}
}
