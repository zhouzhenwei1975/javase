package net.zzw.javase.foundational.array;

/**
 * 数组不可变性
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/17 下午11:14
 * @since JDK11
 */
public class ArrayImmutability {
	public static void main(String[] args) {
		// 静态初始化一个整数数组
		int[] scores = new int[] {100, 90, 80};
		/*
			[I@7cef4e59
		 */
		System.out.println("scores = " + scores);

		/*
			[I@1996cd68
		 */
		scores = new int[] {100, 90, 80, 95, 75};
		System.out.println("scores = " + scores);
	}
}
