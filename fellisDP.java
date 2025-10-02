class Main {
    public static long fellisDP(int n)
    {
        long m = 1000000007;
        long[] f = new long[n+1];
        if(n == 0 || n == 1) 
        {
            return 1;
        }
        f[0] = 1;
        f[1] = 1;
        for(int i=2;i<=n;i++)
        {
            f[i] = (f[i-1] + 7 * f[i-2] + (i / 4)) % m;
        }
        return f[n];
    }
    public static void main(String[] args) {
        int n = 4;
        long res = fellisDP(n);
        System.out.println(res);
    }
}
