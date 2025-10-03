import java.util.*;
class Main {
    public static String palindrome(int num)
    {
        int temp = num;
        if (num < 0) 
        {
            return "Invalid Input";
        }
        int sum = 0;
        while (num != 0)
        {
            int rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
        }
        
        if (temp == sum) {
            return "Palindrome";
        }
        return "Not a Palindrome";
    }
    public static void main(String[] args) {
        int n = 21212;
        System.out.println(palindrome(n));
    }
}
