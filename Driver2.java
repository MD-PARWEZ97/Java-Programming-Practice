package Anonymous_class;

public class Driver2 {
	public static void main(String[] args) {
		calcu add = (a , b) ->{
			System.out.println("Sum of:" +(a+b));
		};
		calcu mul = (a, b) -> {
			System.out.println("Multi of:"+(a*b));
		};
		
		int x=10;
		int y=20;
		
		add.calculator(x, y);
		mul.calculator(x, y);
		}
}
