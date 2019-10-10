import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      int b=s.nextInt();
      int c=s.nextInt();
      int min=min1(a,b);
      int result1=gcd1(a,b,min);
      int min2=min1(result1,c);
      int result2=gcd1(result1,c,min2);
      System.out.print(result2);
	}
  public static int min1(int a,int b)
  {
    if(a>b)
    {
      return b;
    }
    else
    {
      return a;
    }
  }
  public static int gcd1(int a,int b,int min)
  {
    if(a%min==0 && b%min==0)
    {
      return min;
    }
    else
    {
      min=min-1;
      return gcd1(a,b,min);
    }
}
}