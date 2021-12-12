package net.zzw.javase.foundational.operator.relation;

/**
 * 关系运算符
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/12 上午9:56
 * @since JDK11
 */
public class RelationOperator {

	public static void main(String[] args) {
		// 关系运算符的结果类型是布尔类型，要么是true，要么是false

		System.out.println("10 > 20 = " + (10 > 20));
		System.out.println("10 < 20 = " + (10 < 20));

		System.out.println("10 == 10 = " + (10 == 10));
		System.out.println("10 != 10 = " + (10 != 10));

		System.out.println("10 <= 20 = " + (10 <= 20));
		System.out.println("10 >= 10 = " + (10 >= 10));
	}
}
