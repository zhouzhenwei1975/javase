package net.zzw.javase.foundational.operator.arithmetic;

import java.util.Scanner;

/**
 * 数字反转
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/12 上午9:08
 * @since JDK11
 */
public class NumberInversion {
	public static void main(String[] args) {
		// 创建Scanner对象
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数:");

		// 接收键盘输入的整数保存到number变量中
		int number = input.nextInt();
		System.out.println("你从键盘输入的数字是:" + number);

		// 第一步 获取四位整数的个位、十位、百位、千位
		int unit = number / 1 % 10;
		int ten = number / 10 % 10;
		int hundred = number / 100 % 10;
		int thousand = number / 1000 % 10;
		System.out.printf("输入数字的 个位:%d 十位:%d 百位:%d 千位:%d \n", unit, ten, hundred, thousand);

		// 第二步 个位*1000 + 十位 * 100 + 百位 * 10 + 千位
		int result = unit * 1000 + ten * 100 + hundred * 10 + thousand;
		System.out.printf("%d反转后的结果是%d \n", number, result);
	}
}
