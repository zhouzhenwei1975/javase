package net.zzw.javase.foundational.method;

/**
 * 方法重载与基本数据类型的自动类型转换
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/18 下午6:59
 * @since JDK11
 */
public class MethodOverloadingPrimitiveAutoConversion {

	public static void invoke(byte var) {
		System.out.println("invoke(byte)");
	}

	public static void invoke(short var) {
		System.out.println("invoke(short)");
	}

	public static void invoke(int var) {
		System.out.println("invoke(int)");
	}
	/*
	public static void invoke(int var1, int var2) {
		System.out.println("invoke(int, int)");
	}
	 */

	public static void invoke(double var1, double var2) {
		System.out.println("invoke(double, double)");
	}


	public static void invoke(long var) {
		System.out.println("invoke(long)");
	}
}
