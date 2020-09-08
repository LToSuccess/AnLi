package csdn.stx.cn;

import java.util.Scanner;

public class Tools {
	static Scanner scanner = new Scanner(System.in);

	public static String readString() {
		String str = Tools.readKeyBoard(8);
		return str;
	}

	public static String readString2() {
		String str = Tools.readKeyBoard(10000);
		return str;
	}

	private static String readKeyBoard(int limit) {
		String line = " ";
		while (scanner.hasNext()) {
			line = scanner.next();
			if (line.length() < 1 || line.length() > limit) {
				System.out.println("���볤�ȣ�������" + limit + "���������������룺");
				continue;
			}
			break;
		}
		return line;
	}

	public static int readNumber() {
		int n;
		for (;;) {
			String str = Tools.readKeyBoard(4);
			try {
				n = Integer.parseInt(str);
				break;
			} catch (Exception e) {
				System.out.print("��������������������룺");
			}
		}
		return n;
	}

	public static char readMenuSelection() {
		char c;
		for (;;) {
			String str = Tools.readKeyBoard(1);
			c = str.charAt(0);
			if (c != '1' && c != '2' && c != '3' && c != '4' && c != '5' && c != '6' && c != '7') {
				System.out.println("����������������룺");
			} else
				break;
		}
		return c;

	}
	public static char readMenuSelection1() {
		char c;
		for (;;) {
			String str = Tools.readKeyBoard(1);
			c = str.charAt(0);
			if (c != '1' && c != '2' ) {
				System.out.println("����������������룺");
			} else
				break;
		}
		return c;

	}


	public static char readConfirmSelection() {
		char c;
		for (;;) {
			String str = Tools.readKeyBoard(1).toUpperCase();
			c = str.charAt(0);
			if (c == 'Y' || c == 'N') {
				break;
			} else {
				System.out.print("ѡ��������������룺");
			}
		}
		return c;
	}

}
