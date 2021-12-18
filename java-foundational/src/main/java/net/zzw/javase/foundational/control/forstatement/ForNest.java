package net.zzw.javase.foundational.control.forstatement;

/**
 * for循环嵌套的执行流程
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/15 上午12:43
 * @since JDK11
 */
public class ForNest {
	public static void main(String[] args) {

		// 统计外层循环的次数
		int outerCount = 0;

		// 统计内层循环的次数
		int innerCount = 0;

		// 外层循环
		for (int i = 0; i < 3; i++) {

			outerCount++;
			System.out.print("i = " + i + "\t\t");
			// 内层循环
			for (int j = 0; j < 5; j++) {
				innerCount++;
				System.out.print("j = " + j + "\t\t");
			}
			System.out.println();
		}
		System.out.println("外层循环执行的次数" + outerCount + "次");
		System.out.println("内层循环执行的次数" + innerCount + "次");
	}
}
