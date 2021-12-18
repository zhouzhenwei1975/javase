package net.zzw.javase.foundational.control.forstatement;

/**
 * 模拟电梯上升，第四层不停
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/12 下午11:22
 * @since JDK11
 */
public class ForContinueElevator {
	public static void main(String[] args) {

		for (int level = 1; level <= 20; level++) {
			if (level == 4) {
				continue;
			}
			System.out.println("第" + level + "层到了");
		}
	}
}
