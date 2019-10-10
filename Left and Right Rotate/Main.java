import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
    Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int[] arr=new int[n];
     for(int i=0;i<n;i++)
     {
       arr[i]=s.nextInt();
     }
    int rotations=s.nextInt();
    evenRotations(n,arr,rotations);
    oddRotations(n,arr,rotations);
    for(int i=0;i<n;i++)
    {
      System.out.print(arr[i]+" ");
    }
  	}
  public static void evenRotations(int n,int[] arr,int rotations)
  {
    int start=1;
    int last;
    if(n%2==0)
    {
      last=n-1;
    }
    else
    {
      last=n-2;
    }
    for(int i=1;i<=rotations;i++)
    {
      int temp=arr[1];
      for(int j=3;j<=last;j=j+2)
      {
        arr[j-2]=arr[j];
      }
      arr[last]=temp;
    }
  }
  public static void oddRotations(int n,int[] arr,int rotations)
  {
    int start=0;
    int last;
    if(n%2!=0)
    {
      last=n-1;
    }
    else
    {
      last=n-2;
    }
    for(int i=1;i<=rotations;i++)
    {
      int temp=arr[last];
      for(int j=last-2;j>=0;j=j-2)
      {
        arr[j+2]=arr[j];
      }
      arr[start]=temp;
    }
  }
        
}