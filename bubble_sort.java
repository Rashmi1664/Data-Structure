import java.util.Scanner;
class ss{
public static void main(String[] args)
{
int i,n,j,temp;
Scanner k=new Scanner(System.in);
n=k.nextInt();
int a[]=new int[n];
System.out.println("Numbers before sorting");
for(i=0;i<n;i++)
{
a[i]=k.nextInt();
}
for(i=0;i<n;i++)
{
for(j=0;j<n-i-1;j++)
{
  if(a[j]>a[j+1])
{
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
for(i=0;i<n;i++)
{
System.out.println("After sorting array"+a[i]);
}
}
}