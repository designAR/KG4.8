package test01;

import java.util.HashSet;

public class Exam_01 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();//16���� ������ �������, 0.75�� ���ϰ��
		
		set.add("���缮");		//������ �ֱ� - add()
		set.add("������");
		set.add("������");
		set.add("����ȿ");
		
		String[] name = new String[set.size()];
		set.toArray(name);	//�̶�, �ڷ����� Ʋ���� �����߻�!!
		for(int i=0; i<name.length; ++i) {
			System.out.println(name);
		}
		
		/*
		//�ݺ��� : Iterator, Enumeration 
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {	//������ �����ϴ�?
			String name = it.next();	//������ ������, ���������� ��ġ�� �̵�
			System.out.println(name);
		}
		/*
		set.clear();
		if (set.isEmpty()) {
			System.out.println("�����Ͱ� �������� �ʽ��ϴ�.");
		}else {
			System.out.println("�����Ͱ� �����մϴ�.");
		}
		/*
		System.out.println("clear�� ũ�� : " + set.size());
		/*
		String name = "������";//name�� ȫ�浿���� �ٲپ �ǽ��� ������
		if (set.remove(name)) {
			System.out.println(name+"���� �����Ͽ����ϴ�.");
		}else {
			System.out.println(name+"���� ���� ����Դϴ�.");
		}
		/*
		if (set.contains(name)) {
			System.out.println(name+"�� ��ϵ� ����Դϴ�.");
		}else {
			System.out.println(name+"�� ��ϵ��� ���� ����Դϴ�.");
		}
		
		//System.out.println("��ϵ� �ο� : " + set.size()); //������ ũ�� - size()
		*/
	}
}
