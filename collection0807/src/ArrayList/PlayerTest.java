package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlayerTest {

	public static void main(String[] args) {
		List<Player> players = new ArrayList<Player>();
		players.add(new Player("ȫ�浿",123));
		players.add(new Player("��浿",234));
		players.add(new Player("�̱浿",456));
		players.add(new Player("��浿",789));
		
		Comparator<Player> comparator = new Comparator<Player>() {
			@Override
			public int compare(Player a, Player b) {
				return a.getName().compareTo(b.getName());
				}
			};
			//Comparator �������̽��� ���/����/implements�� �ڽ� Ŭ������ ���� �����
			//sort �޼����� �ι�° �Ķ���ͷ� �͸�(����)�Լ��� ����Ͽ� ���� ������ ������
			Collections.sort(players,(a,b) -> b.getNumber()-a.getNumber());
			
		for(Player i : players) {
			System.out.println("�̸���: "+i.getName());
			System.out.println("������: "+i.getScore());
		}
	}

}
