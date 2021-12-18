package net.zzw.javase.foundational.method;

import jdk.jfr.consumer.RecordedEvent;
import net.zzw.javase.foundational.array.ArrayNullPointer;

import java.util.Arrays;

/**
 * 数组工具类
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/18 下午4:16
 * @since JDK11
 */
public class ArrayUtils {

	/**
	 * 整数数组的冒泡排序
	 * @param numbers
	 */
	public static void bubbleSort(int[] numbers) {
		// 对传入参数进行判断
		if (numbers == null) {
			System.out.println("传入的参数不合法");
			return;
		}

		System.out.println("冒泡排序前数组:" + Arrays.toString(numbers));

		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = 0; j < numbers.length - i - 1; j++) {
				if (numbers[j] > numbers[j + 1]) {
					numbers[j] = numbers[j] ^ numbers[j + 1];
					numbers[j + 1] = numbers[j] ^ numbers[j + 1];
					numbers[j] = numbers[j] ^ numbers[j + 1];
				}
			}
		}
		System.out.println("冒泡排序后数组:" + Arrays.toString(numbers));
	}

	/**
	 * 整数数组选择排序
	 * @param numbers 需要排序的数组
	 */
	public static void selectionSort(int[] numbers) {
		if (numbers == null) {
			System.out.println("传入参数不合法");
			return;
		}

		System.out.println("选择排序前数组:" + Arrays.toString(numbers));

		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					numbers[i] = numbers[i] ^ numbers[j];
					numbers[j] = numbers[i] ^ numbers[j];
					numbers[i] = numbers[i] ^ numbers[j];
				}
			}
		}

		System.out.println("选择排序后数组:" + Arrays.toString(numbers));
	}

	/**
	 * 二分查找法
	 * @param numbers 整数数组
	 * @param target 查找的数据
	 * @return 返回目标元素的索引
	 */
	public static int binarySearch(int[] numbers, int target) {
		int index = -1;
		int start = 0;
		int end = numbers.length - 1;

		while (start <= end) {
			int mid = (end + start) / 2;

			if (numbers[mid] == target) {
				index = mid;
				break;
			} else if (numbers[mid] < target) {
				start = mid + 1;
			} else if (numbers[mid] > target) {
				end = mid - 1;
			}
		}
		return index;
	}

	/**
	 * 往数组中添加指定元素
	 * @param array
	 * @param element
	 * @return
	 */
	public static int[] add(int[] array, int element) {
		// 非空判断
		if (array == null) {
			return null;
		}

		int[] newArray = new int[array.length + 1];
		// 将原数组的内容复制到新数组中
		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}

		// 将需要添加的元素添加到新数组的尾部
		newArray[newArray.length - 1] = element;
		return newArray;
	}

	/**
	 * 根据索引删除数组中指定的元素
	 * @param array 整数数组
	 * @param removeIndex 数组的索引
	 * @return
	 */
	public static int[] remove(int[] array, int removeIndex) {
		// 非空校验
		if (array == null) {
			return null;
		}
		// 索引的合法性校验
		if (removeIndex < 0 || removeIndex > array.length - 1) {
			return null;
		}
		int newArrayIndex = 0;
		int[] newArray = new int[array.length - 1];

		for (int i = 0; i < array.length; i++) {
			if (i != removeIndex) {
				newArray[newArrayIndex] = array[i];
				newArrayIndex++;
			}
		}
		return newArray;
	}

	/**
	 * 删除数组中指定的元素
	 * @param array
	 * @param element
	 * @return
	 */
	public static int[] removeElement(int[] array, int element) {
		if (array == null) {
			return null;
		}

		int removeElementsIndex = -1;

		// 判断有没有删除的元素
		for (int i = 0; i < array.length; i++) {
			if (array[i] == element) {
				removeElementsIndex = i;
			}
		}

		if (removeElementsIndex == -1) {
			return null;
		}

		int[] newArray = new int[array.length - 1];
		int newArrayIndex = 0;
		for (int i = 0; i < array.length; i++) {
			if (i != removeElementsIndex) {
				newArray[newArrayIndex++] = array[i];
			}
		}
		return newArray;
	}
}
