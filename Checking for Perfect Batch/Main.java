import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=s.nextInt();
    }
    perfect(a,n);
  }
  public static void perfect(int[] list,int n)
  {
    int sum=list[0]+list[1]+list[2];
    int k=0;
    for(int i=3;i<n;i=i+3)
    {
      k=i;
      int sum2=list[k]+list[k+1]+list[k+2];
      if(sum==sum2)
      {
        System.out.print("Perfect Batch");
        break;
      }
      else
      {
        System.out.print("Not a Perfect Batch");
      }
    }
    
  }
}