import java.util.*;
class Main {
    public static int barkTypes(String s)
    {
        String parts[] = s.split("\\.+");
        Set<String> k = new HashSet<>();
        for(String temp : parts)
        {
           if (!temp.isEmpty())
           {
               k.add(temp);
           }
        }
        return k.size();
    }
    public static void main(String[] args) {
        String s = "B...BB...BBB.";
        int temp = barkTypes(s);
        System.out.println(temp);
    }
}
