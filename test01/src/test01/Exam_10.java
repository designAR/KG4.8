package test01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exam_10 {
	public static void main(String[] args) throws IOException{
		File dir = new File("C:\\weekWeb04\\program");
		File file = new File(dir, "ccc.txt");
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String str = br.readLine();
			if(str == null)break;
			System.out.println(str);
		}
	}
}
