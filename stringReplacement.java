
class Main {
    public static String StringReplacement(String s)
    {
        int i = 0;
        int n = s.length();
        StringBuilder temp = new StringBuilder();
        while (i < n)
        {
           int j = i;
            while (j < n && s.charAt(i) == s.charAt(j))
            {
                j++;
            }
            int length = j - i;
            if (length >= 2)
            {
                if (temp.length() == 0 || temp.charAt(temp.length()-1)!= '#')
                {
                    temp.append("#");
                }
                
            }else{
                temp.append(s.charAt(i));
            }
            i = j;
        }
        return temp.toString();
    }
    public static void main(String[] args) {
        String s = "aabbbccdeeea";
        String temp = StringReplacement(s);
        System.out.println(temp);
    }
}
