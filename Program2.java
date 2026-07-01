package ExceptionHandling;

import java.util.Scanner;
public class Program2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number a : ");
		int a=sc.nextInt();
		System.out.println("Enter a number b : ");
		int b =sc.nextInt();
		System.out.println("sum is : "+ (a+b));
		System.out.println("sub is : "+  ( a-b));
		try {
			System.out.println(a/b);
		} catch(Exception e){
			System.out.println("Divided is not Allow (we handle with the help of try catch)");
			System.out.println("==============");
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		System.out.println(a*b);
	}
}
