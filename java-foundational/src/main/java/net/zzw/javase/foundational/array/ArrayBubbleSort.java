package net.zzw.javase.foundational.array;

import java.util.Arrays;

/**
 * 数组冒泡排序
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/18 上午11:10
 * @since JDK11
 */
public class ArrayBubbleSort {
	public static void main(String[] args) {
		int[] numbers = new int[] {88, 23, 45, 76, 19, 33};
		// 外层控制比较轮数
		for (int i = 0; i < numbers.length - 1; i++) {
			// 内层控制每轮比较的次数
			for (int j = 0; j < numbers.length - 1 - i; j++) {
				if (numbers[j] > numbers[j + 1]) {
					// 通过异或运算进行交换
					numbers[j] = numbers[j] ^ numbers[j + 1];
					numbers[j + 1] = numbers[j] ^ numbers[j + 1];
					numbers[j] = numbers[j] ^ numbers[j + 1];
				}
			}
			System.out.println("第" + (i + 1) + "轮比较结果:" + Arrays.toString(numbers));
		}
		System.out.println(Arrays.toString(numbers));
	}
}
