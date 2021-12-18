package net.zzw.javase.foundational.syntax.variable;

/**
 * 通过算术运算进行交换
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/18 上午9:55
 * @since JDK11
 */
public class VariableSwapArithmetic {

	public static void main(String[] args) {
		int left = 10;
		int right = 20;
		System.out.println("交换之前: left = " + left + ", right = " + right);

		left = left + right;
		right = left - right;
		left = left - right;
		System.out.println("交换之后: left = " + left + ", right = " + right);
	}
}
