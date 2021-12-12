package net.zzw.javase.foundational.operator.autoincrement;

/**
 * 自增运算符前置++和后置++复合使用的区别
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/12 上午8:54
 * @since JDK11
 */
public class AutoincrementExpressionOperator {
	public static void main(String[] args) {

		int number = 10;
		// right = 10;
		// 后置++ 先参与运算，再自增1
		int right = number++;
		System.out.println("right = " + right);
		System.out.println("number = " + number);

		int data = 10;
		// 前置++ 先自增1，再参与运算
		int left = ++data;
		System.out.println("left = " + left);
		System.out.println("data = " + data);
	}
}
