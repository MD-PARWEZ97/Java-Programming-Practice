package CollectionProgram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class itr {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		
		l1.add(10);
		l1.add(20);
		l1.add(30);
		
		Iterator<Integer> ltr = l1.iterator();
		while(ltr.hasNext()) {
			System.out.print(ltr.next()+" ");
		}
		while(ltr.hasNext()) {
			System.out.print(ltr.next()+" ");
		}
	}
}
