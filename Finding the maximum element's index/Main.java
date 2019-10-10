import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int k=0;
    int c=0;
    int[] a=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=s.nextInt();
    }
    k=a[0];
    for(int i=1;i<n;i++)
    {
      if(k<a[i])
      {
        k=a[i];
        c=i;
      }
    }
    System.out.print(c);
  }
}