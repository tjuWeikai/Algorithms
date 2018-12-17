/** 
 * Project Name:PrimaryAlgorithms 
 * File Name:LCS.java 
 * Package Name:algorithm.chapter1.strs 
 * Date:2018年12月16日下午9:24:04 
 * Copyright (c) 2018, zhangweikai All Rights Reserved. 
 * 
*/

package algorithm.chapter1.strs;

/**
 * ClassName:LCS <br/>
 * Function: LCS. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年12月16日 下午9:24:04 <br/>
 * 
 * @author zhangweikai
 * @version
 * @since JDK 1.8
 * @see
 */
public class LCS {
	
	public static String getLCS(String a, String b) {
		return assembleLCSFactorial(a, b, computeLCS(a, b), a.length()-1,b.length()-1 );
	}

	public static int[][] computeLCS(String a, String b) {

		int[][] l = new int[a.length()][b.length()];
		// Compute the length of lcs, genus.
		for (int i = 1; i < a.length(); i++) {
			for (int j = 1; j < b.length(); j++) {
				if (a.charAt(i) == b.charAt(j)) {
					l[i][j] = l[i - 1][j - 1] + 1;
				} else {
					l[i][j] = l[i - 1][j] > l[i][j - 1] ? l[i - 1][j] : l[i][j - 1];
				}
			}
		}
		System.out.println(l[a.length() - 1][b.length() - 1]);
		return l;
	}

	/**
	 * 
	
	 * <p>Title: assembleLCSFactorial</p>  
	
	 * <p>Description: After m+n times of call, i or j must minus to 0, so the time complex is O(m+n)</p>  
	
	 * @param a
	 * @param b
	 * @param l
	 * @param i
	 * @param j
	 * @return
	 */
	public static String assembleLCSFactorial(String a, String b,int[][] l, int i, int j) {
		
		if(l[i][j]==0) {
			return "";
		}
		if (a.charAt(i) == b.charAt(j)) {
			return assembleLCSFactorial(a, b, l, i-1, j-1)+a.charAt(i);
		}else {
			if(l[i-1][j]>l[i][j-1]) {
				return assembleLCSFactorial(a, b, l, i-1, j);
			}else {
				return assembleLCSFactorial(a, b, l, i, j-1);
			}
		}
	}

}
