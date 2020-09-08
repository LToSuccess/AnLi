package csdn.stx.cn;

public class Show1 {
	//CSDN主页
	public static void show1() {
		
		
			System.out.println("\n================CSDN首页=================");
			System.out.println("\n\t1.查看博文\n\t2.写博客\n\t3.删除博客\n\t4.编辑博文\n\t5.切换用户\n\t6.退出博客\n请输入需要进行的操作:");
			char menu = Tools.readMenuSelection();
			switch (menu) {
			case '1':
				//查看文章
				Boke.check();
				break;
			case '2':
				//上传文章
				Boke.write();
				break;
			case '3':
				//删除文章
				Boke.rem();
				break;
				
			case '4':
				//修改文章
				Boke.alter();
				break;
			case '5':
				//切换用户
				System.out.println("确认是否切换用户y/n：");
				char exit = Tools.readConfirmSelection();
				if (exit == 'Y') {
					
					System.out.println("您的账号已退出，即将进入登录注册页！！！");
					
					Show.show();
					

				} else {
					System.out.println("您已选择继续使用！");
					Show1.show1();
				}
				break;
				//关闭博客
			case '6':
				System.out.println("确认是否退出系统y/n：");
				char exit1 = Tools.readConfirmSelection();
				if (exit1 == 'Y') {
					System.out.println("关闭成功！！！");
					System.exit(0);
				} else {
					System.out.println("您已选择继续使用！");
					Show1.show1();
				}
				break;

			}
		}

	}

