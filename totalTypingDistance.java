
class Main {
    public static int totalTypingDistance(String s)
    {
        int n = s.length();
        int distance = 0;
        for(int i=0;i<n-1;i++)
        {
            int ch1 = s.charAt(i)-'a';
            int ch2 = s.charAt(i+1)-'a';
            distance += Math.abs(ch1-ch2);
        }
        return distance;
    }
    public static void main(String[] args) {
        String s = "cba";
        int temp = totalTypingDistance(s);
        System.out.println(temp);
    }
}
