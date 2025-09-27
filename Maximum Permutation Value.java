import java.util.*;
class Main {
    
    public static int factorial(int n)
    {
        if (n == 0) return 1;
        return n * factorial(n-1);
    }
    
    
    public static int removeVowelsAndGetLength(String s)
    {
        String ans = s.replaceAll("(?i)[a,e,i,o,u]", "");
        return ans.length();
    }
    
    public static void main(String[] args) {
        String arr[] = {"Madhu", "World"};
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            int length = removeVowelsAndGetLength(arr[i]);
            ans = Math.max(ans, length);
        }
        System.out.println(factorial(ans));
    }
}
