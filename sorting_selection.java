import java.util.Scanner;
class ss{
public static void main(String[] args)
{
int i,n,j,temp;
Scanner k=new Scanner(System.in);
n=k.nextInt();
int a[]=new int[]{1,2,3,4,5};


for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
  if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}

System.out.println(a[3]);

}
}