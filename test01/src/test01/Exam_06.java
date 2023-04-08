package test01;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Exam_06 {
	public static void main(String[] args) throws IOException{
		File dir = new File("C:\\weekWeb04\\program");
		File file = new File(dir, "aaa.txt");
		
		FileInputStream fis = new FileInputStream(file);
		while(true) {
			int res = fis.read();	//파일에서 한글자씩 읽어 온다
			if (res < 0) break;	//1byte에서의 EOF값은 -1입니ek.
			System.out.print((char)res);
		}
				
	}
}
