package CollectionProgram;
import java.util.ArrayList;
public class Program1 {
	public static void main(String[] args) {
		ArrayList<Integer> a1 =new ArrayList<>(); 
		a1.add(12);
		a1.add(null);
		a1.add(123);
		a1.add(23);
		a1.add(34);
		a1.add(45);
		System.out.println(a1);
		System.out.println(a1.get(0)+100);
	}
}
