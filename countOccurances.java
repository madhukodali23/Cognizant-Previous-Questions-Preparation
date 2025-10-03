import java.util.*;
class Main {
    public static int countOccurances(String s)
    {   
        int digit = 0;
        int alpha = 0;
        int special = 0;
        int space = 0;
        for(int i = 0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) digit++;
            else if (Character.isLetter(ch)) alpha++;
            else if (Character.isWhitespace(ch)) space++;
            else special++;
        }
        System.out.println("Alphabets - " + alpha);
        System.out.println("Digits - " + digit);
        System.out.println("Space - " + space);
        System.out.println("Special Character - " + special);
        return 0;
    }
    public static void main(String[] args) {
        String s = "Amcatuff@ #% 123";
        countOccurances(s);
    }
}
