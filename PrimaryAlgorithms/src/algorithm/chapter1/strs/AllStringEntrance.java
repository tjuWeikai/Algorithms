/** 
 * Project Name:PrimaryAlgorithms 
 * File Name:AllStringEntrance.java 
 * Package Name:algorithm.chapter1.strs 
 * Date:2018年12月16日下午9:43:44 
 * Copyright (c) 2018, zhangweikai All Rights Reserved. 
 * 
*/  
  
package algorithm.chapter1.strs;  
/** 
 * ClassName:AllStringEntrance <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2018年12月16日 下午9:43:44 <br/> 
 * @author   zhangweikai 
 * @version   
 * @since    JDK 1.8 
 * @see       
 */
public class AllStringEntrance {
	
	public static void main(String[] args) {
		String a = "CATCGA";
		String b = "GTACCGTCA";
		System.out.println(LCS.getLCS(a, b));
		System.out.println(StrReplace.transformAtoB(a, b));
	}

}
  