package net.zzw.javase.foundational.array;

/**
 * 求数组元素的最大值和最小值
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/18 上午8:21
 * @since JDK11
 */
public class ArrayMaxMin {

	public static void main(String[] args) {
		// 保存分数
		int[] scores = new int[] {100, 90, 80, 85, 75};
		// 1.定义变量max保存最大值
		int max = scores[0];
		int min = scores[0];

		// 2.遍历数组，将数组中元素与max比较
		for (int i = 1; i < scores.length; i++) {
			if (scores[i] > max) {
				max = scores[i];
			}

			if (scores[i] < min) {
				min = scores[i];
			}
		}
		System.out.println("最高分是:" + max);
		System.out.println("最低分是:" + min);

	}
}
