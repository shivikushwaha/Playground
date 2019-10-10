import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      int k=0;
      int[] arr=new int[a];
      int sum=0,sum1=0;
      for(int i=0;i<a;i++)
      {
        arr[i]=s.nextInt();
        sum1=sum1+arr[i];
      }
      for(int i=0;i<a;i++)
      {
        int flag=0;
        for(int j=i+1;j<a;j++)
        {
          if(arr[i]==arr[j])
          {
            flag=1;
          }
        }
        if(flag==1)
        {
          k=arr[i];
          break;
        }
      }
        sum=a*(a+1)/2;
      int diff=sum-sum1;
      int num=diff+k;
      System.out.print(num);
    }
}