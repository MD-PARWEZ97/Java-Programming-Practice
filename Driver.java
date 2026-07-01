package Method_Overriding;

public class Driver {
	public static void main(String[] args) {
		Vehicle v1= new Car();
		v1.drive();
		Vehicle v2=new Bus();
		v2.drive();
		Vehicle v3= new Bike();
		v3.drive();
	}
}

