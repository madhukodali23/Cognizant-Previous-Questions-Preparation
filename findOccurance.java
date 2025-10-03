import java.util.*;
class Main {
    public static int findOccurance(String s1, String s2)
    {
      int count = 0;
      int idx = s1.indexOf(s2);
      while (idx != -1)
      {
          count++;
          idx = s1.indexOf(s2, idx+1);
      }
      return count;
    }
    public static void main(String[] args) {
        String s1 = "Always Joe in Friends Joe with Joe Joe";
        String s2 = "Joe";
        System.out.println(findOccurance(s1, s2));
    }
}
