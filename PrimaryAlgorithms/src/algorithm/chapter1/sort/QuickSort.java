/** 
 * Project Name:AlgorithmPractice 
 * File Name:QuickSort.java 
 * Package Name:algorithm.chapter1.sort 
 * Date:2018年12月13日下午3:00:51 
 * Copyright (c) 2018, zhangweikai All Rights Reserved. 
 * 
*/  
  
package algorithm.chapter1.sort;  
/** 
 * ClassName:QuickSort <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2018年12月13日 下午3:00:51 <br/> 
 * @author   zhangweikai 
 * @version   
 * @since    JDK 1.8 
 * @see       
 */
public class QuickSort {

	public static void factorial(int[] array, int low, int high) {
		if (low>=high) {
			return;
		}
		int q = partition(array, low, high);
		factorial(array, low, q-1);
		factorial(array, q+1, high);
		
	}
	
	private static int partition(int[] array, int low, int high) {
		int key = array[low];
		while(low<high) {
			while(array[high]>=key&&high>low) {
				high--;
			}
			array[low]=array[high];
			while(array[low]<=key&&high>low) {
				low++;
			}
			array[high] = array[low];
		}
		array[high] = key;
		return high;
	}
	
}
  