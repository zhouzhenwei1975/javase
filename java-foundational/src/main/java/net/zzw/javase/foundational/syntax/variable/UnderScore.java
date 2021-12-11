package net.zzw.javase.foundational.syntax.variable;

/**
 * Java7新特性之数值之间使用下划线
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/11 下午10:34
 * @since JDK11
 */
public class UnderScore {
	public static void main(String[] args) {
		long longValue = 100_000_000000L;
		System.out.println("longValue = " + longValue);

		double doubleValue = 3.141_5926;
		System.out.println("doubleVal = " + doubleValue);
	}
}
