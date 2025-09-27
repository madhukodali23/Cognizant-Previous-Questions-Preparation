import java.util.*;
class Main {
    public static void main(String[] args) {
         String s = "abcaba";
         StringBuilder ans = new StringBuilder("");
         HashMap<Character, Integer> hm = new HashMap<>();
         for(int i=0;i<s.length();i++)
         {
             if (!hm.containsKey(s.charAt(i)))
             {
                 hm.put(s.charAt(i), i+1);
             }
         }
         
         for(int i=0;i<s.length();i++)
         {
             char ch = s.charAt(i);
             for(int j=0;j<hm.get(ch);j++)
             {
                 ans.append(ch);
             }
             ans.append("-");
         }
         if (s.length() == 0) {
             System.out.println("");
         }
         else{
             System.out.println(ans.substring(0, ans.length()-1));
         }
    }
}
