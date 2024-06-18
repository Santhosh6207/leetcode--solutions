class Solution {
    public int minPatches(int[] nums, int n) {
        long miss=1;
        int patches=0;
        int idx=0;
        while(miss<=n)
        {
            if(idx<nums.length&&nums[idx]<=miss){
            miss+=nums[idx];
            idx++;
            }
            else
            {
                miss+=miss;
                patches++;
            }
        }
        return patches;
    }
}