package ExceptionHandling;

import java.util.Scanner;
public class Program3 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number a: ");
		int a =sc.nextInt();
		System.out.println("Enter the Number b : ");
		int b = sc.nextInt();
		
		System.out.println("Enter the Index");
		int index=sc.nextInt();
		
		System.out.println("sum of a+b: " + (a+b));
		System.out.println();
		try {
			System.out.println(a/b);
			System.out.println("abc".charAt(index));
		}catch(ArithmeticException e) {
			System.out.println(" / zero is not Allows");
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println("String index not founds");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
       }
}