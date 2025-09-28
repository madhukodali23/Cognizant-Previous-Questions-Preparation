import java.util.*;
class Main{
    public static int fruitsFrequency(String s)
    {
        HashMap<Character, Integer> hm = new HashMap<>();
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0)+1);
        }
        for(int count : hm.values()) {
            if (count % 2 == 0) {
                minimum = Math.min(minimum, count);
            }else
            {
                maximum = Math.max(maximum, count);
            }
        }
        System.out.println(maximum + " " + minimum);
        return Math.abs(maximum-minimum);
    }
    public static void main(String args[])
    {
        String input1 = "arrrrtfu";
        int res = fruitsFrequency(input1);
        System.out.println(res);
    }
    
}
