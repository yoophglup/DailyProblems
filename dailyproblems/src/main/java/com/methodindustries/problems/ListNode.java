package com.methodindustries.problems;


public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { 
	    	  this.val = val; 
	    	  this.next = next;

	    	  }
	         
	      public void display(ListNode th) {
	    	  		ListNode current=th;
		    	  	  System.out.print('[');

	    	  	  while (current != null) {
	    	  		  System.out.print(current.val);
	    	  		  current=current.next;
	    	  		  System.out.print("->");
	    	  		  
	    	  	  }
	    	  	  System.out.println("End]");
	      }    
	           
	      public ListNode reverseList(ListNode th) {
	    	  ListNode prev=null;
	    	  ListNode next=null;
	    	  ListNode current=th;	    	  
    	  	  while (current != null) {
    	  		  next = current.next;
    	  		  current.next = prev;
    	  		  prev = current;
    	  		  current=next; 	  		 
    	  	  }
    	  	  th=prev;
    	  	  return th;
	      }
	      
	      public ListNode recursiveReverse(ListNode th) {
	    	    {
	    	        if (th == null || th.next == null)
	    	            return th;	    	
	    	        ListNode rest = recursiveReverse(th.next);
	    	        th.next.next = th;	    	 
	    	        th.next = null;	    	 
	    	        return rest;
	    	    }
	    	 
	      }
}
	  	
	 
	
	

    		
