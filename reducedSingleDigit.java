class Main {
    public static int reducedSingleDigit(int n)
    {
        while (n >= 10) {
            int sum = 0;
            while(n != 0)
            {
                 int rem = n % 10;
                 sum += rem;
                 n = n / 10;
            }
            n = sum;
        }
        return n;
    }
    public static void main(String[] args) {
        int n = 38;
        int res = reducedSingleDigit(n);
        System.out.println(res);
    }
}
