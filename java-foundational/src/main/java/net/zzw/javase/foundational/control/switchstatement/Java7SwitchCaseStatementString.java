package net.zzw.javase.foundational.control.switchstatement;

import net.zzw.javase.foundational.syntax.variable.Variable;

import java.util.Scanner;

/**
 * JDK7新特性之switch/case使用String
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/12 下午6:43
 * @since JDK11
 */
public class Java7SwitchCaseStatementString {

	public static void main(String[] args) {

		// 需求：根据不同的性别生成不同的招呼用语

		String greeting = "你好,";

		Scanner input = new Scanner(System.in);

		System.out.println("请输入你的性别 男/女");

		// 接收用户人键盘输入的性别保存存到gender中
		String gender = input.next();

		// switch/case语句等价if/else if/else
		switch (gender) {
			case "男":
				greeting += "先生";
				break;
			case "女":
				greeting += "女仕";
				break;
			default:
				greeting += "顾客";
				break;
		}

		System.out.println(greeting);
	}
}
