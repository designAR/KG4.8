package member;

import java.io.IOException;
import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		
		MemberPro pro = new MemberProImpl(); // �������� ��ĳ����
		
		while(true) {
			System.out.print("1.�Է� 2.��� 3.���� 4.���� 5.���� 6.�ε� 7.���� : ");
			int select = scan.nextInt();
			switch (select) {
			case 1:
				pro.input();
				break;
			case 2:
				pro.view();
				break;
			case 3:
				pro.edit();
				break;
			case 4:
				pro.delete();
				break;
			case 5:
				pro.save();
				
				break;
			case 6:
				pro.load();
				break;
			case 7:
				pro.exit();
			
				break;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ��Է����ּ���!");
			}
			
		}
	}
}
