package net.zzw.javase.foundational.array;

/**
 * 数组空指针
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/18 上午8:04
 * @since JDK11
 */
public class ArrayNullPointer {
	public static void main(String[] args) {
		int[] numbers = new int[] {1, 2, 3};

		System.out.println("访问整数数组的第0个元素的结果" + numbers[0]);
		System.out.println("访问整数数组的第1个元素的结果" + numbers[1]);
		System.out.println("访问整数数组的第2个元素的结果" + numbers[2]);

		numbers = null;
		System.out.println("数组信息" + null);
		// 以下代码触发空指针异常
		System.out.println("访问整数数组的第0个元素的结果" + numbers[0]);
	}
}
