
class Main {
    public static void main(String[] args) {
        int n = 4;
        int arr[][] = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12},{13, 14, 15, 16}};
        int rowAns = Integer.MIN_VALUE;
        int colAns = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int rowSum = 0;
            int colSum = 0;
            for(int j=0;j<n;j++)
            {
                rowSum += arr[i][j];
                colSum += arr[j][i];
            }
            rowAns = Math.max(rowAns, rowSum);
            colAns = Math.max(colAns, colSum);
        }
        System.out.println(rowAns + colAns);
    }
}
