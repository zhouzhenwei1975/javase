package net.zzw.javase.foundational.array;

import java.util.Arrays;
import java.util.Random;

/**
 * 数组平均值
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/18 上午8:29
 * @since JDK11
 */
public class ArrayAverage {

	public static void main(String[] args) {
		/*
			模拟射击游戏，每个人可以射击10次，每次的分数是0-10之间，求平均分
			条件：去掉最高分
			条件：去掉最低分
		 */

		// 射击次数变量
		int[] count = new int[10];
		// 定义随机数对象
		Random random = new Random();
		// 总分
		int total = 0;

		// 最大值、最小值的索引
		int maxIndex = 0;
		int minIndex = 0;

		for (int i = 0; i < count.length; i++) {
			count[i] = random.nextInt(10) + 1;

			if (count[i] > count[maxIndex]) {
				maxIndex = i;
			}

			if (count[i] < count[minIndex]) {
				minIndex = i;
			}
			total += count[i];
		}
		System.out.println("射击分数列表:" + Arrays.toString(count));
		System.out.println("最高分:" + count[maxIndex]);
		System.out.println("最低分:" + count[minIndex]);
		System.out.println("总分:" + total);
		System.out.println("平均分:" + (total - count[maxIndex] - count[minIndex]) / 8.0);
	}
}
