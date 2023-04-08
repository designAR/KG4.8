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
		System.out.print("�̸��� �Է� : ");
		String name = in.next();
		System.out.print("���������� �Է� : ");
		int kor = in.nextInt();
		System.out.print("���������� �Է� : ");
		int eng = in.nextInt();
		
		SungJuk sungjuk = new SungJuk(name, kor, eng);
		list.add(sungjuk);		
	}
	
	protected void rank() {
		for(SungJuk i : list) {		//������
			i.clearRank();
			for(SungJuk j : list) {				//�츮�� ��� ����� ����
				if (i.getTot() < j.getTot()) {	//�������� �츮�� ����� �������� �۴ٸ�
					i.plusRank();				//�������� �ϳ� �÷��ش�.
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
		System.out.print("������ �л��� �̸� : ");
		String name = in.next();
		SungJuk sj = getSungJuk(name);
		if (sj == null) {
			System.out.println(name+"���� ���� �л��� �ƴմϴ�.");
		}else {
			list.remove(sj);
			System.out.println(name+"���� �����Ͽ����ϴ�.");
		}
	}

	@Override
	public void exit() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
	}

}







