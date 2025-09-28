import java.util.*;
class Main{
    public static int maximumAlphabets(String s, int n)
    {
        HashMap<Character, Integer> hm = new HashMap<>();
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        int max = Integer.MIN_VALUE;
        int ans = -1;
        for(int i=0;i<n;i++)
        {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0)+1);
        }
        for(int key: hm.values())
        {
            tm.put(key, tm.getOrDefault(key,0)+1);
        }
        int maximum = Collections.max(tm.values());
        if (maximum == 1) {
            return tm.firstKey();
        }
      
        for(int key: tm.keySet())
        {
            if (tm.get(key) == maximum)
            {
                ans = key;
                break;
            }
        }
        
      return ans;
    }
    public static void main(String args[])
    {
        int n = 20;
        String s = "ACABDDABDCDACFAEGFDA";
        System.out.println(maximumAlphabets(s, n));
    }
}
