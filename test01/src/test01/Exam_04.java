package test01;

import java.io.File;
import java.io.IOException;

public class Exam_04 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("D:\\weekWeb04\\study\\test01\\aaa.txt");
		// \다음은 특수문자가 오는데, \자체를 사용하고자 한다면 \\ 이렇게 2번 써준다
		File f2 = new File("D:\\weekWeb04\\study\\test01", "aaa.txt");
		File dir = new File("D:\\weekWeb04\\study\\test01");
		File f3 = new File(dir, "aaa.txt");
		//f1, f2, f3은 모두 같은 곳(추상경로명)을 가르키는 객체입니다.
		//객체는 반드시 파일명만 가지고 만드는것이 아니라 경로만 가지는 객체도 가능합니다.
		
		if (f3.exists()) {
			System.out.println("해당파일이 존재!!");
		}else {
			System.out.println("해당파일 존재하지 않음");
		}
		
		/*
		f3.createNewFile();//IOException 발생시킨다
		//해당하는 위치에 파일이 없으면 만들고 true를 반환, 있으면 false를 반환
		File imsi = File.createTempFile("temp", ".txt", dir);
		//임시파일을 만들어 준다. 시작은 temp로 시작해서 .txt로 끝나는...dir이 가르키는 곳에 만들어 준다
		imsi.deleteOnExit();//프로그램 종료시 해당 파일을 삭제한다.
		f3.delete();//f3이 가르키는 곳의 파일을 바로 삭제!!
		try {
			Thread.sleep(5000);
		}catch(Exception e) {}
		*/
	}
}




