package csdn.stx.cn;

import java.util.Scanner;

public class Boke {

	static Scanner scanner = new Scanner(System.in);

	public static void check() {

		System.out.println("================博客列表=================\n");

		for (Title t : Leave.title) {
			System.out.println(t.num + "," + t.head + "\n" + "文章内容：" + t.body + "\n" + "发布日期：" + t.date);
		}
		System.out.println("\n========================================\n");
		System.out.println("请选择接下来要进行的操作：1.返回首页     2.发布文章     ");
		char c = Tools.readMenuSelection1();

		if (c == '1') {
			Show1.show1();
		} else if (c == '2') {
			write();
		}
	}

	public static void write() {

		System.out.println("================请开始上传文章=================\n");
		
		if(Leave.title.size()==0) {
			Write.write();
		}else {
			System.out.println("请输入文章编号：(必须是数字)");
			int i = Tools.readNumber();
			for(Title t:Leave.title) {
				if(t.num==i) {
					System.out.println("编号发生重复，请重新输入：");
					write();
				
				}else {
					Write.write(i);
					break;
				}
			}
		}
		

		System.out.println("请选择接下来要进行的操作：1.返回首页     2.继续发布  ");
		char c1 = Tools.readMenuSelection1();

		if (c1 == '1') {
			Show1.show1();
		} else if (c1 == '2') {
			write();
		}
	}

	public static void rem() {
		System.out.println("================文章删除=================\n");
		System.out.println("请输入要删除的博文编号：");
		int num = Tools.readNumber();
		for (Title t : Leave.title) {
			if (t.num == num) {
				System.out.println("请问您确认删除该篇文章吗：（1）确认   （2）取消");
				char c1 = Tools.readMenuSelection1();

				if (c1 == '1') {
					Leave.title.remove(t);
					System.out.println("删除成功");
					break;
				} else if (c1 == '2') {
					System.out.println("取消删除成功，请继续使用！！");
				}

			}
		}
		System.out.println("请选择接下来要进行的操作：1.返回首页     2.继续删除  ");
		char c = Tools.readMenuSelection1();

		if (c == '1') {
			Show1.show1();
		} else if (c == '2') {
			write();
		}
	}

	public static void alter() {
		System.out.println("================文章修改=================\n");
		System.out.println("请输入要修改的博文编号：");
		int num = Tools.readNumber();
		System.out.println("请输入新的标题：");
		String head = Tools.readString();
		System.out.println("请输入新的文章：");
		String title = Tools.readString();
		System.out.println("请输入新的日期：");
		String date = Tools.readString();
		int n = 0;
		System.out.println("请问您确认修改该篇文章吗：（1）确认   （2）取消");
		char c = Tools.readMenuSelection1();

		if (c == '1') {
			for (Title t : Leave.title) {

				if (num == t.num) {
					Leave.title.set(n, new Title(num, head, title, date));
					System.out.println("修改成功！！");
					break;
				}
				n++;
			}
		} else if (c == '2') {
			System.out.println("取消修改成功，请继续使用！！");
		}
		

		System.out.println("请选择接下来要进行的操作：1.返回首页     2.继续编辑  ");
		char c2 = Tools.readMenuSelection1();

		if (c2 == '1') {
			Show1.show1();
		} else if (c == '2') {
			write();
		}

	}

}
