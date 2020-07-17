import java.util.*;
class binary
{  
 public static void binary(int a[],int f,int l,int key)
{  
   int mid=(f+l)/2;  
   while(f<=l)
{  
      if ( a[mid]<key)
{  
        f=m+1;     
      }
else if ( a[mid]==key)
{  
        System.out.println("Element is found at index " + mid);  
        break;  
      }
else
{  
         l=mid-1;  
      }  
      mid=(f+l)/2;  
   }  
   if ( f>l)
{  
      System.out.println("Element is not found!");  
   }  
 }  
 public static void main(String args[])
{  
        int key,n;
         Scanner sc=new Scanner(System.in);
         key=sc.nextInt();
         n=sc.nextInt();
       int a[]=new int[n];
       for(i=0;i<n;i++)
{
      a[i]=sc.nextInt();
}
        int l=arr.length-1;  
        binary(a,0,l,key);     
 }  
}  