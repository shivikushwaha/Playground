import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
       Scanner in = new Scanner(System.in);
        // Get the array size
        int n = in.nextInt();
        int arr[] = new int[n];
        // Get the array elements
        for(int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
        }
        // Get the searching element 1
        int a = in.nextInt();
        // Get the search element 2
        int b = in.nextInt();
        // Initialize two varibles to store the given elements index
        int c = -1;
        int d = -1;
        // scan each element in an array
        // If element 1 and element 2 found, then store the index value 
        // Otherwise it will search till it reaches the arr_size - 1
        for(int i = 0; i < n; i++)
        {
            if(a == arr[i])
            {
                 c= i;
            }
            if(b == arr[i]){
                d = i;
            }
        }
        System.out.println(c);
        System.out.println(d);
    }
}