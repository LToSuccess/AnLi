package csdn.stx.cn;

public class Show {
	//登录注册界面
	public static void show() {
		System.out.println("\n================登录注册界面=================");

		System.out.println("\n请输入您选择的功能：1.注册       2.登录");
	char c=Tools.readMenuSelection1();
		
		if (c == '1') {
			LoginAndRegister.userRegister();
		} else if (c=='2') {
			LoginAndRegister.userLogin();
		}
		
	}
}
