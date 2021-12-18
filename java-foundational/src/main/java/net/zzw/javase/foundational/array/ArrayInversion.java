package net.zzw.javase.foundational.array;

import java.util.Arrays;

/**
 * 数组元素反转
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/18 上午10:17
 * @since JDK11
 */
public class ArrayInversion {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6};
		System.out.println("反转之前:" + Arrays.toString(numbers));

		int startIndex = 0;
		int endIndex = numbers.length - 1;
		int count = 1;
		while (startIndex < endIndex) {
			// 使用变量交换
			/*
			int temp = numbers[startIndex];
			numbers[startIndex++] = numbers[endIndex];
			numbers[endIndex--] = temp;
			 */

			// 使用算术运算交换
			/*
			numbers[startIndex] = numbers[startIndex] + numbers[endIndex];
			numbers[endIndex] = numbers[startIndex] - numbers[endIndex];
			numbers[startIndex] = numbers[startIndex] - numbers[endIndex];
			startIndex++;
			endIndex--;
			 */

			// 使用异或运算交换
			numbers[startIndex] = numbers[startIndex] ^ numbers[endIndex];
			numbers[endIndex] = numbers[startIndex] ^ numbers[endIndex];
			numbers[startIndex] = numbers[startIndex] ^ numbers[endIndex];
			System.out.println("第" + (count++) + "次交换结果是:" + Arrays.toString(numbers));
			startIndex++;
			endIndex--;
		}

		System.out.println("反转之后:" + Arrays.toString(numbers));

	}
}
