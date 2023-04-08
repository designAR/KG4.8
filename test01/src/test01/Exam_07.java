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
		
		//dos.flush();  //버퍼메모리 비워라
		dos.close();	//버퍼메모리를 비우고 해당객체를 닫아라
		//버퍼메모리를 비우지 않으면, 파일에 써지지 않는다.
	}
}



