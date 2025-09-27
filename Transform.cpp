import java.util.*;
class Main {
    public static void SubArraySumTriplets(String s1, String s2)
    {
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        
        for(char c : s1.toCharArray())
        {
            freq1[c-'A']++;
        }
        
        for(char c : s2.toCharArray())
        {
            freq2[c-'A']++;
        }
        
        int cost = 0;
        for(int i=0;i<26;i++)
        {
            if (freq2[i] > freq1[i])
            {
                cost += freq2[i] - freq1[i];
            }
        }
       System.out.println(cost);
    }
    
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "XYZYY";
        SubArraySumTriplets(s1, s2);
    }
}
