package test01;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class Exam_02 {
	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<String, String>();
		
		ht.put("유재석", "개그맨");
		ht.put("아이유", "여배우");
		ht.put("류현진", "야구선수");
		
		
		// 문제
		
		
		// 전통적인방식
		Enumeration<String> enu = ht.keys();
		// HashTable에 있는 모든 키값만 반복자 enu에 넘겨준다.
		while(enu.hasMoreElements()) {
			// enu가 가르키는 곳에 데이터가 있느냐?
			String key = enu.nextElement();
			// enu가 가르키는 곳의 값을 key로 념겨주고 다음데이터로 이동하라
			String value = ht.get(key);
			// key에 해당하는 value값을 꺼내주세요.
			System.out.println(key + "-->" + value);
		}
		
		// API에서 권장하는 방식
		Set<String> set = ht.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = ht.get(key);
			System.out.println(key + "-->" + value);
		}
		
		if(ht.containsKey("유재석")) {
			System.out.println("유재석님은 저희 회원입니다.");
		}else {
			System.out.println("유재석님은 저희 회원이 아닙니다..");
		}
		if(ht.containsKey("강호동")){
			System.out.println("강호동님은 저희 회원입니다.");
		}else {
			System.out.println("강호동님은 저희 회원이 아닙니다.");
		}
		
		ht.remove("유재석"); // 키값으로 데이터 삭제
		System.out.println(ht.get("유재석"));
		
		
		String value = ht.get("유재석"); // 키값으로value값 삭제
		System.out.println("유재석--->" + value);
		
		System.out.println(ht.size());
		ht.put("아이유", "여가수"); // 데이터 넣기, 단 같은 키값이면 수정이 된다.
		System.out.println(ht.size());
	}
	
}
