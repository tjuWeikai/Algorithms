/** 
 * Project Name:AlgorithmPractice 
 * File Name:SelectSort.java 
 * Package Name:algorithm.chapter1.sort 
 * Date:2018年12月12日下午9:02:56 
 * Copyright (c) 2018, zhangweikai All Rights Reserved. 
 * 
*/

package algorithm.chapter1.sort;

/**
 * ClassName:SelectSort <br/>
 * Function: TODO Sort nums by Selection. <br/>
 * Reason: TODO nothing. <br/>
 * Date: 2018年12月12日 下午9:02:56 <br/>
 * 
 * @author zhangweikai
 * @version
 * @since JDK 1.8
 * @see
 */
public class SelectSort {

	public static void normal(int[] array) {
		if (array.length == 0) {
			return;
		}
		int temp = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[i]) {
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
	}

	public static void factorial(int[] array, int pos) {
		int temp = 0;
		// the basic situation
		if (pos == array.length - 1) {
			return;
		}
		for (int i = pos + 1; i < array.length; i++) {
			if (array[i] < array[pos]) {
				temp = array[pos];
				array[pos] = array[i];
				array[i] = temp;
			}
		}
		factorial(array, pos + 1);
	}

}
