package csdn.stx.cn;

import java.util.Scanner;

public class Boke {

	static Scanner scanner = new Scanner(System.in);

	public static void check() {

		System.out.println("================�����б�=================\n");

		for (Title t : Leave.title) {
			System.out.println(t.num + "," + t.head + "\n" + "�������ݣ�" + t.body + "\n" + "�������ڣ�" + t.date);
		}
		System.out.println("\n========================================\n");
		System.out.println("��ѡ�������Ҫ���еĲ�����1.������ҳ     2.��������     ");
		char c = Tools.readMenuSelection1();

		if (c == '1') {
			Show1.show1();
		} else if (c == '2') {
			write();
		}
	}

	public static void write() {

		System.out.println("================�뿪ʼ�ϴ�����=================\n");
		
		if(Leave.title.size()==0) {
			Write.write();
		}else {
			System.out.println("���������±�ţ�(����������)");
			int i = Tools.readNumber();
			for(Title t:Leave.title) {
				if(t.num==i) {
					System.out.println("��ŷ����ظ������������룺");
					write();
				
				}else {
					Write.write(i);
					break;
				}
			}
		}
		

		System.out.println("��ѡ�������Ҫ���еĲ�����1.������ҳ     2.��������  ");
		char c1 = Tools.readMenuSelection1();

		if (c1 == '1') {
			Show1.show1();
		} else if (c1 == '2') {
			write();
		}
	}

	public static void rem() {
		System.out.println("================����ɾ��=================\n");
		System.out.println("������Ҫɾ���Ĳ��ı�ţ�");
		int num = Tools.readNumber();
		for (Title t : Leave.title) {
			if (t.num == num) {
				System.out.println("������ȷ��ɾ����ƪ�����𣺣�1��ȷ��   ��2��ȡ��");
				char c1 = Tools.readMenuSelection1();

				if (c1 == '1') {
					Leave.title.remove(t);
					System.out.println("ɾ���ɹ�");
					break;
				} else if (c1 == '2') {
					System.out.println("ȡ��ɾ���ɹ��������ʹ�ã���");
				}

			}
		}
		System.out.println("��ѡ�������Ҫ���еĲ�����1.������ҳ     2.����ɾ��  ");
		char c = Tools.readMenuSelection1();

		if (c == '1') {
			Show1.show1();
		} else if (c == '2') {
			write();
		}
	}

	public static void alter() {
		System.out.println("================�����޸�=================\n");
		System.out.println("������Ҫ�޸ĵĲ��ı�ţ�");
		int num = Tools.readNumber();
		System.out.println("�������µı��⣺");
		String head = Tools.readString();
		System.out.println("�������µ����£�");
		String title = Tools.readString();
		System.out.println("�������µ����ڣ�");
		String date = Tools.readString();
		int n = 0;
		System.out.println("������ȷ���޸ĸ�ƪ�����𣺣�1��ȷ��   ��2��ȡ��");
		char c = Tools.readMenuSelection1();

		if (c == '1') {
			for (Title t : Leave.title) {

				if (num == t.num) {
					Leave.title.set(n, new Title(num, head, title, date));
					System.out.println("�޸ĳɹ�����");
					break;
				}
				n++;
			}
		} else if (c == '2') {
			System.out.println("ȡ���޸ĳɹ��������ʹ�ã���");
		}
		

		System.out.println("��ѡ�������Ҫ���еĲ�����1.������ҳ     2.�����༭  ");
		char c2 = Tools.readMenuSelection1();

		if (c2 == '1') {
			Show1.show1();
		} else if (c == '2') {
			write();
		}

	}

}
