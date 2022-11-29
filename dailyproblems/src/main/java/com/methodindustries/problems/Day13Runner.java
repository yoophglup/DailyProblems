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


public class Day13Runner {
	public static void main(String args[]) {
		ListNode listnode5 = new ListNode(1,null);
		ListNode listnode4 = new ListNode(2,listnode5);
		ListNode listnode3 = new ListNode(3,listnode4);
		ListNode listnode2 = new ListNode(4,listnode3);
		ListNode listnode1 = new ListNode(5,listnode2);

		
		listnode1.display(listnode1);		
		listnode1=listnode1.reverseList(listnode1);
		listnode1.display(listnode1);		
		listnode1=listnode1.recursiveReverse(listnode1);
		listnode1.display(listnode1);		

		
	}
}