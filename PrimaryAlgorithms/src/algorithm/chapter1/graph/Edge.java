/** 
 * Project Name:PrimaryAlgorithms 
 * File Name:Edge.java 
 * Package Name:algorithm.chapter1.graph 
 * Date:2018年12月15日下午9:14:46 
 * Copyright (c) 2018, zhangweikai All Rights Reserved. 
 * 
*/  
  
package algorithm.chapter1.graph;  
/** 
 * ClassName:Edge <br/> 
 * Function: TODO Edge of directed graph. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2018年12月15日 下午9:14:46 <br/> 
 * @author   zhangweikai 
 * @version   
 * @since    JDK 1.8 
 * @see       
 */
public class Edge {

	private int weight;
	private Vertex start;
	private Vertex end;
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Vertex getStart() {
		return start;
	}
	public void setStart(Vertex start) {
		this.start = start;
	}
	public Vertex getEnd() {
		return end;
	}
	public void setEnd(Vertex end) {
		this.end = end;
	}
}
  