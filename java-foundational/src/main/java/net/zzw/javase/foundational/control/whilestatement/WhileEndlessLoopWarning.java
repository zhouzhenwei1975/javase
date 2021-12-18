package net.zzw.javase.foundational.control.whilestatement;

/**
 * while死循环注意事项
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/12 下午11:38
 * @since JDK11
 */
public class WhileEndlessLoopWarning {

	public static void main(String[] args) {

		int i = 0;
		while (i < 50) {
			System.out.print(i + " ");
			// 记得要加,否则进入死循环
			i++;
		}
	}
}
