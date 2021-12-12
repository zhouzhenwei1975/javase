package net.zzw.javase.foundational.operator.ternay;

/**
 * 三元运算符的使用注意事项
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/12 上午10:59
 * @since JDK11
 */
public class TernaryWarning {

	public static void main(String[] args) {

		// 结果1的类型是int
		// 结果2的类型是double
		// 但是由于7种数据类型(数值类型)是可以进行自动类型转换的
		// 12赋值给result变量之前自动转换成了浮点数
		double result = true ? 12 : 100.0;
		System.out.println("result = " + result);

		int value = true ? 100 : (int) 12.0;
		System.out.println("value = " + value);

		// 如果三元表达式只是输出使用。不需要保持一致
		// 整数和浮点数在一起参与运算，结果类型是浮点类型
		System.out.println(true ? 100 : 12.0);
	}
}
