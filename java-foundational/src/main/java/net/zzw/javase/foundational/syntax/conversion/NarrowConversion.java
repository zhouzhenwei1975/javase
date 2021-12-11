package net.zzw.javase.foundational.syntax.conversion;

/**
 * 强制类型转换
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/11 下午11:25
 * @since JDK11
 */
public class NarrowConversion {
	public static void main(String[] args) {
		// 取值范围较小的数据类型 变量名 = (取值范围较小的数据类型) 取值范围较大的数据类型的数值;
		double salary = 10000.0;
		System.out.println("salary = " + salary);
		int intSalary = (int) salary;
		System.out.println("intSalary = " + intSalary);
	}
}
