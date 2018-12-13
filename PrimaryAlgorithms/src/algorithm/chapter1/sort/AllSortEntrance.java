/** 
 * Project Name:AlgorithmPractice 
 * File Name:AllSortEntrance.java 
 * Package Name:algorithm.chapter1.sort 
 * Date:2018年12月12日下午11:00:05 
 * Copyright (c) 2018, zhangweikai All Rights Reserved. 
 * 
*/  
  
package algorithm.chapter1.sort;

import java.util.Arrays;

import algorithm.chapter1.utils.SortArrayUtils;

/** 
 * ClassName:AllSortEntrance <br/> 
 * Function: TODO The entrance of all sort algorithm. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2018年12月12日 下午11:00:05 <br/> 
 * @author   zhangweikai 
 * @version   
 * @since    JDK 1.8 
 * @see       
 */
public class AllSortEntrance {

	public static void main(String[] args) {
		SortArrayUtils utils = new SortArrayUtils();
		int[] array1 = utils.produceIntArray(10, 9);
		int[] array2 = utils.produceIntArray(10, 7);
		
		
//		SelectSort.normal(array1);
//		SelectSort.factorial(array2, 0); 
		
//		InsertionSort.normal(array1);
//		InsertionSort.factorial(array2,1);
		
//		MergeSort.factorial(array1, 0, array1.length-1);
		
		QuickSort.factorial(array1, 0, array1.length-1);
		
		
		
		
		Arrays.stream(array1).forEach(System.out::println);
		System.out.println("-----------------");
		Arrays.stream(array2).forEach(System.out::println);
		
		
	}
	
}
  