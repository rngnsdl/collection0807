package collection0807;

import java.util.ArrayList;
import java.util.List;

public class Function {
	
	public static void main(String[] args) {
		
		/*1급 객체(first citizen)
		 * 		아래는 1급 객체의 조건
		 * 		1.변수에 저장가능
		 *		2. 함수의 파라미터로 전달가능 
		 *		3. 함수에서 return 가능
		 *만약 함수가 일급 객체라면
		 *변수에 함수 저장가능
		 *함수의 파라미터로 함수를 전달가능
		 *함수에서 함수를 반환가능함
		 *자바에서 함수형 언어를 차용해서 함수를 위와같이 사용가능함
		 *그런데 람다는 이름없는 함수이므로
		 *함수의 파라미터로 전달가능
		 */		
		
		List<Integer> a1 = new ArrayList<Integer>();
		a1.add(7);
		a1.add(10);
		a1.add(13);
		a1.add(9);
		a1.add(7);
		a1.add(6);
		
		a1.forEach(i -> System.out.println(i*4)); 
		System.out.println();
		a1.forEach(i->{
			System.out.println("아래와 같이 여러개의 문자를 추가하는것이 가능");
			System.out.println("2배한 결과 " + i*2);
			System.out.println("3배한 결과 " + i*3);
			System.out.println("4배한 결과 " + i*4);
			
		});
		a1.removeIf( i -> (i%2 ==0));
		System.out.println(a1);
	}
	
}
