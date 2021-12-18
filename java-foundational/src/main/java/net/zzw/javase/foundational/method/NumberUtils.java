package net.zzw.javase.foundational.method;

/**
 * 整数操作相关的工具类
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/18 下午3:54
 * @since JDK11
 */
public class NumberUtils {

	/**
	 * 比较两个整数是否相等
	 * @param left 第一个整数参数
	 * @param right 第二个整数参数
	 * @return 两个整数是否相等
	 */
	public static boolean compare(int left, int right) {
		return left == right;
	}

	/**
	 * 统计两个整数在一定范围内的和
	 * @param start 第一个整数参数
	 * @param end 第二个整数参数
	 * @return 两个整数在一定范围内的和
	 */
	public static int sum(int start, int end) {
		int result = 0;

		for (int i = start; i <= end; i++) {
			result += i;
		}
		return result;
	}
}
