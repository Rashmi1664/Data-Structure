package stack_DS;

public class stack {
	StackNode root;
	
	 static class StackNode{ 
	        int data; 
	        StackNode next; 
	        StackNode(int d) 
	        { 
	            data=d;
	        } 
	    }
	 public boolean eampty()
	 {
		 if(root==null)
			 return true;
		 else
			 return false;
	 }
	 public void push(int data)
	 {
		 StackNode new_node=new StackNode(data);
		 if(root==null)
		root=new_node;
		 
		 else
		 {
			 StackNode temp=root;
			 root=new_node;
			 new_node.next=temp;
		 }
		 System.out.println(data+"Push to stack");
	 }
	 public int pop()
	 {
		 int popped=Integer.MIN_VALUE;
		 if(root==null)
		 {
			 System.out.println("Stack is eampty");
		 }
		 else
		 {
			 popped=root.data;
			 root=root.next;
		 }
				 return popped;
	 }
	 public int peek() 
	    { 
	        if (root == null) 
	        { 
	         System.out.println("Stack is empty"); 
	         return Integer.MIN_VALUE; 
	        } 
	        else 
	        { 
	            return root.data; 
	        } 
	    } 

	public static void main(String[] args) 
	{
		stack sll = new stack(); 
		
		sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
        System.out.println("Top element is " + sll.peek()); 

	}

}
