package net.zzw.javase.foundational.control.forstatement;

import javax.crypto.SecretKeyFactory;

/**
 * 显示时间，精确到分钟
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/15 上午12:55
 * @since JDK11
 */
public class ForNestTime {
	public static void main(String[] args) {

		// 外循环控制小时
		for (int hour = 0; hour < 24; hour++) {

			// 内循环控制分钟
			for (int minute = 0; minute < 60; minute++) {
				// 控制秒
				for (int second = 0; second < 60; second++) {
					System.out.printf("%d时%d分%d秒\n", hour, minute, second);
				}
			}
		}
	}
}
