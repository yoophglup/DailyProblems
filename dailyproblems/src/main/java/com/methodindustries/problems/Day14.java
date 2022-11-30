package com.methodindustries.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Day14 {
	
	public static void findLCApath(Integer[] treeroot, int point) {

		List<Integer> path1 = new ArrayList<>();
		List<Integer> path2 = new ArrayList<>();
		
		int root=treeroot[0];
		
		for (int i=1;i<treeroot.length-1;i++) {
			System.out.println(treeroot[i]);
			
			
			}
		
	
		
	}
	
    public static void findLCA(Integer[] treeroot,int pa, int pb) {
    	
    	
    	Day14BinNode binnode=new Day14BinNode(treeroot[0]);
    	for (int i=1;i<treeroot.length-1;i++) {
    		binnode.add(binnode,treeroot[i]);
    	
    	
    }

    }
}
    		
