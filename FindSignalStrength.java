class Main{
    public static int[] signalStrengths(int n,int[] arr)
    {
        int ans[] = new int[n];
        for(int i=0;i<n;i++)
        {
            if (arr[(i-1+n)%n] > arr[i])
            {
                ans[i]++;
            }
            if (arr[(i+1)%n] > arr[i])
            {
                ans[i]++;
            }
        }
        return ans;
    }
    public static void main(String args[])
    {
        int input1[] = {10, 15, 12, 9, 14};
        int n = 5;
        int ans[] = signalStrengths(n, input1);
        for(int i=0;i<n;i++)
        {
            System.out.println(ans[i] + " ");
        }
    }
    
}
