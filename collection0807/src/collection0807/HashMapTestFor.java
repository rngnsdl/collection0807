package collection0807;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapTestFor {

	public static void main(String[] args) {
		//영어 단어와 한글 단어의 쌍을 저장하는 HashMap 컬렉션 생성
		HashMap<String,String>dic = new HashMap<String,String>();	
		//dic<key(문자열), value(문자열)>HashMap 생성	
		//3개의 (key,value) 쌍을 dic에 저장
		dic.put("baby", "아기"); //key는 baby, value 는 아기
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		//dic 해시맵에 있는 모든 (key,value) 쌍 출력
		//advanced for문을 사용할 경우
		for(String i: dic.keySet()) System.out.println("키값은: "+i+" 값은: "+dic.get(i));
		
		
		
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
