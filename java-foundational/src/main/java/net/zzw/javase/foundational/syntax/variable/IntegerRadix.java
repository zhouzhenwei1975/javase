package net.zzw.javase.foundational.syntax.variable;

/**
 * 整数的四种进制表示方式
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/11 下午10:37
 * @since JDK11
 */
public class IntegerRadix {
	public static void main(String[] args) {
		// 定义四个进制的整数
		int bin = 0b1001;
		int oct = 017;
		int dec = 100;
		int hex = 0x64;

		System.out.println("bin = " + bin);
		System.out.println("oct = " + oct);
		System.out.println("dec = " + dec);
		System.out.println("hex = " + hex);
	}
}
