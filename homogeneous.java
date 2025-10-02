
class Main {
    public static int homogeneousLayers(String s)
    {
        int layerSize = 1;
        int count = 0;
        int n = s.length();
        int pos = 0;
        while (layerSize + pos <= n)
        {
            String temp = s.substring(pos, pos+layerSize);
            System.out.println(temp);
            boolean isHomogeneous  = true;
            for(int i=1;i<temp.length();i++)
            {
                if (temp.charAt(0) != temp.charAt(i))
                {
                    isHomogeneous = false;
                    break;
                }
            }
            if (isHomogeneous) {
                count++;
            }
            pos += layerSize;
            layerSize += 1;
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "aaabbbcccdddddd";
        int ans = homogeneousLayers(s);
        System.out.println(ans);
    }
}
