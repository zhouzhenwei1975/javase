package net.zzw.javase.foundational.control.forstatement;

/**
 * 打印输出符合需求四位整数
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/12 下午10:01
 * @since JDK11
 */
public class ForIfElseNestArithmeticLogic {

	public static void main(String[] args) {
		// 需求1 打印出四位数字中 个位+百位 = 十位+千位，其中个位为偶数，千位为奇数的数字，并且打印出符合条件的个数
		// 需求2 符合条件的数字，每行显示5个，用空格隔开
		// 统计总个数
		int count = 0;

		for (int i = 1000; i < 10000; i++) {
			// 求出个、十、百、千位
			// 个
			int unit = i / 1 % 10;
			// 十
			int ten = i / 10 % 10;
			// 百
			int hundred = i / 100 % 10;
			// 千
			int thousand = i / 1000 % 10;

			if (unit + hundred == ten + thousand && unit % 2 == 0 && thousand % 2 != 0) {
				count++;
				System.out.print(i + " ");
				if (count % 5 == 0) {
					System.out.println();
				}
			}
		}

		System.out.println("符合条件的总个数有:" + count + "个");
	}
}
