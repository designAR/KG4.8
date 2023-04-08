package test01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exam_09 {
	public static void main(String[] args) throws IOException{
		File dir = new File("C:\\weekWeb04\\program");
		File file = new File(dir, "ccc.txt");
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		pw.println("안녕하세요!");
		pw.println("국어점수 : " + 80);
		pw.close();
	}
}
