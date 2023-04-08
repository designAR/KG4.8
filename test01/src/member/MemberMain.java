package member;

import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		MemberPro pro = new MemberProImpl(); // 다형성의 업캐스팅
		
		while(true) {
			System.out.println("1.입력 2.출력 3.수정 4.삭제 5.종료");
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
				pro.exit();
				break;
			default:
				System.out.println("잘못입력하셨습니다. 다시입력해주세요!");
			}
			
		}
	}
}
