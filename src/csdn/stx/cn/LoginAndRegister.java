package csdn.stx.cn;

public class LoginAndRegister {
	// 用户注册
	public static void userRegister() {

		System.out.println("================注册界面=================");
		System.out.println("请输入8位数以内的用户名：");
		String usename = Tools.readString();
		boolean state = false;
		for (User u : Leave.user) {
			if (u.getUserName().equals(usename)) {
				state = true;
				break;
			}
		}
		if (state) {
			System.out.println("用户名已经存在，请重新输入：");
			userRegister();
		} else {

			System.out.println("请输入8位数以内的密码：");
			String password = Tools.readString();
			User use = new User(usename, password);
			Leave.user.add(use);

			System.out.println("恭喜您注册成功,可以进行登录了");

			userLogin();

		}

	}

//用户登录
	public static void userLogin() {

		int i = 0;
		System.out.println("================用户登录=================");
		System.out.println("请输入用户名：");
		String usename = Tools.readString();
		System.out.println("请输入密码：");
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
			System.out.println("恭喜您登录成功！！");
			System.out.println("当前用户:" + usename);
			// 登录成功进入CSDN主页
			Show1.show1();
			break;
		case 2:
			System.out.println("您输入的用户名或密码出现错误，请重新登录！！！");
			userLogin();
			break;
		default:
			System.out.println("该账户不存在，请先注册！！！");
			userRegister();

			break;

		}

	}
}
