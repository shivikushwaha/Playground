import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner s=new Scanner(System.in);
      String a=s.nextLine();
      String b="";
      for(int i=a.length()-1;i>=0;i--)
      {
        b=b+a.charAt(i);
      }
      if(a.equals(b))
         {
           System.out.print("Yes");
         }
         else
         {
           System.out.print("No");
         }
    } 
}