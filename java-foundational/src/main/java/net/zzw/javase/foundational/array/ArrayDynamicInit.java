package net.zzw.javase.foundational.array;

/**
 * 数组动态初始化
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/16 下午9:30
 * @since JDK11
 */
public class ArrayDynamicInit {
	public static void main(String[] args) {
		// 语法格式

		// **数据类型[] 数组名 = new 数据类型[长度];**
		int[] numbers = new int[3];

		/*
			[I@626b2d4a
			[I 表示整数数组
			@ 分隔符
			626b2d4a 十六进制的哈希值
		 */
		System.out.println(numbers);

		// 使用数组名[下标]访问数组的元素
		System.out.println("访问整数数组的初始值" + numbers[0]);
		System.out.println("访问整数数组的初始值" + numbers[1]);
		System.out.println("访问整数数组的初始值" + numbers[2]);

		// 给数组的第0个元素赋值100
		numbers[0] = 100;
		numbers[1] = 200;
		numbers[2] = 300;

		System.out.println("访问整数数组的初始值" + numbers[0]);
		System.out.println("访问整数数组的初始值" + numbers[1]);
		System.out.println("访问整数数组的初始值" + numbers[2]);

		char[] chars = new char[3];

		System.out.println("访问字符数组第0个元素的初始值" + chars[0]);
		System.out.println("访问字符数组第1个元素的初始值" + chars[1]);
		System.out.println("访问字符数组第2个元素的初始值" + chars[2]);


		System.out.println("hello" + '\u0000' + "world");

		double[] doubles = new double[3];

		System.out.println("访问浮点型数组第0个元素的初始值" + doubles[0]);
		System.out.println("访问浮点型数组第1个元素的初始值" + doubles[1]);
		System.out.println("访问浮点型数组第2个元素的初始值" + doubles[2]);

		boolean[] booleans = new boolean[3];

		System.out.println("访问布尔型数组第0个元素的初始值" + booleans[0]);
		System.out.println("访问布尔型数组第1个元素的初始值" + booleans[1]);
		System.out.println("访问布尔型数组第2个元素的初始值" + booleans[2]);
	}
}
