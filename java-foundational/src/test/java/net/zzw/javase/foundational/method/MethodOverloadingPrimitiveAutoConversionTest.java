package net.zzw.javase.foundational.method;

/**
 * 方法重载与基本数据类型自动类型转换测试
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/18 下午7:02
 * @since JDK11
 */
public class MethodOverloadingPrimitiveAutoConversionTest {

	public static void main(String[] args) {
		MethodOverloadingPrimitiveAutoConversion.invoke(123);
		MethodOverloadingPrimitiveAutoConversion.invoke(123L);
		MethodOverloadingPrimitiveAutoConversion.invoke((byte) 123);
		MethodOverloadingPrimitiveAutoConversion.invoke((short) 123);
		MethodOverloadingPrimitiveAutoConversion.invoke(100, 200);
	}
}
