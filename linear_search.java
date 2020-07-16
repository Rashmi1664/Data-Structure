import java.util.*;



public class Main

{
   
 public static int linear(int a[],int num)
	
{
	    
int i;
	    
for(i=0;i<a.length;i++)
		
{
		    
if(a[i]==num)
		    
{
		        
return i;
		   
}
		   
		
}
		 
return -1;
	
}

	
	
public static void main(String[] args)
	
{
		
int n,num,i;
		
		
Scanner sc=new Scanner(System.in);
		
n=sc.nextInt();
		
System.out.println("Enter the number you want to search");
		
num=sc.nextInt();
		
		
int a[]=new int[n];
		
for(i=0;i<n;i++)
		
{
		   
 a[i]=sc.nextInt();
		
}
		
    	
int k=linear(a,num);
	
	   
 if(k == -1)
		   
 System.out.print("Number not found");
		
else
		   
 System.out.print("Number found at "+ i);

}

}

