package net.zzw.javase.foundational.control.switchstatement;

import java.util.Scanner;

/**
 * switch语句的应用
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/12 下午6:35
 * @since JDK11
 */
public class SwitchCaseStatement {
	public static void main(String[] args) {

		// 用户输入对应的数字，然后输出数字对应的星期

		Scanner input = new Scanner(System.in);

		System.out.println("请输入数字");

		int number = input.nextInt();

		switch (number) {
			case 1:
				System.out.println("星期一");
				break;
			case 2:
				System.out.println("星期二");
				break;
			case 3:
				System.out.println("星期三");
				break;
			case 4:
				System.out.println("星期四");
				break;
			case 5:
				System.out.println("星期五");
				break;
			case 6:
				System.out.println("星期六");
				break;
			case 7:
				System.out.println("星期日");
				break;
			default:
				System.out.println("输入有误");
				break;
		}
	}
}
