import java.util.*;
public class staet 
{  
   class Node
    {  
        int data;  
        Node next;  
      
     public Node(int d) 
        {  
           data = d;  
           next = null;  
        }  
    }  
    Node head = null;  
    Node tail = null;  
     
  public void add(int data) 
    {  
        Node new_node = new Node(data);  
       if(head == null)
        {  
            head = new_node;  
            tail = new_node;  
        }  
        else 
        {  
            Node temp = head;  
            head = new_node;  
            head.next = temp;  
        }  
    }  
    public void display() 
    {  
        Node current = head;  
        if(head == null) 
        {  
            System.out.println("List is empty");  
        }  
        while(current != null) 
        {   
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  
  
    public static void main(String[] args)
    {
    	
    staet sList = new staet(); 
    sList.add(1);  
    sList.add(2);  
    sList.add(3);   
    sList.add(4);  
    
    sList.display();  
}  
}  
