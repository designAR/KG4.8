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
			int res = fis.read();	//���Ͽ��� �ѱ��ھ� �о� �´�
			if (res < 0) break;	//1byte������ EOF���� -1�Դ�ek.
			System.out.print((char)res);
		}
				
	}
}
