import java.util.*;
class Main {
    public static int countMappings(String s)
    {
        int n = s.length();
        int count = 0;
        
        for(int i=0;i<n;i++)
        {
            if (s.charAt(i) != '0') {
                count++;
            }
        }
        
        for(int i=0;i<n;i++)
        {
            if (i + 1 < n)
            {
                int num = Integer.parseInt(s.substring(i, i+2));
                if (num >= 10 && num <= 26) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
       String s = "000";
       System.out.println(countMappings(s));
    }
}
