import java.util.*;

class Main {
    public static int countDigitSubstrings(String s)
    {
        int n = s.length();
        int i = 0;
        int count = 0;
        while (i < n)
        {
            if (Character.isDigit(s.charAt(i)))
            {
                int start = i;
                while (i < n && Character.isDigit(s.charAt(i)))
                {
                    i++;
                }
                int end = i - 1;
                if (start > 0 && end < n-1)
                {
                    if (Character.isLetter(s.charAt(start-1)) &&
                    Character.isLetter(s.charAt(end+1)))
                    {
                        count++;
                    }
                }
            }
            else{
                i++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        String s = "b1c22d333f";
        System.out.println(countDigitSubstrings(s));
    }
}
