/** 
 * Project Name:AlgorithmPractice 
 * File Name:SortArrayUtils.java 
 * Package Name:algorithm.chapter1.utils 
 * Date:2018年12月12日下午9:15:05 
 * Copyright (c) 2018, zhangweikai All Rights Reserved. 
 * 
*/

package algorithm.chapter1.utils;

import java.util.Random;

/**
 * ClassName:SortArrayUtils <br/>
 * Function: TODO Produce random arrays of int and str. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年12月12日 下午9:15:05 <br/>
 * 
 * @author zhangweikai
 * @version 0.1
 * @since JDK 1.8
 * @see
 */
public class RandomArrayUtils extends AbstractArrayUtils {

	private static final Integer DEFAULTSIZE = 10;
	private static final Integer DEFAULTSEED = 5;

	@Override
	public int[] produceIntArray(int size, int seed) {
		size = size == 0 ? DEFAULTSIZE : size;
		seed = seed == 0 ? DEFAULTSEED : seed;
		int[] nums = new int[size];
		Random r = new Random(seed);
		Random rs = new Random(seed-1);
		for(;size>0;size--) {
			if(size%2==0) {
				nums[size - 1] = r.nextInt(90);
			}else {
				nums[size - 1] = rs.nextInt(90);
			}
			
		}
		return nums;
	}

	@Override
	public String[] produceStringArray(int size) {
		
		return null;
	}

}
