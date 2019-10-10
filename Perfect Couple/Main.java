import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int arr[] = new int[n];
       for(int i = 0;i<n; i++){
           arr[i] = s.nextInt();
       }
       int a = s.nextInt();
       perfect(arr, n, a);
    }
    public static void perfect(int[] arr,int n, int a)
    {
        for(int i = 0; i<n; i++)
        {
            for(int j= i+1;j<n; j++)
            {
                int sum = arr[i] + arr[j];
                if(sum ==a)
                {
                    System.out.println(arr[i]+","+" "+arr[j]);
                }
            }
        }
    }
}