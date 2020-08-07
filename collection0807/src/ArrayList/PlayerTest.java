package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlayerTest {

	public static void main(String[] args) {
		List<Player> players = new ArrayList<Player>();
		players.add(new Player("홍길동",123));
		players.add(new Player("김길동",234));
		players.add(new Player("이길동",456));
		players.add(new Player("고길동",789));
		
		Comparator<Player> comparator = new Comparator<Player>() {
			@Override
			public int compare(Player a, Player b) {
				return a.getName().compareTo(b.getName());
				}
			};
			//Comparator 인터페이스를 상속/구현/implements한 자식 클래스를 만들어서 사용함
			//sort 메서드의 두번째 파라미터로 익명(람다)함수를 사용하여 정렬 기준을 선택함
			Collections.sort(players,(a,b) -> b.getNumber()-a.getNumber());
			
		for(Player i : players) {
			System.out.println("이름은: "+i.getName());
			System.out.println("점수는: "+i.getScore());
		}
	}

}
