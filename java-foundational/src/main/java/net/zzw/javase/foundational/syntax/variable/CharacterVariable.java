package net.zzw.javase.foundational.syntax.variable;

/**
 * 字符型变量的定义和使用
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/11 下午10:43
 * @since JDK11
 */
public class CharacterVariable {
	public static void main(String[] args) {
		char ch = 'a';
		System.out.println("ch = " + ch);
		// 小写字符a 对应的Unicode编码值是97
		// 大写字符A 对应的Unicode编码值是65
		// 字符0 对应的Unicode编码值是48
		ch = 97;
		System.out.println("ch = " + ch);

		char zero = '\u0030';
		System.out.println("zero = " + zero);

		char chinese = '周';
		System.out.println("chinese = " + chinese);

		// 转义字符
		// 换行
		char newLine = '\n';
		System.out.println("Hello" + newLine + "World");

		// 路径转义
		char path = '\\';
		System.out.println("path = " + path);

		char tab = '\t';
		System.out.println("Hello" + tab + "World");
	}
}
