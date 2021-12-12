package net.zzw.javase.foundational.operator.autoincrement;

/**
 * 自增运算符
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/12 上午1:18
 * @since JDK11
 */
public class AutoincrementOperator {
	public static void main(String[] args) {

		int number = 10;
		number++;
		System.out.println("number = " + number);

		int data = 10;
		++data;
		System.out.println("data = " + data);
	}
}
