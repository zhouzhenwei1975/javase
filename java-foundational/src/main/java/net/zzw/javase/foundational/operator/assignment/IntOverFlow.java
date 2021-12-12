package net.zzw.javase.foundational.operator.assignment;

/**
 * 整数溢出的内存原理
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/12 下午2:31
 * @since JDK11
 */
public class IntOverFlow {
	public static void main(String[] args) {

		byte value = (byte) 135;

		/*
			计算过程

			135 默认是int类型，int占据4个字节
			135 在内存中的二进制补码表示方式为	0000 0000 0000 0000 0000 0000 1000 0111
			将135强制转换成一个字节后135在内存中的二进制补码表示方式为	1000 0111
			将1000 0111 转换成原码
			根据补码求原码		补码减1得到反码	1000 0110
			反码求原码	反码的最高位不变，其他数据位取反	1111 1001 -121
		 */

		// 打印输出变量的值 十进制整数 默认是打印的原码
		System.out.println("value = " + value);
	}
}
