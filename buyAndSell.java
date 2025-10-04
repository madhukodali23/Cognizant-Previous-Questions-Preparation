import java.util.*;
class Main {
    public static void buyAndSell(int n, int arr[])
    {
        long min = Integer.MAX_VALUE;
        long sum = 0;
       for(int i=0;i<n;i++)
       {
        sum += arr[i];
        min = Math.min(min, sum);
       }
       System.out.println(min);
    }
    public static void main(String[] args) {
     int n = 5;
      int arr[] = {-39957,-17136,35466,21820,-26711};
      buyAndSell(n, arr);
    }
}
