package test01;

import java.util.ArrayList;

public class Exam_03 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("���缮");
		list.add("������");
		list.add("�̱���");
		list.add("���ҹ�");
		list.add("����ȿ");
		
		list.add(1,"����");
		
		// ������ index�� ����� ������ ������ �����ϴ�.
		list.remove(2);
		list.remove("����ȿ");
		
		// Ȯ��for��
		for(String name : list) {
			System.out.println(name);
		}
		
		/*
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.println(name);
		}
		
		System.out.println(list.toString());
		System.out.println();
		
		// list�� ������ �ִ� �ڷ���!
		for(int i = 0; i < list.size(); i++) {
			String name = list.get(i);
			System.out.println(name);
		}
		*/
	}
}
