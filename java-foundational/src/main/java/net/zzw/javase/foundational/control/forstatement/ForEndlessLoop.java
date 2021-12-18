package net.zzw.javase.foundational.control.forstatement;

/**
 * for模拟死循环
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/12 下午11:34
 * @since JDK11
 */
public class ForEndlessLoop {
	public static void main(String[] args) {
		for (; ;) {
			System.out.println("我是一个for循环的死循环");
		}
	}
}
