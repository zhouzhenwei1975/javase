package net.zzw.javase.foundational.method;

/**
 * 打印工具类
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/18 下午4:12
 * @since JDK11
 */
public class PrintUtils {
	/**
	 * 实现不定次数和不定内容的数据打印
	 * @param count 需要打印次数
	 * @param content 需要打印的内容
	 */
	public static void printContent(int count, String content) {
		// 对传入参数进行判断
		if (count > 0) {
			for (int i = 0; i < count; i++) {
				System.out.println(content);
			}
		} else {
			System.out.println("count必须大于0");
		}
	}

	/**
	 * 打印指定的内容
	 * @param contents
	 */
	public static void printContent(String... contents) {
		for (int i = 0; i < contents.length; i++) {
			System.out.println(contents[i]);
		}
	}
}
