class Main {
    public static int starSum(int arr[],int n)
    {
        int temp[] = new int[2];
        int maximum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                boolean c1 = arr[i] + arr[j] == 18;
                boolean c2 = arr[i] > arr[j];
                boolean c3 = arr[i] * arr[j] > maximum;
                if (c1 && c2 && c3)
                {
                    maximum = arr[i] * arr[j];
                    temp[0] = arr[i];
                    temp[1] = arr[j];
                }
            }
        }
        System.out.println(temp[0] + " " + temp[1]);
        return 0;
    }
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {20, 16, 2, 1, 5};
        starSum(arr, n);
    }
}
