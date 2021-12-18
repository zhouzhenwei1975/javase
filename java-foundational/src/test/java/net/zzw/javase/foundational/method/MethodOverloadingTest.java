package net.zzw.javase.foundational.method;

/**
 * 方法重载的测试案例
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/18 下午5:25
 * @since JDK11
 */
public class MethodOverloadingTest {
	public static void main(String[] args) {
		MethodOverloading.compare(100L, 100L);
		MethodOverloading.compare(100, 100);
		MethodOverloading.compare(true, false);
	}
}
