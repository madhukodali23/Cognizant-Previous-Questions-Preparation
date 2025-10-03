import java.util.*;
class Main {
    public static String findSeason(int n) {
       if (n < 1 || n > 12) {
           return "Invalid month";
       }
       else if (n >= 3 && n <= 5)
       {
           return "Spring";
       }
       else if (n >= 6 && n <= 8)
       {
           return "Summer";
       }
       else if (n >= 9 && n <= 11)
       {
           return "Autumn";
       }
       else{
           return "Winter";
       }
    }
    public static void main(String[] args) {
        int n = 11;
        System.out.println(findSeason(n));
    }
}
