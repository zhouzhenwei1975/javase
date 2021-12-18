package net.zzw.javase.foundational.control;

import java.util.Random;

/**
 * 随机数测试案例
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/14 下午11:56
 * @since JDK11
 */
public class RandomIntTest {
	public static void main(String[] args) {
		/*
			任意区间随机数公式
			(max - min + 1) - min
		 */
		Random random = new Random();
		int value = random.nextInt(2);
		System.out.println("随机数是" + value);
		int max = 350;
		int min = 280;
		for (int i = 0; i < 50; i++) {
			value = random.nextInt(max -min + 1) + min;
			if (value == 280 || value == 350) {
				System.out.println(value);
				break;
			}
		}
	}
}
