package net.zzw.javase.foundational.syntax.constant;

/**
 * final常量
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/11 下午10:53
 * @since JDK11
 */
public class FinalConstant {
	public static void main(String[] args) {
		final int number = 10;
		System.out.println(number);
		// 常量的值是不能修改的
		// number = 20;
	}
}
