import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner s=new Scanner(System.in);
      String a=s.nextLine();
      int end=a.length()-1;
      int start=0;
      reverse_string(a,start,end);
    }
    // Function to reverse a string
    public static void reverse_string(String sb, int start_idx, int end_idx)
    {
        // Type your code here
       String[] word=sb.split(" ");
      for(int i=word.length-1;i>=0;i--)
      {
        System.out.print(word[i]);
        if(i!=0)
        {
          System.out.print(" ");
        }
      }
        
    }
}