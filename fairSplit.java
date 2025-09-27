import java.util.*;
class Main {
    public static int fairSplits(int arr[], int n)
    {
        int totalSum = 0;
        int count = 0;
        for(int i=0;i<n;i++) totalSum += arr[i];
        int prefixSum = 0;
        int suffixSum;
        int difference;
        for(int i=0;i<n-1;i++)
        {
            prefixSum += arr[i];
            suffixSum = totalSum - prefixSum;
            difference = Math.abs(prefixSum - suffixSum);
            if (difference % 2 == 0) count++;
        }
        return count;
    }
    public static void main(String[] args) {
      int n = 5;
      int arr[] = {10, 10, 3, 7, 6};
      int ans = fairSplits(arr, n);
      System.out.println(ans);
    }
}
