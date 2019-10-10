import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner s=new Scanner(System.in);
      String a=s.nextLine();
      char[] a1=a.toCharArray();
       int[] b1=new int[26];
      for(int i=0;i<a1.length;i++)
      {
        if(a1[i]>='a' && a1[i]<='z')
        {
          b1[a1[i]-97]++;
        }
        else if(a1[i]>='A' && a1[i]<='Z')
        {
          b1[a1[i]-65]++;
        }
      }
      for(int i=0;i<b1.length;i++)
      {
        if(b1[i]==0)
        {
          char k=(char)(i+'a');
          System.out.print(k+" ");
          
        }
        }
        
    }
}