package member;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;
public class MemberProImpl implements MemberPro{
	private Hashtable<String, Member> ht;//key - 이름, value - Member객체
	private Scanner in;
	File file;
	
	
	public MemberProImpl() {
		ht = new Hashtable<>();
		in = new Scanner(System.in);
		File dir = new File("C:\\weekWeb04\\program");
		file = new File(dir, "data.txt");
	}
	
	@Override
	public void input() {
		System.out.print("이름을 입력 : ");
		String name = in.next();
		if (ht.containsKey(name)) {
			System.out.println("동일한 이름의 회원이 있습니다. 다시 입력해 주세요!!");
			input();	//재귀호출 : 메소드가 자기 자신을 호출하는 것!!
		}else {
			System.out.print("전화번호를 입력 : ");
			String tel = in.next();
			Member member = new Member(name, tel);
			ht.put(name, member);
		}
	}

	@Override
	public void view() {
		Enumeration<String> enu = ht.keys();
		while(enu.hasMoreElements()) {
			String key = enu.nextElement();
			Member member = ht.get(key);
			System.out.println(member.getName() + "님의 전화번호 : " + member.getTel());
		}
	}

	@Override
	public void edit() {
		System.out.print("수정할 회원의 이름 : ");
		String name = in.next();
		if (ht.containsKey(name)) {
			Member member = ht.get(name);
			System.out.println("현재 " + name+"님의 전화번호는 " + member.getTel()+"번 입니다.");
			System.out.print("수정하실 전화번호를 입력 : ");
			String tel = in.next();
			member.setTel(tel);
			System.out.println(name+"님의 전화번호를 수정하였습니다.");
		}else {
			System.out.println(name+"님은 저희 회원이 아닙니다.");
		}
	}

	@Override
	public void delete() {
		System.out.print("삭제할 회원의 이름 : ");
		String name = in.next();
		if (ht.containsKey(name)) {
			ht.remove(name);
			System.out.println(name+"님을 삭제하였습니다.");
		}else {
			System.out.println(name+"님은 저희 회원이 아닙니다.");
		}
	}

	@Override
	public void exit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);		
	}

	@Override
	public void save() {
		
		//object입출력
		try {
			File dir = new File("C:\\weekWeb04\\program");
			File file = new File(dir, "bbb.txt");

			FileOutputStream fos = new FileOutputStream(file);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(ht);
			oos.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		// text입출력
//		try {
//			FileWriter fw = new FileWriter(file);
//			BufferedWriter bw = new BufferedWriter(fw);
//			PrintWriter pw = new PrintWriter(bw);
//			Enumeration<String> enu = ht.keys();
//			while(enu.hasMoreElements()) {
//				String key = enu.nextElement();
//				Member member = ht.get(key);
//				pw.println(member.getName() + "@" + member.getTel());
//				pw.flush();
//			}
//			pw.close();
//		}
//		catch(IOException e) {
//			e.printStackTrace();
//		}
		
		
		// byte입출력
//		try {
//			FileOutputStream fos = new FileOutputStream(file);
//			BufferedOutputStream bos = new BufferedOutputStream(fos);
//			DataOutputStream dos = new DataOutputStream(bos);
//			Enumeration<String> enu = ht.keys();
//			while(enu.hasMoreElements()) {
//				String key = enu.nextElement();
//				Member member = ht.get(key);
//				dos.writeUTF(member.getName() + "@" + member.getTel());
//				dos.flush();
//			}
//			dos.close();
//		}catch(IOException e) {
//			e.printStackTrace();
//		}		
	}
	

	@Override
	public void load() {
		ht.clear();
		// Object입출력
		try {
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream dis = new ObjectInputStream(bis);
			Object obj = dis.readObject();
			ht = (Hashtable)obj;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// text입출력
		//ht.clear();
//		try {
//			FileReader fr = new FileReader(file);
//			BufferedReader br = new BufferedReader(fr);
//			while(true) {
//				String str = br.readLine();
//				if (str == null) break;
//				String[] data = str.split("@");
//				Member member = new Member(data[0], data[1]);
//				ht.put(data[0], member);
//			}
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//		System.out.println("파일 업로드 끝!!");
		
		// byte입출력
//		ht.clear();
//		try {
//			FileInputStream fis = new FileInputStream(file);
//			BufferedInputStream bis = new BufferedInputStream(fis);
//			DataInputStream dis = new DataInputStream(bis);
//			while(true) {
//				String str = dis.readUTF();
//				String[] data = str.split("@");
//				Member member = new Member(data[0], data[1]);
//				ht.put(data[0], member);
//			}
//		}catch(EOFException e) {
//			System.out.println("파일 업로드 끝!!");
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
		
	}

}











