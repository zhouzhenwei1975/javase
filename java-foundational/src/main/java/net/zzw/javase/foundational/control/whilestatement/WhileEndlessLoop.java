package net.zzw.javase.foundational.control.whilestatement;

/**
 * while循环的死循环
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/12 下午11:35
 * @since JDK11
 */
public class WhileEndlessLoop {
	public static void main(String[] args) {
		while (true) {
			System.out.println("我是一个while循环的死循环");
			break;
		}

		System.out.println("遇到了break退出循环");
	}
}
