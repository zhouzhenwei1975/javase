package net.zzw.javase.foundational.control.forstatement;

/**
 * 计算1-100的整数和
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/12 下午9:33
 * @since JDK11
 */
public class For1To100Sum {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1-100之间的整数和是:" + sum);
	}
}
