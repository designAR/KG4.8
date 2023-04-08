package sungjuk;

import java.util.*;

public class SungProImpl implements SungPro{
	private List<SungJuk> list;
	private Scanner in;
	
	public SungProImpl() {
		list = new ArrayList<>();
		in = new Scanner(System.in);
	}
	
	@Override
	public void input() {
		System.out.print("이름을 입력 : ");
		String name = in.next();
		System.out.print("국어점수를 입력 : ");
		int kor = in.nextInt();
		System.out.print("영어점수를 입력 : ");
		int eng = in.nextInt();
		
		SungJuk sungjuk = new SungJuk(name, kor, eng);
		list.add(sungjuk);		
	}
	
	protected void rank() {
		for(SungJuk i : list) {		//내성적
			i.clearRank();
			for(SungJuk j : list) {				//우리반 모든 사람의 성적
				if (i.getTot() < j.getTot()) {	//내총점과 우리반 사람의 총점보다 작다면
					i.plusRank();				//내순위를 하나 올려준다.
				}
			}
		}
	}

	@Override
	public void view() {
		rank();
		for (SungJuk sj : list) {
			sj.disp();
		}		
	}

	@Override
	public void edit() {
		// TODO Auto-generated method stub
		
	}
	
	protected SungJuk getSungJuk(String name) {
		for(SungJuk sj : list) {
			if (sj.getName().equals(name)) {
				return sj;
			}
		}
		return null;
	}
	

	@Override
	public void delete() {
		System.out.print("삭제할 학생의 이름 : ");
		String name = in.next();
		SungJuk sj = getSungJuk(name);
		if (sj == null) {
			System.out.println(name+"님은 저희 학생이 아닙니다.");
		}else {
			list.remove(sj);
			System.out.println(name+"님을 삭제하였습니다.");
		}
	}

	@Override
	public void exit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}

}







