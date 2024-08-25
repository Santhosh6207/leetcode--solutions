class Solution {
    public int crob(int idx, int nums[], int end, int dp[]) {
        if (idx == end)
            return nums[idx];
        if (idx > end)
            return 0;
        if (dp[idx] != -1)
            return dp[idx];
        int pick = nums[idx] + crob(idx + 2, nums, end, dp);
        int notpick = crob(idx + 1, nums, end, dp);
        return dp[idx] = Math.max(pick, notpick);
    }

    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];
        
        int dp1[] = new int[n];
        int dp2[] = new int[n];
        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);
        
        int res1 = crob(0, nums, n - 2, dp1); // Exclude the last house
        int res2 = crob(1, nums, n - 1, dp2); // Exclude the first house
        
        return Math.max(res1, res2);
    }
}
