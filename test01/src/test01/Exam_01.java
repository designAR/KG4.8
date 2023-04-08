package test01;

import java.util.HashSet;

public class Exam_01 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();//16개의 데이터 저장장소, 0.75의 부하계수
		
		set.add("유재석");		//데이터 넣기 - add()
		set.add("지석진");
		set.add("김종국");
		set.add("송지효");
		
		String[] name = new String[set.size()];
		set.toArray(name);	//이때, 자료형이 틀리면 오류발생!!
		for(int i=0; i<name.length; ++i) {
			System.out.println(name);
		}
		
		/*
		//반복자 : Iterator, Enumeration 
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {	//데이터 존재하니?
			String name = it.next();	//데이터 꺼내고, 다음데이터 위치로 이동
			System.out.println(name);
		}
		/*
		set.clear();
		if (set.isEmpty()) {
			System.out.println("데이터가 존재하지 않습니다.");
		}else {
			System.out.println("데이터가 존재합니다.");
		}
		/*
		System.out.println("clear후 크기 : " + set.size());
		/*
		String name = "지석진";//name을 홍길동으로 바꾸어서 실습해 보세요
		if (set.remove(name)) {
			System.out.println(name+"님을 삭제하였습니다.");
		}else {
			System.out.println(name+"님은 없는 사람입니다.");
		}
		/*
		if (set.contains(name)) {
			System.out.println(name+"는 등록된 사람입니다.");
		}else {
			System.out.println(name+"는 등록되지 않은 사람입니다.");
		}
		
		//System.out.println("등록된 인원 : " + set.size()); //데이터 크기 - size()
		*/
	}
}
