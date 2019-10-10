import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int num=n-1;
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=num;j++)
        {
          System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++)
        { 
          System.out.print("*");
        }
        num=num-1;
        System.out.println();
      }       
	}
}