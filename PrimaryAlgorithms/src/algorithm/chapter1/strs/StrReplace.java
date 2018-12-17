/** 
 * Project Name:PrimaryAlgorithms 
 * File Name:StrReplace.java 
 * Package Name:algorithm.chapter1.strs 
 * Date:2018年12月17日下午10:01:59 
 * Copyright (c) 2018, zhangweikai All Rights Reserved. 
 * 
*/

package algorithm.chapter1.strs;

/**
 * ClassName:StrReplace <br/>
 * Function: TODO Replace chars in a string. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年12月17日 下午10:01:59 <br/>
 * 
 * @author zhangweikai
 * @version
 * @since JDK 1.8
 * @see
 */
public class StrReplace {

	private static final Integer CC = -1;
	private static final Integer CR = 1;
	private static final Integer CD = 2;
	private static final Integer CI = 2;
	
	public static String transformAtoB(String a, String b) {
		return assembleTransformation(computeTransformTables(a, b).getOp(), a.length(), b.length());
	}

	public static StrReplaceTables computeTransformTables(String a, String b) {
		StrReplaceTables tables = new StrReplaceTables(a.length()+1, b.length()+1);
		// The cost of operation until [i,j]
		int[][] cost = tables.getCost();
		// The operation at this step
		String[][] op = tables.getOp();

		for (int i = 1; i < a.length()+1; i++) {
			cost[i][0] = i * CD;
			op[i][0] = "del"+ a.charAt(i-1);
		}
		for (int i = 1; i < b.length()+1; i++) {
			cost[0][i] = i * CI;
			op[0][i] = "ins" + b.charAt(i-1);
		}

		for (int i = 1; i < a.length()+1; i++) {
			for (int j = 1; j < b.length()+1; j++) {
				if(a.charAt(i-1) == b.charAt(j-1)) {
					cost[i][j] = cost[i-1][j-1] + CC;
					op[i][j] = "cop" + a.charAt(i-1);
				}else {
					cost[i][j] = cost[i-1][j-1] + CR;
					op[i][j] = "rep" + b.charAt(j-1);
				}
				if(cost[i-1][j]+CD < cost[i][j]) {
					cost[i][j] = cost[i-1][j]+CD;
					op[i][j] = "del" + a.charAt(i-1);
				}
				if(cost[i][j-1]+CI < cost[i][j]) {
					cost[i][j] = cost[i][j-1]+CI;
					op[i][j] = "ins" + b.charAt(j-1);
				}
			}
		}
		return tables;
	}
	
	public static String assembleTransformation(String[][] op, int i, int j) {
		if(i==0 && j == 0 ) {
			return "";
		}
		if(op[i][j].substring(0, 3).equals("cop")) {
			return assembleTransformation(op, i-1, j-1) + op[i][j].charAt(3);
		}else if (op[i][j].substring(0, 3).equals("rep")) {
			return assembleTransformation(op, i-1, j-1) + op[i][j].charAt(3);
		}else if (op[i][j].substring(0, 3).equals("del")) {
			return assembleTransformation(op, i-1, j);
		}else {
			return assembleTransformation(op, i, j-1) + op[i][j].charAt(3);
		}
		
	}

}
