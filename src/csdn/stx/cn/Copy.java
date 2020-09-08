package csdn.stx.cn;

public class Copy {
	public static void print(String str, int times) throws InterruptedException {
		System.out.print(str);
		sleep(times);
	}

	public static void sleep(int times) throws InterruptedException {
		if (times > 0) {
			Thread.sleep(times);
		}
	}
}
