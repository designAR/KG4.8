package test01;

import java.io.File;
import java.io.IOException;

public class Exam_04 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("D:\\weekWeb04\\study\\test01\\aaa.txt");
		// \������ Ư�����ڰ� ���µ�, \��ü�� ����ϰ��� �Ѵٸ� \\ �̷��� 2�� ���ش�
		File f2 = new File("D:\\weekWeb04\\study\\test01", "aaa.txt");
		File dir = new File("D:\\weekWeb04\\study\\test01");
		File f3 = new File(dir, "aaa.txt");
		//f1, f2, f3�� ��� ���� ��(�߻��θ�)�� ����Ű�� ��ü�Դϴ�.
		//��ü�� �ݵ�� ���ϸ� ������ ����°��� �ƴ϶� ��θ� ������ ��ü�� �����մϴ�.
		
		if (f3.exists()) {
			System.out.println("�ش������� ����!!");
		}else {
			System.out.println("�ش����� �������� ����");
		}
		
		/*
		f3.createNewFile();//IOException �߻���Ų��
		//�ش��ϴ� ��ġ�� ������ ������ ����� true�� ��ȯ, ������ false�� ��ȯ
		File imsi = File.createTempFile("temp", ".txt", dir);
		//�ӽ������� ����� �ش�. ������ temp�� �����ؼ� .txt�� ������...dir�� ����Ű�� ���� ����� �ش�
		imsi.deleteOnExit();//���α׷� ����� �ش� ������ �����Ѵ�.
		f3.delete();//f3�� ����Ű�� ���� ������ �ٷ� ����!!
		try {
			Thread.sleep(5000);
		}catch(Exception e) {}
		*/
	}
}




