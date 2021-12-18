package net.zzw.javase.foundational.method;

/**
 * 整数相关功能测试类
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/18 下午3:58
 * @since JDK11
 */
public class NumberUtilsTest {

	public static void main(String[] args) {
		int left = 10;
		int right = 20;

		boolean result = NumberUtils.compare(left, right);
		System.out.println(result == true ? "两个整数相等" : "两个整数不相等");

		int sum = NumberUtils.sum(1, 50);
		System.out.println("1-50之间的整数和是" + sum);
	}
}
