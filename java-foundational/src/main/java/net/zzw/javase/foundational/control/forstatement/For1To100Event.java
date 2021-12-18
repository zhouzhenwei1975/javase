package net.zzw.javase.foundational.control.forstatement;

/**
 * 打印输出1-100的偶数
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/12 下午9:28
 * @since JDK11
 */
public class For1To100Event {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			// 判断i是不是偶数
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
