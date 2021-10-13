package com.sujata.demo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Graph {

	private Map<String,List<String>> map=new HashMap<>();
	
	public void addNewVertex(String str) {
		map.put(str, new LinkedList<String>());
	}
	
	public void addNewEdge(String source,String destination,boolean bidirectional) {
		if(!map.containsKey(source))
			addNewVertex(source);
		if(!map.containsKey(destination))
			addNewVertex(destination);
		map.get(source).add(destination);
		if(bidirectional==true)
			map.get(destination).add(source);
	}
	
	public int countNoOfEdges()
	{
		Map<String, Boolean> m = new HashMap<>();
		for(String vertex : map.keySet())
		{
			for(String w : map.get(vertex))
				if(!m.containsKey(w + vertex) && !m.containsKey(vertex + w))
					m.put(vertex + w, true);
		}
			
		return m.keySet().size();
		
	}


	@Override
	public String toString() {
		StringBuilder builder=new StringBuilder();
		for(String vertex:map.keySet()) {
			builder.append(vertex.toString()+" : ");
			for(String w:map.get(vertex)) {
				builder.append(w.toString()+" ");
			}
			builder.append("\n");
		}
		return (builder.toString());
		
	}
	
	
}
