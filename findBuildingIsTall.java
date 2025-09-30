

class Main {
    public static int totalHeight(int n, int heights[], int d)
    {
       int sum = 0;
       for(int i=0;i<n;i++)
       {
           boolean leftOk = i-d < 0 || heights[i] > heights[i-d];
           boolean rightOk = i+d >= n || heights[i] > heights[i+d];
           if (leftOk && rightOk)
           {
               sum += heights[i];
           }
       }
       return sum;
    }
    public static void main(String[] args) {
       int n = 6;
       int heights[] = {1,3, 2, 1, 5, 4};
       int d = 2;
       System.out.println(totalHeight(n, heights, d));
    }
}
