import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int n=s.nextInt();
    while(n>=100)
    {
      n=n/10;
    }
    int num=n;
    int seconddigit=num%10;
    System.out.println(seconddigit);
  }
}