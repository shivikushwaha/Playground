import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      int b=s.nextInt();
      int c=s.nextInt();
      int result=grtoftwo(a,b);
      int grtthree=grtofthree(result,c);
      System.out.print(grtthree);
	}
  public static int grtoftwo(int a,int b)
  {
    int result;
    if(a>b)
    {
      result=a;
      return result;
    }
    else
    {
      result=b;
      return result;
    }
  }
  public static int grtofthree(int result,int c)
  {
    int result1;
    if(result>c)
    {
      result1=result;
      return result1;
    }
    else
    {
      result1=c;
      return c;
    }
  }
}