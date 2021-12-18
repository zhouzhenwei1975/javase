package net.zzw.javase.foundational.control.whilestatement;

/**
 * while循环求3位数的水仙花数
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/12 下午10:54
 * @since JDK11
 */
public class WhileNarcissisticNumber {

	public static void main(String[] args) {

		// 初始化变量
		int number = 100;
		while (number < 1000) {
			int unit = number / 1 % 10;
			int ten = number / 10 % 10;
			int hundred = number / 100 % 10;

			int value = unit * unit * unit + ten * ten * ten + hundred * hundred * hundred;
			if (value == number) {
				System.out.println(number);
			}
			number++;
		}
	}
}
