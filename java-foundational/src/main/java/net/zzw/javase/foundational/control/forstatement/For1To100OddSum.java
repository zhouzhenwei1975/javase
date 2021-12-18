package net.zzw.javase.foundational.control.forstatement;

/**
 * 计算1-100的奇数和
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/12 下午9:36
 * @since JDK11
 */
public class For1To100OddSum {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println("1-100之间整数的奇数和是:" + sum);
	}
}
