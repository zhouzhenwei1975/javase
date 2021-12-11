package net.zzw.javase.foundational.syntax.variable;

/**
 * 变量的定义和使用
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/11 下午10:25
 * @since JDK11
 */
public class Variable {
	public static void main(String[] args) {
		// 变量的定义格式	数据类型 变量名 = 变量值
		// 定义时赋值叫初始化赋值
		int age = 29;
		System.out.println("age = " + age);

		age = 30;
		System.out.println("age = " + age);

		// 变量的声明	 数据类型 变量名;
		int value;

		// 变量的赋值	 变量名 = 变量值
		value = 10;
		// main方法内声明的变量都叫局部变量
		// 局部变量赋值之后才能使用
		System.out.println("value = " + value);

		// 同一个作用域内 变量不能重复定义
		// int age = 30;
	}
}
