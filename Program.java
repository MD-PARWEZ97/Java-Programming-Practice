package ExceptionHandling;

public class Program {
	public static void main(String[] args) {
		
//		System.out.println(10/0);
		throw new ArithmeticException("Divided by is not allow");
//		throw new ArithmeticException("Division by zero is not allowed");
	}
}
