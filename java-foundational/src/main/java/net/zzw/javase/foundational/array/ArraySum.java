package net.zzw.javase.foundational.array;

/**
 * 数组求和
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/18 上午8:17
 * @since JDK11
 */
public class ArraySum {

	public static void main(String[] args) {
		// 保存分数
		int[] scores = new int[] {100, 90, 80, 85, 75};

		// 1.定义变量保存存累加求和的结果 sum
		int sum = 0;

		// 2.遍历数组，获取每个元并且累加求和 sum += scores[i]
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		// 3.打印输出结果
		System.out.println("总分 = " + sum);
	}
}
