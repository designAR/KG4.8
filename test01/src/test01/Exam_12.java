package test01;

import java.io.*;

public class Exam_12 {
	public static void main(String[] args) throws Exception{
		File dir = new File("C:\\weekWeb04\\program");
		File file = new File(dir, "bbb.txt");
		
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		Object obj = ois.readObject();		//��ĳ����
		All ap = (All)obj;					//�ٿ�ĳ����
		System.out.println("ap.a = " + ap.a);
		System.out.println("ap.b = " + ap.b);
		System.out.println("ap.c = " + ap.c);
	}
}
