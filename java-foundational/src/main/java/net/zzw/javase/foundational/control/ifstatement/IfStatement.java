package net.zzw.javase.foundational.control.ifstatement;

import java.util.Scanner;

/**
 * 单分支if语句
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/12 下午5:44
 * @since JDK11
 */
public class IfStatement {

	public static void main(String[] args) {
		 // 创建一个Scanner对象
		Scanner input = new Scanner(System.in);

		System.out.println("请输入年龄");

		// 接收用户从键盘输入的年龄
		int age = input.nextInt();

		if (age >= 18) {
			System.out.println("你成年了，可以上网吧");
		}
	}
}
