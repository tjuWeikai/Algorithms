/** 
 * Project Name:AlgorithmPractice 
 * File Name:InsertionSort.java 
 * Package Name:algorithm.chapter1.sort 
 * Date:2018年12月12日下午10:56:40 
 * Copyright (c) 2018, zhangweikai All Rights Reserved. 
 * 
*/  
  
package algorithm.chapter1.sort;  
/** 
 * ClassName:InsertionSort <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2018年12月12日 下午10:56:40 <br/> 
 * @author   zhangweikai 
 * @version   
 * @since    JDK 1.8 
 * @see       
 */
public class InsertionSort {
	
	public static void normal(int[] array) {
		if(array.length < 2) {
			return;
		}
		int temp = 0;
		for(int i = 1; i < array.length; i++) {
			temp = array[i];
			for(int j = i-1; j>-1;) {
				if(array[j]>temp) {
					array[j+1]=array[j];
					j--;
				}else {
					//make sure the key element stay at right pos
					array[j+1] = temp;
					break;
				}
			}
		}
	}
	
	public static void factorial(int[] array, int pos ) {
		if(pos == array.length ) {
			return;
		}
		int temp = 0;
		for(int i = pos - 1;i>-1;) {
			temp = array[pos];
			if(array[i]>temp) {
				array[i+1]=array[i];
				i--;
			}else {
				//make sure the key element stay at right pos
				array[i+1] = temp;
				break;
			}
		}
		factorial(array, pos+1);
	}
}
  