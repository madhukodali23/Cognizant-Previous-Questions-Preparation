import java.util.*;
class Main {
    public static String findFrequentPairs(String s)
    {
        if (s == null || s.isEmpty()) return "";
        String[] words = s.split("\\s+");
        LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();
        int maximum = Integer.MIN_VALUE;
        for(int i=0;i<words.length;i++)
        {
            if (words[i].length() > 0) {
                String temp ="";
                int len = words[i].length();
                temp += words[i].charAt(0);
                temp += words[i].charAt(len-1);
                hm.put(temp, hm.getOrDefault(temp, 0)+1);
                maximum = Math.max(maximum, hm.get(temp));
            }
        }
        StringBuilder res = new StringBuilder();
        for(String key: hm.keySet()) {
            if (hm.get(key) == maximum)
            {
                res.append(key);
                res.append(" ");
            }
        }
       return res.toString().trim();
    }
    public static void main(String[] args) {
        String s = "she is good grid god and ground player plotter";
      System.out.println(findFrequentPairs(s));
    }
}
