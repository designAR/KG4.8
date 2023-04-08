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
	private Hashtable<String, Member> ht;//key - �̸�, value - Member��ü
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
		System.out.print("�̸��� �Է� : ");
		String name = in.next();
		if (ht.containsKey(name)) {
			System.out.println("������ �̸��� ȸ���� �ֽ��ϴ�. �ٽ� �Է��� �ּ���!!");
			input();	//���ȣ�� : �޼ҵ尡 �ڱ� �ڽ��� ȣ���ϴ� ��!!
		}else {
			System.out.print("��ȭ��ȣ�� �Է� : ");
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
			System.out.println(member.getName() + "���� ��ȭ��ȣ : " + member.getTel());
		}
	}

	@Override
	public void edit() {
		System.out.print("������ ȸ���� �̸� : ");
		String name = in.next();
		if (ht.containsKey(name)) {
			Member member = ht.get(name);
			System.out.println("���� " + name+"���� ��ȭ��ȣ�� " + member.getTel()+"�� �Դϴ�.");
			System.out.print("�����Ͻ� ��ȭ��ȣ�� �Է� : ");
			String tel = in.next();
			member.setTel(tel);
			System.out.println(name+"���� ��ȭ��ȣ�� �����Ͽ����ϴ�.");
		}else {
			System.out.println(name+"���� ���� ȸ���� �ƴմϴ�.");
		}
	}

	@Override
	public void delete() {
		System.out.print("������ ȸ���� �̸� : ");
		String name = in.next();
		if (ht.containsKey(name)) {
			ht.remove(name);
			System.out.println(name+"���� �����Ͽ����ϴ�.");
		}else {
			System.out.println(name+"���� ���� ȸ���� �ƴմϴ�.");
		}
	}

	@Override
	public void exit() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);		
	}

	@Override
	public void save() {
		
		//object�����
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
		
		// text�����
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
		
		
		// byte�����
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
		// Object�����
		try {
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream dis = new ObjectInputStream(bis);
			Object obj = dis.readObject();
			ht = (Hashtable)obj;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// text�����
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
//		System.out.println("���� ���ε� ��!!");
		
		// byte�����
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
//			System.out.println("���� ���ε� ��!!");
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
		
	}

}











