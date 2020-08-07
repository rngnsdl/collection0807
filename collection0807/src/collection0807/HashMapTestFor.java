package collection0807;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapTestFor {

	public static void main(String[] args) {
		//���� �ܾ�� �ѱ� �ܾ��� ���� �����ϴ� HashMap �÷��� ����
		HashMap<String,String>dic = new HashMap<String,String>();	
		//dic<key(���ڿ�), value(���ڿ�)>HashMap ����	
		//3���� (key,value) ���� dic�� ����
		dic.put("baby", "�Ʊ�"); //key�� baby, value �� �Ʊ�
		dic.put("love", "���");
		dic.put("apple", "���");
		//dic �ؽøʿ� �ִ� ��� (key,value) �� ���
		//advanced for���� ����� ���
		for(String i: dic.keySet()) System.out.println("Ű����: "+i+" ����: "+dic.get(i));
		
		
		
		//���� �ܾ �Է� �ް� �ѱ� �ܾ� �˻�
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			System.out.println("ã�� ���� �ܾ �Է��ϼ���: ");
			String eng = scanner.next();
			//�ؽøʿ��� 'key' eng�� '��' kor �˻�
			String kor = dic.get(eng);
			if(kor==null) System.out.println(eng + "�� ���� �ܾ��Դϴ�.");
			else System.out.println(kor);
		}
	}
	
}
