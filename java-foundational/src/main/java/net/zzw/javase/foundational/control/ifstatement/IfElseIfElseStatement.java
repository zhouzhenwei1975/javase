package net.zzw.javase.foundational.control.ifstatement;

import java.util.Scanner;

/**
 * 多分支if/else if/else语句
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/12 下午6:00
 * @since JDK11
 */
public class IfElseIfElseStatement {
	public static void main(String[] args) {
		// 创建Scanner对象
		Scanner input = new Scanner(System.in);

		System.out.println("请输入第一个整数");
		// 接收键盘输入的第一个整数存储到left变量中
		int left = input.nextInt();

		System.out.println("请输入第二个整数");
		// 接收键盘输入的第二个整数存储到right变量中
		int right = input.nextInt();

		// 使用多分支判断两个整数的关系
		if (left > right) {
			System.out.printf("%d 大于 %d \n", left, right);
		} else if (left < right) {
			System.out.printf("%d 小于 %d \n", left, right);
		} else {
			System.out.printf("%d 等于 %d \n", left, right);
		}

	}
}
