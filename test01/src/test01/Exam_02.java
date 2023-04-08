package test01;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class Exam_02 {
	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<String, String>();
		
		ht.put("���缮", "���׸�");
		ht.put("������", "�����");
		ht.put("������", "�߱�����");
		
		
		// ����
		
		
		// �������ι��
		Enumeration<String> enu = ht.keys();
		// HashTable�� �ִ� ��� Ű���� �ݺ��� enu�� �Ѱ��ش�.
		while(enu.hasMoreElements()) {
			// enu�� ����Ű�� ���� �����Ͱ� �ִ���?
			String key = enu.nextElement();
			// enu�� ����Ű�� ���� ���� key�� ����ְ� ���������ͷ� �̵��϶�
			String value = ht.get(key);
			// key�� �ش��ϴ� value���� �����ּ���.
			System.out.println(key + "-->" + value);
		}
		
		// API���� �����ϴ� ���
		Set<String> set = ht.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = ht.get(key);
			System.out.println(key + "-->" + value);
		}
		
		if(ht.containsKey("���缮")) {
			System.out.println("���缮���� ���� ȸ���Դϴ�.");
		}else {
			System.out.println("���缮���� ���� ȸ���� �ƴմϴ�..");
		}
		if(ht.containsKey("��ȣ��")){
			System.out.println("��ȣ������ ���� ȸ���Դϴ�.");
		}else {
			System.out.println("��ȣ������ ���� ȸ���� �ƴմϴ�.");
		}
		
		ht.remove("���缮"); // Ű������ ������ ����
		System.out.println(ht.get("���缮"));
		
		
		String value = ht.get("���缮"); // Ű������value�� ����
		System.out.println("���缮--->" + value);
		
		System.out.println(ht.size());
		ht.put("������", "������"); // ������ �ֱ�, �� ���� Ű���̸� ������ �ȴ�.
		System.out.println(ht.size());
	}
	
}
