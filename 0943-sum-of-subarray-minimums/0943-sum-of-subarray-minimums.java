import java.util.ArrayList;
import java.util.Stack;

class Solution {
    int mod = 1000000007;

    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int[] al = new int[n]; // al stores the index of previous less element
        int[] al1 = new int[n]; // al1 stores the index of next less element
        Stack<Integer> st = new Stack<>();

        // Finding the previous less element index for each element
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i])
                st.pop();
            al[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        st.clear();

        // Finding the next less element index for each element
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i])
                st.pop();
            al1[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        long sum = 0;

        // Calculating the sum of subarray minimums
        for (int i = 0; i < n; i++) {
            int left = i - al[i]; // elements to the left including itself
            int right = al1[i] - i; // elements to the right including itself
            sum = (sum + (long) arr[i] * left * right) % mod;
        }

        return (int) sum;
    }

   }