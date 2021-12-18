package net.zzw.javase.foundational.method;

/**
 * 打印工具类测试类
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/18 下午4:15
 * @since JDK11
 */
public class PrintUtilsTest {

	public static void main(String[] args) {
		/*
		PrintUtils.printContent(1, "跟光磊学Java");
		PrintUtils.printContent(3, "跟光磊学Java");
		PrintUtils.printContent(-3, "跟光磊学Java");
		 */

		String[] books = {"OnJava8", "Java核心技术第十一版", "Java编程的逻辑"};
		// PrintUtils.printContent(books);
		PrintUtils.printContent();
		PrintUtils.printContent("OnJava8");
		PrintUtils.printContent("Java编程思想", "Java设计模式");

	}
}
