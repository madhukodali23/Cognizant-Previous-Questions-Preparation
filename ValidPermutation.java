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
        String s = "CDF";
        int length = removeVowelsAndGetLength(s);
        System.out.println(factorial(length));
    }
}
