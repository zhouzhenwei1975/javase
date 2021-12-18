package net.zzw.javase.foundational.array;

/**
 * 数组二分查找
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/18 下午12:23
 * @since JDK11
 */
public class ArrayBinarySearch {
	public static void main(String[] args) {
		int[] numbers = new int[] {19, 23, 33, 45, 76, 88, 90, 99, 110};

		// 起始索引
		int start = 0;
		// 结束索引
		int end = numbers.length - 1;
		// 查找的值
		int findKey = 199;
		// 返回的结果
		int index = -1;

		while (start <= end) {
			// 中间索引
			int mid = (start + end) / 2;

			if (numbers[mid] == findKey) {
				index = mid;
				break;
			} else if (numbers[mid] < findKey) {
				start = mid + 1;
			} else if (numbers[mid] > findKey) {
				end = mid - 1;
			}
		}

		if (index == -1) {
			System.out.println("没有找到元素");
		} else {
			System.out.println("元素所在的索引是:" + index);
		}
	}
}
