package test01;

import java.util.HashSet;
import java.util.Iterator;

public class Exam_01 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		set.add("���缮");
		set.add("������");
		set.add("������");
		set.add("����ȿ");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {  // ������ �����ϴ�?
			String name = it.next(); // ������ ������, ���������� ��ġ�� �̵��Ѵ�.
			System.out.println(name);
		}
		System.out.println("-----p-------");
		
		String[] name = new String[set.size()];
		set.toArray(name); // �̶� �ڷ����� Ʋ���� ������ �߻��Ѵ�.
		for(int i=0; i < name.length; i++) {
			System.out.println(name);
		}
		
//		String name = "������"; // name�� ȫ�浿���� �ٲپ �ǽ�
//		
//		if(set.contains(name)) {
//			System.out.println(name + "�� ��ϵ� ����Դϴ�.");
//		}else {
//			System.out.println("��ϵ��� ���� ����Դϴ�.");
//		}
//		System.out.println("�������� ũ�� : " + set.size());
//		System.err.println(set.toString());
//		System.out.println(set.remove(name));
//		if(set.isEmpty()) {
//			System.out.println("�����Ͱ� �������� �ʽ��ϴ�.");
//		}else {
//			System.out.println("�����Ͱ� �����մϴ�.");
//		}
//		set.clear();
//		
//		if(set.remove(name)) {
//			System.out.println(name+"���� �����Ͽ����ϴ�.");
//		}else {
//			System.out.println(name+"���� ������ ȸ���Դϴ�.");
//		}
//		
//		System.out.println(set.toString());
//		System.out.println(set.size());
//		
		
	}
}
