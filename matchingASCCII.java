import java.util.*;
class Main { 
    public static int matchingASCIIDigits(int n, int arr[], String s)
    {
        int count = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            hs.add(arr[i]);
        }
        
        int k = s.length();
        for(int i=0;i<k;i++)
        {
            int ascii = s.charAt(i);
            int ones = ascii % 10;
            int tens = ascii / 10;
            if (hs.contains(ones) || hs.contains(tens))
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 6;
        int arr[] = {1,6,4,3,6,5};
        String s = "ABCDEF";
        System.out.println(matchingASCIIDigits(n, arr, s));
    }
}
