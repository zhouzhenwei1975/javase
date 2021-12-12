package net.zzw.javase.foundational.operator.logic;

/**
 * 逻辑运算符的使用
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/12 上午10:16
 * @since JDK11
 */
public class LogicBooleanConstantOperator {

	public static void main(String[] args) {
		// 逻辑与运算规则：&左右两边只要有一个false,那么运算结果就是false,例如true & false=false
		System.out.println("逻辑与的使用");
		System.out.println("true & true = " + (true & true));
		System.out.println("true & false = " + (true & false));
		System.out.println("false & true = " + (false & true));
		System.out.println("false & false = " + (false & false));

		// 逻辑或运算规则：|左右两边只要有一个true,那么运算结果就是true，例如true|false=true
		System.out.println("逻辑或的使用");
		System.out.println("true | true = " + (true | true));
		System.out.println("true | false = " + (true | false));
		System.out.println("false | true = " + (false | true));
		System.out.println("false | false = " + (false | false));

		// 逻辑异或运算规则：^左右两边相同为false,不同为true,例如trueへ true=false,trueへfalse=true
		System.out.println("逻辑异或的使用");
		System.out.println("true ^ true = " + (true ^ true));
		System.out.println("true ^ false = " + (true ^ false));
		System.out.println("false ^ true = " + (false ^ true));
		System.out.println("false ^ false = " + (false ^ false));

		// 逻辑非运算规则：取反 !true=false, !false=true
		System.out.println("!true = " + (!true));
		System.out.println("!!true = " + (!!true));
		System.out.println("!false = " + (!false));
		System.out.println("!!false = " + (!!false));
	}
}
