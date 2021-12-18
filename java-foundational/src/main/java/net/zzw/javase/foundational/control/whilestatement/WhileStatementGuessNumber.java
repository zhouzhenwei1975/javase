package net.zzw.javase.foundational.control.whilestatement;

import java.util.Random;
import java.util.Scanner;

/**
 * 猜数字
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/15 上午12:22
 * @since JDK11
 */
public class WhileStatementGuessNumber {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Random random = new Random();
		int randomNumber = random.nextInt(100) + 1;
		// 统计猜的次数
		int count = 0;
		while (true) {
			System.out.println("请输入你猜的数字?");
			int guessNumber = input.nextInt();
			count++;
			if (guessNumber == randomNumber) {
				System.out.println("恭喜你猜对了,总共猜了" + count + "次");
				break;
			} else if (guessNumber > randomNumber) {
				System.out.println("太大了");
			} else if (guessNumber < randomNumber) {
				System.out.println("太小了");
			}
		}
	}
}
