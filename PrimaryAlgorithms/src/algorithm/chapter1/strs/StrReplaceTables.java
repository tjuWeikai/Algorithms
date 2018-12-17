/** 
 * Project Name:PrimaryAlgorithms 
 * File Name:IntArrays.java 
 * Package Name:algorithm.chapter1.strs 
 * Date:2018年12月17日下午11:01:39 
 * Copyright (c) 2018, zhangweikai All Rights Reserved. 
 * 
*/  
  
package algorithm.chapter1.strs;

/** 
 * ClassName:IntArrays <br/> 
 * Function: TODO For str replace. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2018年12月17日 下午11:01:39 <br/> 
 * @author   zhangweikai 
 * @version   
 * @since    JDK 1.8 
 * @see       
 */
public class StrReplaceTables {
	
	private int[][] cost;
	private String[][] op;
	
	public StrReplaceTables(int i, int j) {
		this.cost = new int[i][j];
		this.op = new String[i][j];
	}

	public int[][] getCost() {
		return cost;
	}

	public void setCost(int[][] cost) {
		this.cost = cost;
	}

	public String[][] getOp() {
		return op;
	}

	public void setOp(String[][] op) {
		this.op = op;
	}

}
  