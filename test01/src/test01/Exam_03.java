package test01;

import java.util.ArrayList;

public class Exam_03 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("유재석");
		list.add("김종국");
		list.add("이광수");
		list.add("전소민");
		list.add("송지효");
		
		list.add(1,"하하");
		
		// 삭제는 index나 저장된 값으로 삭제가 가능하다.
		list.remove(2);
		list.remove("송지효");
		
		// 확장for문
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
		
		// list는 순서가 있는 자료형!
		for(int i = 0; i < list.size(); i++) {
			String name = list.get(i);
			System.out.println(name);
		}
		*/
	}
}
