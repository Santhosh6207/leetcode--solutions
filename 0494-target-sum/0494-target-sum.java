class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return solve(nums,target,0,0);
    }
    public int solve(int ar[],int target,int idx,int sum)
    {
        if(idx>=ar.length)
        {
            return sum==target?1:0;
        }
        int sub=solve(ar,target,idx+1,sum-ar[idx]);
        int add=solve(ar,target,idx+1,sum+ar[idx]);
        return sub+add;
    }
}