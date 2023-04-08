package test01;

import java.util.Enumeration;
import java.util.Hashtable;

public class Exam_02 {
	public static void main(String[] args) {
Hashtable<String, String> ht = new Hashtable<>();
		
		ht.put("���缮", "���׸�");
		ht.put("������", "������");
		ht.put("�����", "�౸����");
		ht.put("������", "�߱�����");
		ht.put("�迬��", "�豸����");
		
		//��������(�����������) ����� ������ ����
		Enumeration<String> enu = ht.keys();
		//Hashtable�� �ִ� ��� Ű���� �ݺ��� enu�� �Ѱ��ش�
		while(enu.hasMoreElements()) {
			//enu�� ����Ű�� ���� �����Ͱ� �ִ���?
			String key = enu.nextElement();
			//enu�� ����Ű�� ���� ���� key�� �Ѱ��ְ� ���������� �̵��϶�
			String value = ht.get(key);
			//key�� �ش��ϴ� value���� �����ּ���
			System.out.println(key + " --> " + value);
		}
		/* API���� �����ϴ� ����� ������ ����
		Set<String> set = ht.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = ht.get(key);
			System.out.println(key + " --> " + value);
		}
		/*
		if (ht.containsKey("���缮")) {//��ȣ���� �ְ� �ǽ��ϸ� ���� ȸ���� �ƴ϶�� ���ɴϴ�
			//containsKey() : Ű���� ���� Ȯ��,
			//����Ѱɷ� contains()�� containsValue()�� �ֽ��ϴ�. �̰� value���� ������ Ȯ���ϴ�
			//�޼ҵ�������, �� ������� �ʴ� �޼ҵ� �Դϴ�.
			System.out.println("���缮���� ���� ȸ���Դϴ�.");
		}else {
			System.out.println("���缮���� ���� ȸ���� �ƴմϴ�.");
		}
		/*
		ht.remove("���缮");	//Ű������ ������ ����
		System.out.println(ht.get("���缮"));
		/*
		String value = ht.get("���缮");	//Ű������ value���� ������
		System.out.println("���缮 --> " + value);
		/*
		System.out.println("�������� ũ�� : "+ ht.size());
		ht.put("������", "�����");//put() : ������ �ֱ�, ��, ���� Ű���̸� ������ �ȴ�
		System.out.println("�������� ũ�� : "+ ht.size());
		*/
	}
}

