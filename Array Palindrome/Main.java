import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      int[] arr=new int[a];
      int left=0;
      int flag=0;
      int right=arr.length-1;
      for(int i=0;i<a;i++)
      {
        arr[i]=s.nextInt();
      }
        for(int i=0;i<a;i++)
        {
          if(left<=right)
          {
           if(left!=right)
          {
            left++;
             right--;
             flag=1;
          }
          else
          {
            left++;
            right--;
            flag=0;
          }
        }
        }
      if(flag==1)
          {
            System.out.print("Yes");
            
          }
          else
          {
            System.out.print("No");
          }
    }
}