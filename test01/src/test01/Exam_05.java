package test01;

import java.io.*;

public class Exam_05 {
	public static void main(String[] args) throws IOException{
		File dir = new File("C:\\weekWeb04\\program");
		File file = new File(dir, "aaa.txt");
		
		//byte��� : �ϵ��ũ�� usb�޸𸮵� ������ ������ġ�� byte ���·� ���� ���ڴ�
				FileOutputStream fos = new FileOutputStream(file);
				
				fos.write(65);
				fos.write('B');
				String msg = "hello, java!!";
				byte[] by = msg.getBytes();
				fos.write(by);
				
			}
	
}
