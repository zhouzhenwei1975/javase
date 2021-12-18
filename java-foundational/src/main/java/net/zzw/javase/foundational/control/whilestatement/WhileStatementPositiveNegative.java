package net.zzw.javase.foundational.control.whilestatement;

import java.util.Scanner;

/**
 * while语句的应用
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/12 下午10:29
 * @since JDK11
 */
public class WhileStatementPositiveNegative {

	public static void main(String[] args) {

		// 需求：读取用户从键盘输入的正数和负数的个数，输入0时程序退出

		// 1.创建Scanner对象
		Scanner input = new Scanner(System.in);

		// 2.定义变量存储 正整数个数和负整数的个数
		// 正
		int positiveCount = 0;
		// 负
		int negativeCount = 0;

		// 3.循环读取用户输入的数字，直到0结否循环
		int number = 1;
		while (number != 0) {

			// 提示用户输入相关数据
			System.out.println("请输入一个整数");
			// 接收用户键盘输入的整数存入变量number
			number = input.nextInt();
			if (number > 0) {
				positiveCount++;
			} else if (number < 0) {
				negativeCount++;
			}
		}

		System.out.println("键盘输入的正整数个数是:" + positiveCount);
		System.out.println("键盘输入的负整数个数是:" + negativeCount);
	}
}
