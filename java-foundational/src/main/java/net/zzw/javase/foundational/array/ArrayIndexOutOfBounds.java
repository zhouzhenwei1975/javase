package net.zzw.javase.foundational.array;

/**
 * 数组越界
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/18 上午8:01
 * @since JDK11
 */
public class ArrayIndexOutOfBounds {
	public static void main(String[] args) {
		int[] numbers = new int[] {1, 2, 3};

		System.out.println("访问整数数组的第0个元素的结果" + numbers[0]);
		System.out.println("访问整数数组的第1个元素的结果" + numbers[1]);
		System.out.println("访问整数数组的第2个元素的结果" + numbers[2]);
		// 以下代码越界
		System.out.println("访问整数数组的第3个元素的结果" + numbers[3]);
	}
}
