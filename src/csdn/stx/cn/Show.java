package csdn.stx.cn;

public class Show {
	//��¼ע�����
	public static void show() {
		System.out.println("\n================��¼ע�����=================");

		System.out.println("\n��������ѡ��Ĺ��ܣ�1.ע��       2.��¼");
	char c=Tools.readMenuSelection1();
		
		if (c == '1') {
			LoginAndRegister.userRegister();
		} else if (c=='2') {
			LoginAndRegister.userLogin();
		}
		
	}
}
