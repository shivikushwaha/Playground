import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner s=new Scanner(System.in);
      char ch=s.next().charAt(0);
      int a=s.nextInt();
      if(ch>='a' && ch<='z')
      {
      int asci=ch-a+26;
      char u=(char)asci;
      System.out.print(u);
      }
      else if(ch>='A' && ch<='Z')
      {
        int asci=ch-a;
      char v=(char)asci;
      System.out.print(v);
      }
      
    }
}