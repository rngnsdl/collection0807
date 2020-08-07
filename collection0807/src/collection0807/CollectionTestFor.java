package collection0807;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionTestFor {

	public static void main(String[] args) {
		List<Integer> a1 = new ArrayList<>(); 
		a1.add(5);
		a1.add(4);
		a1.add(-1);
		a1.add(2,100);
		
		for(int i:a1)	System.out.println("advanced for문 출력값: "+i);
		
		
	}

}
