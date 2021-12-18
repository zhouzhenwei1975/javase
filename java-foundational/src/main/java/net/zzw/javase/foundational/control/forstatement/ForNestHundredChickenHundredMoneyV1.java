package net.zzw.javase.foundational.control.forstatement;

/**
 * 百鸡百钱第一个版本
 *
 * 小鸡的数量必须是3的倍数
 * 公鸡的数量 + 母鸡的数量+小鸡的数量 = 100鸡
 * 公鸡的数量 * 5 + 母鸡的数量 * 3 + 小鸡的数量/3 = 100文钱
 * @author zzw dgzzw1@163.com
 * @version 2021/12/15 下午11:00
 * @since JDK11
 */
public class ForNestHundredChickenHundredMoneyV1 {

	public static void main(String[] args) {
		int count = 0;
		System.out.println("公鸡数量\t\t公鸡单价\t\t母鸡数量\t\t母鸡单价\t\t小鸡数量\t\t小鸡单价");
		// 遍历公鸡
		for (int rooster = 0; rooster <= 100; rooster++) {
			// 遍历母鸡
			for (int hen = 0; hen <= 100; hen++) {
				// 遍历小鸡
				for (int chick = 0; chick <= 100; chick++) {
					count++;
					if (chick % 3 == 0 && rooster + hen + chick == 100 && rooster * 5 +
					hen * 3 + chick / 3 == 100) {
						System.out.printf("%d\t\t\t5\t\t\t%d\t\t\t3\t\t\t%d\t\t\t0.3\n", rooster, hen, chick);
					}
				}

			}
		}
		System.out.println("共循环了" + count + "次");
	}

}
