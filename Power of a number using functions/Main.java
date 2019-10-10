
import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      double n=s.nextDouble();
      double m=s.nextDouble();
       int power=power(n,m);
       System.out.print(power);
   }
     public static int power(double n,double m)
       {
           int p=(int)Math.pow(n,m);
          return p;
	   }
	}