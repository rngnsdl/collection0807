package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();
		//Ű����κ��� 4���� �̸��� �Է¹޾� ArrayList�� �߰�
		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i<4; i++) {
			System.out.println("�̸��� �Է��ϼ���: ");
			String s = sc.next(); //Ű����κ��� �̸��� �Է�
			a.add(s); //ArrayList �÷��ǿ� ����
		}
		
		//ArrayList�� ��� �ִ� ��� �̸� ���
		for(int i = 0; i<a.size(); i++) {
			String name = a.get(i); //ArrayList�� i��° ���ڿ��� �����´�.
			System.out.println(name + " ");
		}
		//���� �� �̸� ���
		int longetIndex = 0; //���� ���� �� �̸��� ��� �ִ� ArrayList ���� �ε���
		for(int i = 1; i<a.size(); i++) {
			if(a.get(longetIndex).length() < a.get(i).length()) // �̸� ���� ��
				longetIndex = i; //i��° �̸��� �� �� �̸��̹Ƿ� ���� �����͸� ������
		}
		System.out.println("\n ���� �� �̸��� : "+a.get(longetIndex));
		sc.close(); //��ĳ�� ����
	}

}
