import java.util.*;
class Main { 
    public static int totalPulseCount(int n, int arr[])
    {
        Stack<Integer> st = new Stack<>();
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            if (st.empty()  || arr[i] <= st.peek()) {
                st.push(arr[i]);
            }
            else {
                while (!st.empty() && arr[i] > st.peek())
                {
                    st.pop();
                    sum += 1;
                }
                st.push(arr[i]);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 6;
        int strengths[] = {3, 2, 1, 4,5,5};
        System.out.println(totalPulseCount(n, strengths));
    }
}
