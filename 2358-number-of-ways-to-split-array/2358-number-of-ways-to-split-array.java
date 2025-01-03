class Solution {
    public int waysToSplitArray(int[] nums) {
        long prev[]=new long[nums.length];
        prev[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            prev[i]=prev[i-1]+nums[i];
        }
        int ans=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(prev[i]>=prev[nums.length-1]-prev[i])
             ans++;
        }
        return ans;
    }
}