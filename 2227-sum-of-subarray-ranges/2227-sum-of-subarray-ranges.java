import java.util.TreeSet;

class Solution {
    public long subArrayRanges(int[] nums) {
        long sum = 0;
        int n = nums.length;

        // Iterate through each starting index of the subarray
        for (int i = 0; i < n; i++) {
            TreeSet<Integer> ts = new TreeSet<>();
            // Iterate through each ending index of the subarray
            for (int j = i; j < n; j++) {
                ts.add(nums[j]);
                // The maximum and minimum in the current subarray
                int minVal = ts.first();
                int maxVal = ts.last();
                // Add the range to the sum
                sum += maxVal - minVal;
            }
        }

        return sum;
    }
}