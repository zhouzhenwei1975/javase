package net.zzw.javase.foundational.method;

/**
 * 方法重载
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/18 下午5:22
 * @since JDK11
 */
public class MethodOverloading {

	public static boolean compare(int left, int right) {
		System.out.println("compare(int, int)");
		return left == right;
	}

	public static boolean compare(long left, long right) {
		System.out.println("compare(long, long)");
		return left == right;
	}

	public static boolean compare(boolean left, boolean right) {
		System.out.println("compare(boolean, boolean)");
		return left == right;
	}
}
