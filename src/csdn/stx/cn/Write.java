package csdn.stx.cn;
//�ϴ�����
public class Write {
public static void write() {
	System.out.println("���������±�ţ�(����������)");
	int i = Tools.readNumber();
	System.out.println("���������±��⣺(������8���� )");
	String head = Tools.readString();
	System.out.println("�������������ݣ�( 10000������)");
	String title1 = Tools.readString2();
	System.out.println("�������������ڣ�");
	String date = Tools.readString2();
	System.out.println("������ȷ���ϴ���ƪ�����𣺣�1��ȷ��   ��2��ȡ��");
	char c = Tools.readMenuSelection1();
	if (c == '1') {
		Title t1 = new Title(i, head, title1, date);
		Leave.title.add(t1);
		System.out.println("�������ϴ��ɹ�������");
	} else if (c == '2') {
		System.out.println("����ȡ���ϴ��������ʹ�ã���");
	}
}
public  static void write(int num) {
	System.out.println("���������±��⣺(������8���� )");
	String head = Tools.readString();
	System.out.println("�������������ݣ�( 10000������)");
	String title1 = Tools.readString2();
	System.out.println("�������������ڣ�");
	String date = Tools.readString2();
	System.out.println("������ȷ���ϴ���ƪ�����𣺣�1��ȷ��   ��2��ȡ��");
	char c = Tools.readMenuSelection1();
	if (c == '1') {
		Title t1 = new Title(num, head, title1, date);
		Leave.title.add(t1);
		System.out.println("�������ϴ��ɹ�������");
	} else if (c == '2') {
		System.out.println("����ȡ���ϴ��������ʹ�ã���");
	}
}  
}
