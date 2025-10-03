
class Main {
    public static long  series(long n)
    {
        if (n == 1) return 0;
        if (n == 2) return 0;
        if (n == 3) return 1;
        long first = 0;
        long second = 0;
        long third = 1;
        for(long i=4;i<=n;i++)
        {
            long current = first+second+third;
            first = second;
            second= third;
            third = current;
        }
        return third;
    }
    public static void main(String[] args) {
        System.out.println(series(11));
    }
}
