package net.zzw.javase.foundational.control.forstatement;

/**
 * for循环求3位数的水仙花数
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/12 下午9:47
 * @since JDK11
 */
public class ForNarcissisticNumber {

	public static void main(String[] args) {
		// 1.求水仙花数
		// 2.统计水仙花数的个数

		// 统计水仙数的变量
		int count = 0;

		for (int i = 100; i <= 999; i++) {
			// 求出个、十、百位数
			// 个位
			int unit = i / 1 % 10;
			// 十位
			int ten = i / 10 % 10;
			// 百位
			int hundred = i / 100 % 10;
			// 判断各位数3次幂的和
			if (unit * unit * unit + ten * ten * ten + hundred * hundred * hundred == i) {
				count++;
				System.out.println(i);
			}
		}

		System.out.println("共有水仙花数:" + count + "个");
	}
}
