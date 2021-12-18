package net.zzw.javase.foundational.control.forstatement;

/**
 * for循环输出20到65岁不含正在工作
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/12 下午11:15
 * @since JDK11
 */
public class ForBreakDoWork {

	public static void main(String[] args) {
		// 统计循环了多少次的变量
		int count = 0;

		for (int age = 0; age <= 100; age++) {
			count++;
			if (age == 65) {
				System.out.println("我退休了");
				break;
			}
			if (age >= 20) {
				System.out.println(age + "正在工作");
			}
		}
		System.out.println("循环一共执行了" + count + "次");
	}
}
