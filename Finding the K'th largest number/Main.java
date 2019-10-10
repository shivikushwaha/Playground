import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=s.nextInt();
      }
      for(int i=0;i<n;i++)
      {
        int largest=arr[i];
        for(int j=i+1;j<n;j++)
        {
          if(largest<arr[j])
          {
            largest=arr[j];
            arr[j]=arr[i];
            arr[i]=largest;
          }
        }
      }
      int k=s.nextInt();
      System.out.print(arr[k-1]);
        
    }   
}