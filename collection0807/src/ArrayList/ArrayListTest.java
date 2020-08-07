package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();
		//키보드로부터 4개의 이름을 입력받아 ArrayList에 추가
		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i<4; i++) {
			System.out.println("이름을 입력하세요: ");
			String s = sc.next(); //키보드로부터 이름을 입력
			a.add(s); //ArrayList 컬렉션에 삽입
		}
		
		//ArrayList에 들어 있는 모든 이름 출력
		for(int i = 0; i<a.size(); i++) {
			String name = a.get(i); //ArrayList의 i번째 문자열을 가져온다.
			System.out.println(name + " ");
		}
		//가장 긴 이름 출력
		int longetIndex = 0; //현재 가장 긴 이름이 들어 있는 ArrayList 내의 인덱스
		for(int i = 1; i<a.size(); i++) {
			if(a.get(longetIndex).length() < a.get(i).length()) // 이름 길이 비교
				longetIndex = i; //i번째 이름이 더 긴 이름이므로 원래 데이터를 갱신함
		}
		System.out.println("\n 가장 긴 이름은 : "+a.get(longetIndex));
		sc.close(); //스캐너 종료
	}

}
