class Solution {
    public int maxProduct(int[] nums) {
        long prefix = 1;
        long suffix = 1;
        int n = nums.length;
        long maxi = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (prefix == 0) {
                prefix = 1;
            }
            if (suffix == 0) {
                suffix = 1;
            }

            prefix *= nums[i];
            suffix *= nums[n - i - 1];

            if(prefix < Integer.MAX_VALUE && suffix < Integer.MAX_VALUE) //as it's clear in quest that ans will be within 32-bit
                maxi = Math.max(maxi, Math.max(prefix, suffix));
        }

        return (int) maxi; 
    }
}
