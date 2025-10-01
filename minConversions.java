
class Main {
    public static int minConversions(String s)
    {
        int mismatch1 = 0;
        int mismatch2 = 0;
        int n = s.length();
        for(int i=0;i<n;i++)
        {
            char expected1 = (i % 2  == 0) ? 'X' : 'Y';
            char expected2 = (i % 2  == 0) ? 'Y' : 'X';
            
            if (expected1 != s.charAt(i)) mismatch1++;
            if (expected2 != s.charAt(i)) mismatch2++;
        }
        return Math.min(mismatch1, mismatch2);
    }
    public static void main(String[] args) {
        String s = "XXYYXXY";
        int temp = minConversions(s);
        System.out.println(temp);
    }
}
