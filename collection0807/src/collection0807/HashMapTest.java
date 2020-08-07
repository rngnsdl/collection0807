package collection0807;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		//영어 단어와 한글 단어의 쌍을 저장하는 HashMap 컬렉션 생성
		HashMap<String,String>dic = new HashMap<String,String>();	
		//dic<key(문자열), value(문자열)>HashMap 생성	
		//3개의 (key,value) 쌍을 dic에 저장
		dic.put("baby", "아기"); //key는 baby, value 는 아기
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		//dic 해시맵에 있는 모든 (key,value) 쌍 출력
		Set<String>keys = dic.keySet(); // 모든 키를 Set 컬렉션에 받아옴 
		//keySet은 모든 키값의 정보를 불러올 수 있음.
		//get(key)는 밸류값을 가져올 수 있음.
		//values는 모든 밸류의 정보를 불러올 수 있음.
		
		Iterator<String> it = keys.iterator(); //Set에 접근하는 Iterator 리턴
		while(it.hasNext()) { //Iterator와 hasNext(), .next() 는 붙어다닌다.
			String key = it.next(); //키
			String value = dic.get(key); //값
			System.out.println("(" + key +","+value+")");
		}
		System.out.println();
		
		//영어 단어를 입력 받고 한글 단어 검색
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			System.out.println("찾고 싶은 단어를 입력하세요: ");
			String eng = scanner.next();
			//해시맵에서 'key' eng의 '값' kor 검색
			String kor = dic.get(eng);
			if(kor==null) System.out.println(eng + "는 없는 단어입니다.");
			else System.out.println(kor);
		}
	}
	
}
