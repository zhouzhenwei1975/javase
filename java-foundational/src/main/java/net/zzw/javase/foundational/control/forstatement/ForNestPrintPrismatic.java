package net.zzw.javase.foundational.control.forstatement;

/**
 * 打印棱形
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/16 上午12:28
 * @since JDK11
 */
public class ForNestPrintPrismatic {
	public static void main(String[] args) {
		int row = 8;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row - i - 1; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = 0; i < row - 1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < row - 1 -i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
