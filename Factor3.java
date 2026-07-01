package While_Loop;

import java.util.*;
public class Factor3 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		sc.close();
		
		int i=1;
		int count=0;
		
		while(i <= n/2) {
			if(n%i ==0) {
				System.out.print(i+" ");
				count++;
			}
			i++;
		}
		System.out.print("\nTotal Number of Count :"+count);
	}
}
