package net.zzw.javase.foundational.operator.ternay;

/**
 * 三元运算符的使用
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/12 上午10:53
 * @since JDK11
 */
public class TernaryOperator {

	public static void main(String[] args) {

		int left = 10;
		int right = 20;
		System.out.println("left = " + left);
		System.out.println("right = " + right);
		// 布尔表达式?结果1:结果2
		int max = left > right ? left : right;
		int min = left < right ? left : right;
		System.out.println("两个数的最大值是" + max + " 两个数的最小值是" + min);

		min = left > right ? right : left;
		System.out.println("另外一种方式求两个数的最小值" + min);
	}
}
