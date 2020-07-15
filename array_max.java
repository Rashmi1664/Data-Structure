import java.util.Scanner;
class arr1{
public static void main(String[] args)
{
int i,max=0;
Scanner k=new Scanner(System.in);
int arr[]=new int[3];

for(i=0;i<3;i++)
{
   arr[i]=k.nextInt();

}
for(i=0;i<3;i++)
{
  if(arr[i]>max)
{
   max=arr[i];
}
}
 System.out.println("Max element in array is "+max);
k.close();
}
}