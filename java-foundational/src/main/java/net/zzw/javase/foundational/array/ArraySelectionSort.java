package net.zzw.javase.foundational.array;

import java.util.Arrays;

/**
 * 数组选择排序
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/18 上午11:30
 * @since JDK11
 */
public class ArraySelectionSort {
	public static void main(String[] args) {
		int[] numbers = new int[] {88, 23, 45, 76, 19, 33};

		// 外层循环控制比较轮数
		for (int i = 0; i < numbers.length - 1; i++) {
			// 内层循环控制每轮比较的次数
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					numbers[i] = numbers[i] ^ numbers[j];
					numbers[j] = numbers[i] ^ numbers[j];
					numbers[i] = numbers[i] ^ numbers[j];
				}
			}
			System.out.println("第" + (i + 1) + "轮比较结果:" + Arrays.toString(numbers));
		}
	}
}
