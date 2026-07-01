package CollectionProgram;
import java.util.*;

public class list_itr {
		public static void main(String[] args) {
			List<Integer> l1 = new ArrayList<>();
			
			l1.add(10);
			l1.add(20);
			l1.add(30);
			
			ListIterator<Integer> ltr = l1.listIterator();
			while(ltr.hasNext()) {
			    ltr.next();   // move cursor to end
			}

			while(ltr.hasPrevious()) {
			    System.out.print(ltr.previous() + " ");
			}
		}
	}
