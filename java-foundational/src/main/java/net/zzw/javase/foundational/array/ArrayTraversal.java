package net.zzw.javase.foundational.array;

import java.util.Arrays;

/**
 * 数组遍历
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/18 上午8:07
 * @since JDK11
 */
public class ArrayTraversal {

	public static void main(String[] args) {

		// 保存5个分数
		int[] scores = new int[] {100, 90, 80, 85, 75, 88};

		for (int i = 0; i < scores.length; i++) {
			System.out.println("获取数组中第" + i + "个元素的结果是" + scores[i]);
		}

		// 使用字符地串拼接的方式打印数组的每个元素
		System.out.println(Arrays.toString(scores));

		System.out.print("[");
		for (int i = 0; i < scores.length; i++) {
			// 判断是否数组最后一个元素
			if (i == scores.length - 1) {
				System.out.println(scores[i] + "]");
			} else {
				System.out.print(scores[i] + ", ");
			}
		}
	}
}
