package test01;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class All implements Serializable{ // AllŬ������ ����ȭ, ������ȭ ���ִ� �۾�
	int a = 10;
	int b = 20;
	transient int c = 30;
}
public class Exam_11 {
	public static void main(String[] args) throws IOException{
		
		File dir = new File("C:\\weekWeb04\\program");
		File file = new File(dir, "bbb.txt");
		

		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		All ap = new All();
		ap.c = 1000;
		
		oos.writeObject(ap);  // 
		oos.close();
		
	}
}
