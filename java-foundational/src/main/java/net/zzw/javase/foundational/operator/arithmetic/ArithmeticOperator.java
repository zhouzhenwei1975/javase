package net.zzw.javase.foundational.operator.arithmetic;

/**
 * 算术运算符
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/12 上午12:53
 * @since JDK11
 */
public class ArithmeticOperator {
	public static void main(String[] args) {

		int left = 20;
		int right = 3;

		System.out.println("left = " + left);
		System.out.println("right = " + right);

		// 算术运算符 + - * / %的使用
		System.out.printf("%d + %d = %d \n", left, right, (left + right));
		System.out.printf("%d - %d = %d \n", left, right, (left - right));
		System.out.printf("%d * %d = %d \n", left, right, (left * right));
		System.out.printf("%d / %d = %d \n", left, right, (left / right));
		System.out.printf("%d %% %d = %d \n", left, right, (left % right));

		char ch = 'a';
		int result = ch + left + right;
		System.out.printf("%d + %d + %d = %d \n", (int) ch, left, right, result);

		System.out.println();
	}
}
