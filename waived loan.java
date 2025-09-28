import java.util.*;
class Main{
    public static int WaivedLoan(int arr[][], int n)
    {
        TreeMap<Integer, Integer> hm = new TreeMap<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int num = arr[i][j];
                hm.put(num, hm.getOrDefault(num, 0)+1);
            }
        }
        for(int k : hm.keySet())
        {
            if (k > 0) {
                if (hm.get(k) == 1)
                {
                    return k;
                }
            } 
        }
        return -1;
       
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=3;
        int arr[][] = {{2, 2, 1}, {2, 3, 4}, {3, 4, 5}};
        System.out.println(WaivedLoan(arr, n));
    }
    
}
