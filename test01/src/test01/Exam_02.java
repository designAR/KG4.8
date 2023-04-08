package test01;

import java.util.Enumeration;
import java.util.Hashtable;

public class Exam_02 {
	public static void main(String[] args) {
Hashtable<String, String> ht = new Hashtable<>();
		
		ht.put("유재석", "개그맨");
		ht.put("아이유", "여가수");
		ht.put("손흥민", "축구선수");
		ht.put("류현진", "야구선수");
		ht.put("김연경", "배구선수");
		
		//전통적인(예전에사용한) 방식의 데이터 추출
		Enumeration<String> enu = ht.keys();
		//Hashtable에 있는 모든 키값만 반복자 enu에 넘겨준다
		while(enu.hasMoreElements()) {
			//enu가 가르키는 곳에 데이터가 있느냐?
			String key = enu.nextElement();
			//enu가 가르키는 곳의 값을 key로 넘겨주고 다음데이터 이동하라
			String value = ht.get(key);
			//key에 해당하는 value값을 꺼내주세요
			System.out.println(key + " --> " + value);
		}
		/* API에서 권장하는 방식의 데이터 추출
		Set<String> set = ht.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = ht.get(key);
			System.out.println(key + " --> " + value);
		}
		/*
		if (ht.containsKey("유재석")) {//강호동을 넣고 실습하면 저희 회원이 아니라고 나옵니다
			//containsKey() : 키값의 유무 확인,
			//비슷한걸로 contains()와 containsValue()가 있습니다. 이건 value값의 유무를 확인하는
			//메소드이지만, 잘 사용하지 않는 메소드 입니다.
			System.out.println("유재석님은 저희 회원입니다.");
		}else {
			System.out.println("유재석님은 저희 회원이 아닙니다.");
		}
		/*
		ht.remove("유재석");	//키값으로 데이터 삭제
		System.out.println(ht.get("유재석"));
		/*
		String value = ht.get("유재석");	//키값으로 value값을 꺼내기
		System.out.println("유재석 --> " + value);
		/*
		System.out.println("데이터의 크기 : "+ ht.size());
		ht.put("아이유", "여배우");//put() : 데이터 넣기, 단, 같은 키값이면 수정이 된다
		System.out.println("데이터의 크기 : "+ ht.size());
		*/
	}
}

