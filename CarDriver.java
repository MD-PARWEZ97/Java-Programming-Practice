package Core_Java;

public class CarDriver {
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.drive();
		Vehicle v1= new Bus();
		v1.drive();
		Vehicle v2 = new Truck();
		v2.drive();
	}	
}
