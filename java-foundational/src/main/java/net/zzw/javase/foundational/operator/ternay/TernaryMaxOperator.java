package net.zzw.javase.foundational.operator.ternay;

import java.util.Scanner;

/**
 * 三元运算符求三个整数的最大值
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/12 上午11:07
 * @since JDK11
 */
public class TernaryMaxOperator {
	public static void main(String[] args) {

		// 创建Scanner对象
		Scanner input = new Scanner(System.in);

		System.out.println("请输入第一个整数");
		// 接收第一个整数
		int left = input.nextInt();

		System.out.println("请输入第二个整数");
		// 接收第二个整数
		int middle = input.nextInt();

		System.out.println("请输入第三个整数");
		// 接收第三个整数
		int right = input.nextInt();

		System.out.printf("第一个数:%d 第二个数:%d 第三个数:%d \n", left, middle, right);

		// 求三个数的最大值

		// 第一步 求两个数中的最大值
		int temp = left > middle ? left : middle;
		System.out.println("两个数的最大值是" + temp);

		// 第二步 拿两个数中的最大值和第三个数进行比较
		int max = temp > right ? temp : right;
		System.out.println("三个数的最大值是" + max);
	}
}
