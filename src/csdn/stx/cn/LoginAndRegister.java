package csdn.stx.cn;

public class LoginAndRegister {
	// �û�ע��
	public static void userRegister() {

		System.out.println("================ע�����=================");
		System.out.println("������8λ�����ڵ��û�����");
		String usename = Tools.readString();
		boolean state = false;
		for (User u : Leave.user) {
			if (u.getUserName().equals(usename)) {
				state = true;
				break;
			}
		}
		if (state) {
			System.out.println("�û����Ѿ����ڣ����������룺");
			userRegister();
		} else {

			System.out.println("������8λ�����ڵ����룺");
			String password = Tools.readString();
			User use = new User(usename, password);
			Leave.user.add(use);

			System.out.println("��ϲ��ע��ɹ�,���Խ��е�¼��");

			userLogin();

		}

	}

//�û���¼
	public static void userLogin() {

		int i = 0;
		System.out.println("================�û���¼=================");
		System.out.println("�������û�����");
		String usename = Tools.readString();
		System.out.println("���������룺");
		String password = Tools.readString();
		for (User u : Leave.user) {
			if (u.getUserName().equals(usename) && u.getPassWord().equals(password)) {

				i = 1;
				break;
			} else if (u.getUserName().equals(usename) && !u.getPassWord().equals(password)) {
				i = 2;
				break;
			} else  {
				i = 3;
				break;
			}
		}
		switch (i) {
		case 1:
			System.out.println("��ϲ����¼�ɹ�����");
			System.out.println("��ǰ�û�:" + usename);
			// ��¼�ɹ�����CSDN��ҳ
			Show1.show1();
			break;
		case 2:
			System.out.println("��������û�����������ִ��������µ�¼������");
			userLogin();
			break;
		default:
			System.out.println("���˻������ڣ�����ע�ᣡ����");
			userRegister();

			break;

		}

	}
}
