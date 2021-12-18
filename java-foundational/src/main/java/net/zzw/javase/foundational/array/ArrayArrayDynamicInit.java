package net.zzw.javase.foundational.array;

/**
 * 二维数组的动态初始化
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/18 下午2:40
 * @since JDK11
 */
public class ArrayArrayDynamicInit {
	public static void main(String[] args) {
		int[][] numbers = new int[3][2];

		/*
			[[I@64b8f8f4
		 */
		System.out.println("二维数组的数组信息是" + numbers);

		/*
			[I@555590
		 */
		System.out.println("二维数组的第0个元素" + numbers[0]);
		System.out.println("二维数组的第0个数组的第0个元素" + numbers[0][0]);

		numbers[0][0] = 100;
		System.out.println("二维数组的第0个数组的第0个元素" + numbers[0][0]);
	}
}
