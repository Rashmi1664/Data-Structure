import java.util.*;

public class search 
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
            tail.next = new_node;  
            tail = new_node;  
        }  
    }  
    public void search(int data)
    {  
        Node current = head;  
        int i = 1;  
        boolean flag = false;  
       
        if(head==null) {  
            System.out.println("List is empty");  
        }  
        else 
        {  
            while(current!=null) 
            {   
                if(current.data==data) 
                {  
                    flag = true;  
                    break;  
                }  
                i++;  
                current = current.next;  
            }  
        }  
        if(flag)  
             System.out.println("Element is present in the list at the position : " + i);  
        else  
             System.out.println("Element is not present in the list");  
    }  
    public static void main(String[] args)
    {  
     search list = new search();  
  
        list.add(1);  
        list.add(2);  
        list.add(3);  
        list.add(4);  
        list.search(2);  
    }
    }  
