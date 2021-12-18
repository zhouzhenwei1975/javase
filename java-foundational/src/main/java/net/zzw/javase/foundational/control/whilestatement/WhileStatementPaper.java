package net.zzw.javase.foundational.control.whilestatement;

/**
 * 折纸
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/14 下午11:47
 * @since JDK11
 */
public class WhileStatementPaper {
	public static void main(String[] args) {
		// 珠峰高度8848.86米
		// 一张纸厚度是0.1毫米，折多少次超过珠峰高度

		int hillHeight = 88488600;
		int paper = 1;
		// 	次数
		int twice = 0;
		while (paper <= hillHeight) {
			paper *= 2;
			twice++;
		}
		System.out.println("折" + twice + "次，肖前纸张的高度是" + paper + "毫米");
	}
}
