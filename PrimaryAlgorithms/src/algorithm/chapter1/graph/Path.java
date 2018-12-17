/** 
 * Project Name:PrimaryAlgorithms 
 * File Name:Path.java 
 * Package Name:algorithm.chapter1.graph 
 * Date:2018年12月15日下午9:30:13 
 * Copyright (c) 2018, zhangweikai All Rights Reserved. 
 * 
*/  
  
package algorithm.chapter1.graph;  
/** 
 * ClassName:Path <br/> 
 * Function: TODO Path of directed graph. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2018年12月15日 下午9:30:13 <br/> 
 * @author   zhangweikai 
 * @version   
 * @since    JDK 1.8 
 * @see       
 */
public class Path {

	private String name;
	private Vertex[] vertices;
	private Edge[] edges;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Vertex[] getVertices() {
		return vertices;
	}
	public void setVertices(Vertex[] vertices) {
		this.vertices = vertices;
	}
	public Edge[] getEdges() {
		return edges;
	}
	public void setEdges(Edge[] edges) {
		this.edges = edges;
	}
	
}
  