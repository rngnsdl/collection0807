package ArrayList;

public class NumberSortTest {

	public static void main(String[] args) {
		
		int [] a = {7,5,6,1,9,3};
		int longnumIndex = a[0];
		
		for(int i=0; i<a.length; i++) {
			
			if(longnumIndex< a[i])
				longnumIndex = a[i];
		}
		
		System.out.println(longnumIndex);
	}

}
