/** 
 * Project Name:AlgorithmPractice 
 * File Name:MergeSort.java 
 * Package Name:algorithm.chapter1.sort 
 * Date:2018年12月13日下午2:05:42 
 * Copyright (c) 2018, zhangweikai All Rights Reserved. 
 * 
*/

package algorithm.chapter1.sort;

/**
 * ClassName:MergeSort <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年12月13日 下午2:05:42 <br/>
 * 
 * @author zhangweikai
 * @version
 * @since JDK 1.8
 * @see
 */
public class MergeSort {

	public static void factorial(int[] array, int start, int end) {
		if (array.length < 2 || start >= end) {
			return;
		}
		int pos = (start + end) / 2;
		factorial(array, start, pos);
		factorial(array, pos + 1, end);
		merge(array, start, pos, end);
	}

	private static void merge(int[] array, int start, int pos, int end) {
		int[] temp = new int[end-start+1];
		int i = start;
		int j = pos+1;
		int k = 0;
		while(i<=pos&&j<=end) {
			if(array[i]<array[j]) {
				temp[k] = array[i];
				i++;
			}else {
				temp[k] = array[j];
				j++;
			}
			k++;
		}
		while(i<=pos) {
			temp[k] = array[i];
			i++;
			k++;
		}
		while(j<=end) {
			temp[k] = array[j];
			j++;
			k++;
		}
		for(int s = 0; s < temp.length; s++) {
			array[s+start] = temp[s];
		}
	}

}
