package test01;

import java.io.*;

public class Exam_07 {
	public static void main(String[] args) throws IOException{
		File dir = new File("C:\\weekWeb04\\program");
		File file = new File(dir, "bbb.txt");
		

		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		
		int a = 10;
		double b = 10.23;
		String c = "hello";
		
		dos.writeInt(a);
		dos.writeDouble(b);
		dos.writeUTF(c);
		
		//dos.flush();  //���۸޸� �����
		dos.close();	//���۸޸𸮸� ���� �ش簴ü�� �ݾƶ�
		//���۸޸𸮸� ����� ������, ���Ͽ� ������ �ʴ´�.
	}
}



