package net.zzw.javase.foundational.array;


/**
 * 两个引用指向同一个数组
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/17 下午11:35
 * @since JDK11
 */
public class ArrayAssignment {
	public static void main(String[] args) {
		int[] source = new int[] {10, 20, 30};
		/*
			64b8f8f4
		 */
		System.out.println("原数组的信息" + source);

		int[] target = source;
		/*
			64b8f8f4
		 */
		System.out.println("新数组的信息" + target);

		System.out.println("修改之前原数组第0个元素的值是" + source[0]);
		System.out.println("修改之前新数组第0个元素的值是" + target[0]);
		target[0] = 100;

		System.out.println("修改之后原数组第0个元素的值是" + source[0]);
		System.out.println("修改之后新数组第0个元素的值是" + target[0]);
	}
}
