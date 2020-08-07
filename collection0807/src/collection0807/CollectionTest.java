package collection0807;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {
		List<Integer> a1 = new ArrayList<>(); 
		a1.add(5);
		a1.add(4);
		a1.add(-1);
		a1.add(2,100);
		
		Iterator<Integer> it = a1.iterator();
		while(it.hasNext()) {
			int n = it.next();
			System.out.println("iterator Ãâ·Â°ª: "+n);
		}
		
	}

}
