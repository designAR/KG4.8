package sungjuk;

import java.util.Scanner;

public class SungMain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		SungPro pro = new SungProImpl();
		
		while(true) {
			System.out.print("1.입력 2.출력 3.수정 4.삭제 5.종료 : ");
			int select = in.nextInt();
			switch(select) {
			case 1 : pro.input(); break;	
			case 2 : pro.view(); break;	
			case 3 : pro.edit(); break;	
			case 4 : pro.delete(); break;	
			case 5 : pro.exit(); break;	
			default : System.out.println("잘못입력하셨습니다. 다시 입력해 주세요!!");
			}
		}
	}
}
