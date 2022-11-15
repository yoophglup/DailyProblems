package com.methodindustries.problems;


//Given the head of a singly linked list, reverse the list, and return
//the reversed list.

//Example 1:
//Input: head = [1,2,3,4,5] ie 1 -> 2 -> 3 -> 4 -> 5
//Output: [5,4,3,2,1] ie 5 -> 4 -> 3 -> 2 -> 1
//
//Example 2:
//Input: head = [1,2] ie 1 -> 2
//Output: [2,1] ie 2 -> 1
//
//Example 3:
//Input: head = []
//Output: []



/**
* Definition for singly-linked list.
* public class ListNode {
*     int val;
*     ListNode next;
*     ListNode() {}
*     ListNode(int val) { this.val = val; }
*     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
* }
*/


public class Day12Runner {
	public static void main(String args[]) {
		ListNode listnode = new ListNode(5);
		listnode=new ListNode(4,listnode);
		listnode=new ListNode(3,listnode);
		listnode=new ListNode(2,listnode);
		listnode=new ListNode(1,listnode);
		Day12.reverseSingly(listnode);
	}
}