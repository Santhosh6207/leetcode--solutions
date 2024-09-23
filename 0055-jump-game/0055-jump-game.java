class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1)
          return true;
        int maxindex=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i>maxindex)
              return false;
              else
               maxindex=Math.max(maxindex,i+nums[i]);
        }

        return true;
    }
}