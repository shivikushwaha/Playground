import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int sq=square(n);
      System.out.print(sq);
    }
  public static int square(int n)
  {
    int a=n*n;
    return a;
  }

}