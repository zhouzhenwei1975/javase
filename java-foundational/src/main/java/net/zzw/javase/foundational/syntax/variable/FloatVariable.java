package net.zzw.javase.foundational.syntax.variable;

/**
 * 浮点类型变量的定义和使用
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/11 下午10:39
 * @since JDK11
 */
public class FloatVariable {
	public static void main(String[] args) {
		float floatVal = 3.14F;
		double doubleVal = 3.14;
		System.out.println("floatVal = " + floatVal);
		System.out.println("doubleVal = " + doubleVal);

		// 浮点数 运算有精度损失 2.0 - 1.1 = 0.8999999999999999
		System.out.println(2.0 - 1.1);

		double value = 314E-2;
		System.out.println("value = " + value);

		value = 1000.00E3;
		System.out.println("value = " + value);
	}
}
