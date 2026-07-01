package functional_Interface;

public class Driver_Lamda {
	public static void main(String[] args) {
		Calculate c2= (a,b) -> System.out.println("sum is :" +(a+b));
		c2.calculate(10, 20);
	}
}
