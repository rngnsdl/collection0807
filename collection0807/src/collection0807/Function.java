package collection0807;

import java.util.ArrayList;
import java.util.List;

public class Function {
	
	public static void main(String[] args) {
		
		/*1�� ��ü(first citizen)
		 * 		�Ʒ��� 1�� ��ü�� ����
		 * 		1.������ ���尡��
		 *		2. �Լ��� �Ķ���ͷ� ���ް��� 
		 *		3. �Լ����� return ����
		 *���� �Լ��� �ϱ� ��ü���
		 *������ �Լ� ���尡��
		 *�Լ��� �Ķ���ͷ� �Լ��� ���ް���
		 *�Լ����� �Լ��� ��ȯ������
		 *�ڹٿ��� �Լ��� �� �����ؼ� �Լ��� ���Ͱ��� ��밡����
		 *�׷��� ���ٴ� �̸����� �Լ��̹Ƿ�
		 *�Լ��� �Ķ���ͷ� ���ް���
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
			System.out.println("�Ʒ��� ���� �������� ���ڸ� �߰��ϴ°��� ����");
			System.out.println("2���� ��� " + i*2);
			System.out.println("3���� ��� " + i*3);
			System.out.println("4���� ��� " + i*4);
			
		});
		a1.removeIf( i -> (i%2 ==0));
		System.out.println(a1);
	}
	
}
