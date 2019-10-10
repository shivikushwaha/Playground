import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      for(int i=2;i<=n;i++)
      {
        if(is_prime(i))
        {
          System.out.println(i);
        }
      }
	}
  public static boolean is_prime(int n)
  {
     boolean j=true;
    for(int i=2;i<n;i++)
    {
      if(n%i==0)
      {
        j=false;
      }
    }
    return j;
}
}