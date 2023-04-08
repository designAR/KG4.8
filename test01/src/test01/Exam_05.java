package test01;

import java.io.*;

public class Exam_05 {
	public static void main(String[] args) throws IOException{
		File dir = new File("C:\\weekWeb04\\program");
		File file = new File(dir, "aaa.txt");
		
		//byte출력 : 하드디스크나 usb메모리등 물리적 저장장치에 byte 형태로 값을 쓰겠다
				FileOutputStream fos = new FileOutputStream(file);
				
				fos.write(65);
				fos.write('B');
				String msg = "hello, java!!";
				byte[] by = msg.getBytes();
				fos.write(by);
				
			}
	
}
