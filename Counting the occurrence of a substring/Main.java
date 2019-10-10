import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner s=new Scanner(System.in);
    String a=s.nextLine();
    String b=s.nextLine();
    int c=a.length();
    int d=b.length();
    int count=0;
    for(int i=0;i<c-d+1;i++)
    {
      int flag=0;
      for(int j=0;j<d;j++)
      {
        if(a.charAt(i+j)!=b.charAt(j))
        {
          flag=1;
        }
      }
      if(flag==0)
      {
        count=count+1;
      }
    }
    System.out.print(count);
  } 
}