/** 
 * Project Name:PrimaryAlgorithms 
 * File Name:GraphOperation.java 
 * Package Name:algorithm.chapter1.graph 
 * Date:2018年12月15日下午9:29:48 
 * Copyright (c) 2018, zhangweikai All Rights Reserved. 
 * 
*/  
  
package algorithm.chapter1.graph;  
/** 
 * ClassName:GraphOperation <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2018年12月15日 下午9:29:48 <br/> 
 * @author   zhangweikai 
 * @version   
 * @since    JDK 1.8 
 * @see       
 */
public interface GraphOperation {
	
	Path getShortestPath(Vertex s, Vertex p, DirectedGraph graph);

}
  