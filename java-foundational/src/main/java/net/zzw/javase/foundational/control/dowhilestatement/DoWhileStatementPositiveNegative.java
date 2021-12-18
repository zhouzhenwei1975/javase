package net.zzw.javase.foundational.control.dowhilestatement;

import java.util.Scanner;

/**
 * do/while循环应用
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/12 下午10:42
 * @since JDK11
 */
public class DoWhileStatementPositiveNegative {

	public static void main(String[] args) {

		// 1.创建Scanner对象
		Scanner input = new Scanner(System.in);

		// 2.定义变量存储 正整数个数和负整数的个数
		// 正
		int positiveCount = 0;
		// 负
		int negativeCount = 0;
		int number = 1;

		do {
			System.out.println("请输入一个整数");
			number = input.nextInt();
			if (number > 0) {
				positiveCount++;
			} else if (number < 0) {
				negativeCount++;
			}
		} while (number != 0);
		System.out.println("键盘输入的正整数个数是:" + positiveCount);
		System.out.println("键盘输入的负整数个数是:" + negativeCount);
	}
}
