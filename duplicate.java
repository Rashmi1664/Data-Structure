import java.util.*;
public class Main
{
public static void main(String[] args) 	
{
 int i,j,n;		
Scanner sc=new Scanner(System.in);   
 n=sc.nextInt();
int a[]=new int[n];
 for(i=0;i<n;i++)
{
  a[i]=sc.nextInt();	   
 }
for(i=0;i<n;i++)	    
{
for(j=i+1;j<n;j++)       
 {
  if(a[i]==a[j])     
    {
  System.out.print( a[i]+" ");         
  }       
 }   
 }	
}
}

