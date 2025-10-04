import java.util.*;
class Main {
    public static void main(String[] args) {
        String s = "aabccccddd";
        StringBuilder ans = new StringBuilder();
        TreeMap<Character, Integer> hm = new TreeMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        for(char ch : hm.keySet())
        {
            ans.append(ch);
            ans.append(hm.get(ch));
        }
        System.out.println(ans);
    }
}
