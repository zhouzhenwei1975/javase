package net.zzw.javase.foundational.syntax.variable;

/**
 * 通过中间变量实现变量交换
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/18 上午9:52
 * @since JDK11
 */
public class VariableSwapTemp {

	public static void main(String[] args) {
		int left = 10;
		int right = 20;
		System.out.println("交换之前: left = " + left + ", right = " + right);

		int temp = left;
		left = right;
		right = temp;
		System.out.println("交换之后: left = " + left + ", right = " + right);
	}
}
