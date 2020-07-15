import java.util.*;

public class Main

{
	
public static void main(String[] args) 
	
{
		
int n,i;
		
		
Scanner sc=new Scanner(System.in);
		
n=sc.nextInt();
		
		
int a[]=new int[n];
		
		
for(i=0;i<n;i++)
		
{
		    
a[i]=sc.nextInt();
		
}
		
Arrays.sort(a);
		
		
for(i=0;i<n;i++)
		
{
		    
System.out.print(a[i]+" ");
		
}
	
}

}
