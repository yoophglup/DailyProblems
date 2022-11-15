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
	              	    	  
	      public void reverseList(ListNode th) {
	    	  ListNode pointer=th;
	    	  ListNode prev=null;
	    	  ListNode next=th.next;
	    	  ListNode current=th;
    	  	  while (pointer != null) {
    	  		  
    	  		 System.out.println(pointer.val);
    	  		 prev=current;
    	  		 current=pointer;
    	  		 current.next=prev;
    	  		 pointer=pointer.next;
    	  		 
    	  		 
    	  		 
    	  		 
    	  	  }

	      }
}
	  	
	 
	
	

    		
