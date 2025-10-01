
class Main {
    public static int wrappedItems(String s)
    {
        int count = 0;
        for(int i=1;i<s.length()-1;i++)
        {
            char ch = s.charAt(i);
            boolean isLeft = Character.isDigit(s.charAt(i-1));
            boolean isRight = Character.isDigit(s.charAt(i+1));
           if (Character.isLowerCase(ch) && isLeft && isRight) 
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "5aart6i7io8o5o56";
        System.out.println(wrappedItems(s));
    }
}
