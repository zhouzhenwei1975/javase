package net.zzw.javase.foundational.control.forstatement;

/**
 * 九九乘法表
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/15 下午11:35
 * @since JDK11
 */
public class ForNestMultiplicationTable {
	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%d * %d = %d\t", j, i, (j * i));
			}
			System.out.println();
		}
	}
}
