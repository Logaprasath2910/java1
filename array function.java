import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]  = new int [n];
        for(int i= 0; i<= n-1; i++)
        {
            int t= sc.nextInt();
            arr[i] =t;
        }
        System.out.println(arr[0]);
        for(int i = 0;i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        
   }
}