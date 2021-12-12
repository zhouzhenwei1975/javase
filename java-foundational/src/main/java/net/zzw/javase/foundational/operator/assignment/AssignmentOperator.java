package net.zzw.javase.foundational.operator.assignment;

/**
 * 赋值运算符的使用
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/12 上午9:29
 * @since JDK11
 */
public class AssignmentOperator {

	public static void main(String[] args) {

		// 基本的赋值运算符的使用
		int num = 10;

		// 扩展赋值运算符
		// += -= /= %=

		int left = 20;
		int right = 3;
		// +=
		// 扩展赋值运算符的运算特点：将运算符左边的操作数和右边的操作数进行相关的运算后，将运算的结果赋值给左边的操作数（也就是变量）。
		left += right;
		System.out.println("left += right left = " + left);
		System.out.println("left += right right = " + right);

		left -= right;
		System.out.println("left -= right left = " + left);
		System.out.println("left -= right right = " + right);

		left *= right;
		System.out.println("left *= right left = " + left);
		System.out.println("left *= right right = " + right);

		left /= right;
		System.out.println("left /= right left = " + left);
		System.out.println("left /= right right = " + right);

		left %= right;
		System.out.println("left %= right left = " + left);
		System.out.println("left %= right right = " + right);

		// 扩展赋值运算符的使用注意事项：它在赋值之前会进行**强制类型转换，**然后将结果赋值给左边的变量

		byte byteLeft = 10;
		byte byteRight = 20;
		byte byteResult = (byte) (byteLeft + byteRight);
		System.out.println("byteResult = " + byteResult);

		// 扩展赋值运算符实现
		byteLeft += byteRight;
		System.out.println("byteLeft = " + byteLeft);

	}
}
