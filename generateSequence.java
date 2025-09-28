class Main{
    public static void main(String args[])
    {
        int input1[] = {1, 2, 3, 4, 5, 6};
        int n = 10;
        int ans[] = generateNextSequence(n, input1);
        for(int i=0;i<n;i++)
        {
            System.out.println(ans[i] + " ");
        }
    }
    
    public static int[] generateNextSequence(int n, int input1[])
    {
        int ans[] = new int[n];
        for(int i=0;i<input1.length;i++)
        {
            ans[i] = input1[i];
        }
        for(int k = input1.length;k<n;k++)
        {
            ans[k] = ans[k-1] + ans[k-2];
        }
        return ans;
    }
}
