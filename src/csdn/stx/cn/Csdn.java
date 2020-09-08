package csdn.stx.cn;

public class Csdn {

	public static void main(String[] args) throws InterruptedException {
		
		//打印分界线
		for (int i = 0; i < 40; i++) {
			Copy.print("=", 100);
		}
		System.out.println("\n\n\t\t欢迎进入CSDN\n");
		//打印分界线
		for (int i = 0; i < 40; i++) {
			Copy.print("=", 100);
		}
		//打开登录注册界面
		Show.show();
		
		}

	}


