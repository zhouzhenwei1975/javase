package net.zzw.javase.foundational.method;

import java.util.Arrays;

/**
 * 数组操作测试类
 *
 * @author zzw dgzzw1@163.com
 * @version 2021/12/18 下午4:25
 * @since JDK11
 */
public class ArrayUtilsTest {

	public static void main(String[] args) {
		// int[] numbers = new int[] {88, 23, 45, 76, 19, 33};

		//ArrayUtils.bubbleSort(numbers);
		//numbers = null;
		//ArrayUtils.bubbleSort(numbers);

		//ArrayUtils.selectionSort(numbers);
		//int findKey = 88;
		//int result = ArrayUtils.binarySearch(numbers, findKey);
		//if (result != -1) {
		//	System.out.println(findKey + "在数组中的索引是:" + result);
		//} else {
		//	System.out.println(findKey + "在数组中不存在");
		//}

		int[] addArray = {1, 2, 3};
		System.out.println("往数组中添加指定的元素之前" + Arrays.toString(addArray));
		int[] newAddArray = ArrayUtils.add(addArray, 4);
		System.out.println("往数组中添加指定的元素之后" + Arrays.toString(newAddArray));

		int[] removeArray = {1, 2, 3, 4};
		System.out.println("根据索引删除数组中指定的元素之前" + Arrays.toString(removeArray));
		int[] newRemoveArray = ArrayUtils.remove(removeArray, 0);
		System.out.println("根据索引删除数组中指定的元素之后" + Arrays.toString(newRemoveArray));

		int[] removeElementArray = {10, 20, 30, 40};
		System.out.println("根据元素删除数组元素之前" + Arrays.toString(removeElementArray));
		removeElementArray = ArrayUtils.removeElement(removeElementArray, 20);
		System.out.println("根据元素删除数组元素之后" + Arrays.toString(removeElementArray));

	}
}
