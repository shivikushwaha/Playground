import java.util.*;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      int[] arr=new int[a];
      int[] count=new int[a];
      int count1=0;
      int k=0;
      for(int i=0;i<a;i++)
      {
        arr[i]=s.nextInt();
      }
      for(int j=0;j<a;j++)
      {
        if(arr[j]==1)
        {
          count1++;
        }
        else
        {
          count[k]=count1;
          k++;
        }
      }
      int max=0;
      for(int l=0;l<a;l++)
      {
        if(max<count[l])
        {
          max=count[l];
        }
      }
      System.out.print(max);
      
    }
}