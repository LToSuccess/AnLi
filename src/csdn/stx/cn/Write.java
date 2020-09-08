package csdn.stx.cn;
//上传文章
public class Write {
public static void write() {
	System.out.println("请输入文章编号：(必须是数字)");
	int i = Tools.readNumber();
	System.out.println("请输入文章标题：(不超过8个字 )");
	String head = Tools.readString();
	System.out.println("请输入文章内容：( 10000字以内)");
	String title1 = Tools.readString2();
	System.out.println("请输入今天的日期：");
	String date = Tools.readString2();
	System.out.println("请问您确认上传该篇文章吗：（1）确认   （2）取消");
	char c = Tools.readMenuSelection1();
	if (c == '1') {
		Title t1 = new Title(i, head, title1, date);
		Leave.title.add(t1);
		System.out.println("文章已上传成功！！！");
	} else if (c == '2') {
		System.out.println("您已取消上传，请继续使用！！");
	}
}
public  static void write(int num) {
	System.out.println("请输入文章标题：(不超过8个字 )");
	String head = Tools.readString();
	System.out.println("请输入文章内容：( 10000字以内)");
	String title1 = Tools.readString2();
	System.out.println("请输入今天的日期：");
	String date = Tools.readString2();
	System.out.println("请问您确认上传该篇文章吗：（1）确认   （2）取消");
	char c = Tools.readMenuSelection1();
	if (c == '1') {
		Title t1 = new Title(num, head, title1, date);
		Leave.title.add(t1);
		System.out.println("文章已上传成功！！！");
	} else if (c == '2') {
		System.out.println("您已取消上传，请继续使用！！");
	}
}  
}
