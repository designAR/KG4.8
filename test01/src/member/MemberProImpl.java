package member;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class MemberProImpl implements MemberPro{

	// 데이터 저장
	private Hashtable<String, Member> ht; // key - 이름, value - Member객체
	private Scanner in;
	
	public MemberProImpl() {
		ht = new Hashtable<String, Member>();
		in = new Scanner(System.in);
	}
	
	@Override
	public void input() {
		System.out.print("이름을 입력하세요 : ");
		String name = in.next();
		if(ht.containsKey(name)) {
			System.out.println("중복된 이름이 있습니다!");
			input(); // 재귀함수 : 다시입력해라
		}else {
			System.out.println("전화번호를 입력하세요 : ");
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
			System.out.println(member.getName() + "님의 전화번호 : " + member.getTel());
		}
	}

	@Override
	public void edit() {
		System.out.println("수정할 회원의 이름을 입력해주세요 : ");
		String name = in.next();
		if(ht.containsKey(name)) {
			Member member =  ht.remove(name);
			System.out.println(name + "님의 전화번호는 " + member.getTel() + "번입니다.");
			System.out.println("수정할 전화번호를 입력 : ");
			String tel = in.next();
			member.setTel(tel);
			System.out.println(name+"님의 전화번호를 수정하였습니다.");
		}else {
			System.out.println(name + "님은 존재하지 않는 회원입니다..");
		}
		
	}

	@Override
	public void delete() {
		System.out.println("삭제할 회원의 이름을 입력해주세요 : ");
		String name = in.next();
		if(ht.containsKey(name)) {
			ht.remove(name);
			System.out.println(name + "님을 삭제하였습니다.");
		}else {
			System.out.println(name + "님은 존재하지 않는 회원입니다..");
		}
	}

	@Override
	public void exit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
		
	}
	

}
