class Main {
    public static int NthLargest(int arr[],int n, int k)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        return arr[n-k];
    }
    public static void main(String[] args) {
        int n = 5;
        int k = 3;
        int arr[] = {11, -1, -4, 12, -6}; // -6 -4 -1 11 12
       int ans =  NthLargest(arr, n, k);
       System.out.println(ans);
    }
}
