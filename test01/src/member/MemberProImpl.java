package member;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class MemberProImpl implements MemberPro{

	// ������ ����
	private Hashtable<String, Member> ht; // key - �̸�, value - Member��ü
	private Scanner in;
	
	public MemberProImpl() {
		ht = new Hashtable<String, Member>();
		in = new Scanner(System.in);
	}
	
	@Override
	public void input() {
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = in.next();
		if(ht.containsKey(name)) {
			System.out.println("�ߺ��� �̸��� �ֽ��ϴ�!");
			input(); // ����Լ� : �ٽ��Է��ض�
		}else {
			System.out.println("��ȭ��ȣ�� �Է��ϼ��� : ");
			String tel = in.next();
			Member member = new Member(name, tel);
			ht.put(name, member);
		}
	}

	@Override
	public void view() {
		Enumeration<String> enu = ht.keys();
		while(enu.hasMoreElements()) {
			String key = enu.nextElement();
			Member member = ht.get(key);
			System.out.println(member.getName() + "���� ��ȭ��ȣ : " + member.getTel());
		}
	}

	@Override
	public void edit() {
		System.out.println("������ ȸ���� �̸��� �Է����ּ��� : ");
		String name = in.next();
		if(ht.containsKey(name)) {
			Member member =  ht.remove(name);
			System.out.println(name + "���� ��ȭ��ȣ�� " + member.getTel() + "���Դϴ�.");
			System.out.println("������ ��ȭ��ȣ�� �Է� : ");
			String tel = in.next();
			member.setTel(tel);
			System.out.println(name+"���� ��ȭ��ȣ�� �����Ͽ����ϴ�.");
		}else {
			System.out.println(name + "���� �������� �ʴ� ȸ���Դϴ�..");
		}
		
	}

	@Override
	public void delete() {
		System.out.println("������ ȸ���� �̸��� �Է����ּ��� : ");
		String name = in.next();
		if(ht.containsKey(name)) {
			ht.remove(name);
			System.out.println(name + "���� �����Ͽ����ϴ�.");
		}else {
			System.out.println(name + "���� �������� �ʴ� ȸ���Դϴ�..");
		}
	}

	@Override
	public void exit() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
		
	}
	

}
