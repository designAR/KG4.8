package sungjuk;

import java.util.Scanner;

public class SungMain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		SungPro pro = new SungProImpl();
		
		while(true) {
			System.out.print("1.�Է� 2.��� 3.���� 4.���� 5.���� : ");
			int select = in.nextInt();
			switch(select) {
			case 1 : pro.input(); break;	
			case 2 : pro.view(); break;	
			case 3 : pro.edit(); break;	
			case 4 : pro.delete(); break;	
			case 5 : pro.exit(); break;	
			default : System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���!!");
			}
		}
	}
}