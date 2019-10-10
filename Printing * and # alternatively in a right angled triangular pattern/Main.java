import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      int n=in.nextInt();
      int a=0;
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=i;j++)
        {
          if(a==0)
          {
            System.out.print("*");
            a=1;
          }
          else
          {
            System.out.print("#");
            a=0;
          }
        }
        System.out.println();
      }
    }
}