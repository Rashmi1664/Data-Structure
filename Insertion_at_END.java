import java.util.*;
public class list
{
Node head;
static class Node
	{
	   int data;
	   Node next;
	   
	   Node(int d)
	   {
		   data=d;
		   next=null;
	   }
	}
	public static LinkedList insert(LinkedList list,int data)
	{
		Node new_node=new Node(data);
		new_node.next=null;
		
		if (list.head==null) 
		{ 
            list.head=new_node; 
        } 
        else 
        {  
            Node last=list.head; 
            while (last.next!=null) 
            { 
                last=last.next; 
            } 
            last.next=new_node; 
        } 
        return list; 
	}
   
	 public static void display(LinkedList list) 
	    { 
	        Node currNode = list.head; 
	        
	        System.out.print("LinkedList: ");  
	        
	        while (currNode!=null) 
	        { 
	            System.out.print(currNode.data + " "); 
	            currNode=currNode.next; 
	        } 
	    } 
	 
	public static void main(String[] args)
	{
		List list = new List(); 
		
		list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
       display(list);
	}

}
