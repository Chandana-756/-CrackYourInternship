import java.io.*;
import java.util.*;

public class Main{
    public static int minCostToMakeElementEqual(int a[], int n)
    {
        int y; 
        
        if (n % 2 == 1) 
          y = a[n / 2];
        else
          y = (a[n / 2] + a[(n - 2) / 2]) / 2; 
        
        int s = 0; 
        for(int i = 0; i < n; i++) s += Math.abs(a[i] - y); 
        return s; 
        
    }
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(minCostToMakeElementEqual(arr, n));
    }
}

Time Complexity: O(nlogn)
Space Complexity: O(1)
