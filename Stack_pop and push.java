package stack_DS;

public class stack 
   {
	static int max =1000; 
    int top; 
    int a[] =new int[max]; 
  
    boolean isEmpty() 
    { 
        return (top<0); 
    } 
    stack() 
    { 
        top = -1; 
    } 
  
    boolean push(int x) 
    { 
        if (top>=(max-1))
        { 
            System.out.println("Stack Overflow"); 
            return false; 
        } 
        else 
        { 
            a[++top]=x; 
            System.out.println(x + " pushed into stack"); 
            return true; 
        } 
    } 
  
    int pop() 
    { 
        if (top < 0)
        { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else { 
            int x = a[top--]; 
            return x; 
        } 
    } 
  
    int peek() 
    { 
        if (top < 0) 
        { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else 
        { 
            int x = a[top]; 
            return x; 
        } 
    } 

    public static void main(String args[]) 
    { 
        stack s = new stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
} 