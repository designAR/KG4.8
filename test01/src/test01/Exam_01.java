package test01;

import java.util.HashSet;
import java.util.Iterator;

public class Exam_01 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		set.add("유재석");
		set.add("지석진");
		set.add("김종국");
		set.add("송지효");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {  // 데이터 존재하니?
			String name = it.next(); // 데이터 꺼내고, 다음데이터 위치로 이동한다.
			System.out.println(name);
		}
		System.out.println("-----p-------");
		
		String[] name = new String[set.size()];
		set.toArray(name); // 이때 자료형이 틀리면 오류가 발생한다.
		for(int i=0; i < name.length; i++) {
			System.out.println(name);
		}
		
//		String name = "지석진"; // name을 홍길동으로 바꾸어서 실습
//		
//		if(set.contains(name)) {
//			System.out.println(name + "은 등록된 사람입니다.");
//		}else {
//			System.out.println("등록되지 않은 사람입니다.");
//		}
//		System.out.println("데이터의 크기 : " + set.size());
//		System.err.println(set.toString());
//		System.out.println(set.remove(name));
//		if(set.isEmpty()) {
//			System.out.println("데이터가 존재하지 않습니다.");
//		}else {
//			System.out.println("데이터가 존재합니다.");
//		}
//		set.clear();
//		
//		if(set.remove(name)) {
//			System.out.println(name+"님을 삭제하였습니다.");
//		}else {
//			System.out.println(name+"님은 삭제된 회원입니다.");
//		}
//		
//		System.out.println(set.toString());
//		System.out.println(set.size());
//		
		
	}
}
