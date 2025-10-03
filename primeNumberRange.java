import java.util.*;
class Main {
    public static boolean isPrime(int num)
    {
        if (num <= 1) {
            return false;
        }
        int j = 2;
        while (j*j <= num)
        {
            if (num % j == 0)
            {
                return false;
            }
            j++;
        }
        return true;
    }
    public static String primeNumbers(int a, int b)
    {
        String ans = "";
        if (a >= b || a < 1 || b < 1)
        {
            return "Provide valid input";
        }
        for(int i = a;i<=b;i++)
        {
            if (isPrime(i))
            {
                ans += Integer.toString(i) + " ";
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 15;
        System.out.println(primeNumbers(a, b));
    }
}
