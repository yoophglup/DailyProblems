package com.methodindustries.problems;

import java.util.HashMap;
import java.util.Stack;

public class Day11 {
	
	public static char bracket(char c) {
		if (c==']') {return '[';}
		if (c==')') {return '(';}
		if (c=='}') {return '{';}
	return ' ';	
	}
	
	public static boolean isvalid(String s) {
        Stack<Character> stack = new Stack<Character>();

		for (char x : s.toCharArray()) {
			if (x=='(' || x=='{' || x=='[') {
					stack.push(x);
			}else{
				if (!stack.isEmpty()) {
				if (bracket(x)==stack.lastElement()) {					
					System.out.println("Good Bracket");
					stack.pop();
				}else {
					System.out.println("bad bracket");
					return false;
				}
				}else {
					System.out.println("Ending bracket without an open "+x);
					return false;
				}
			}
		}
			if (stack.isEmpty()) {
				System.out.println("Empty stack all brackets closed");
				return true;
			}else {
				System.out.println("Stack is not empty open bracket exist : "+stack.lastElement());

				return false;
			}
	}
}
    		
